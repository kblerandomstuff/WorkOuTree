package ovh.krs.madgp.ui.myinfo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


import java.util.ArrayList;

import ovh.krs.madgp.DBHelper;
import ovh.krs.madgp.R;
import ovh.krs.madgp.ui.Addinfo;
import ovh.krs.madgp.ui.myhis.MyDataListAdapter;
import ovh.krs.madgp.ui.myhis.wohis;

import static java.lang.String.valueOf;


public class myinfoFragment extends Fragment {

    private myinfoViewModel myinfoViewModel;
    private DBHelper db;
    private ListView listView;
    private EditText et_kg, et_m;
    private TextView BMI;
    private int kg,m;
    private Button bt_up;
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

        //BMI = root.findViewById(R.id.BMI);
/*
        bt_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BMI.setText(String.valueOf(et_kg));
                Integer.parseInt(et_kg.getText().toString());
                Integer.parseInt(et_m.getText().toString());
                BMI.setText(String.valueOf(kg/m^2));
            }
        }); */

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