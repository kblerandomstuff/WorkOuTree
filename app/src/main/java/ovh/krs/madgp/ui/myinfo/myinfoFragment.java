package ovh.krs.madgp.ui.myinfo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import java.lang.Math;
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
    private TextView BMI;
    private ListView l;

    public myinfoFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        myinfoViewModel = new ViewModelProvider(this).get(myinfoViewModel.class);
        View root = inflater.inflate(R.layout.fragment_myinfo, container, false);
        SharedPreferences hpref = getContext().getSharedPreferences("mybody", 0);
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
        if (hpref.getInt("50", -1)!=-1){
            h.setText(String.valueOf(hpref.getInt("50", -1))+" cm");
        } else {
            h.setText("No record");
        }
        if (hpref.getInt("100", -1)!=-1){
            w.setText(String.valueOf(hpref.getInt("100", -1))+" kg");
        } else {
            w.setText("No record");
        }
        if ((hpref.getInt("50", -1)!=-1)&&(hpref.getInt("100", -1)!=-1)){
            BMI.setText(String.valueOf((100*100*hpref.getInt("100", -1)) / Math.pow(hpref.getInt("50", -1),2)));
        } else {
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
        return root;
    }

}