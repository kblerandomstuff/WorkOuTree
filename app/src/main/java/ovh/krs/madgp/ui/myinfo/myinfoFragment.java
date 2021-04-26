package ovh.krs.madgp.ui.myinfo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


import java.util.ArrayList;

import ovh.krs.madgp.R;
import ovh.krs.madgp.ui.add.Addinfo;

import static java.lang.String.valueOf;


public class myinfoFragment extends Fragment {

    private myinfoViewModel myinfoViewModel;
    //private DBHelper db;
    //private ListView listView;
    private TextView BMI;
    //private int kg,m;
    //private Button bt_up;
    private ListView l;

    public myinfoFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        myinfoViewModel = new ViewModelProvider(this).get(myinfoViewModel.class);
        View root = inflater.inflate(R.layout.fragment_myinfo, container, false);
        SharedPreferences hpref = getContext().getSharedPreferences("mybody", 0); // 0 - for private mode
        ListView l = root.findViewById(R.id.list);
        ArrayList<bi> alldata = new ArrayList();
        for (int i=0;i<50;i++){
            if (hpref.getString(valueOf(i), null)!=null){
                alldata.add(i,new bi(hpref.getString(valueOf(i), null),hpref.getInt(valueOf(50+i), -1),hpref.getInt(valueOf(100+i), -1)));}
        }
        MyiListAdapter adapter = new MyiListAdapter (getContext(), alldata);
        l.setAdapter(adapter);

        BMI = root.findViewById(R.id.tvbmi);
        TextView g = root.findViewById(R.id.tvg);
        g.setText(hpref.getString("gender", "No record"));
        TextView h = root.findViewById(R.id.tvh);
        TextView w = root.findViewById(R.id.tvw);
        try {
            h.setText(String.valueOf(hpref.getInt("50", -1)));
        } catch (Exception e){
            BMI.setText("No record");
        }
        try {
            w.setText(String.valueOf(hpref.getInt("100", -1)));
        } catch (Exception e){
            BMI.setText("No record");
        }

        try {
            BMI.setText(String.valueOf(hpref.getInt("100", -1) / (hpref.getInt("50", -1) * 100) ^ 2));
        } catch (Exception e){
            BMI.setText("No record for calculation");
        }
        FloatingActionButton fab = root.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Addinfo.class);
                startActivity(intent);
            }
        });
/*
        Button btn = root.findViewById(R.id.button);
        btn.setVisibility(View.INVISIBLE);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DateHistory.class);
                startActivity(intent);
            }
        });*/
        return root;
    }

}