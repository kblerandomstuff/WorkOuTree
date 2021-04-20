package ovh.krs.madgp.ui.myinfo;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import java.util.ArrayList;

import ovh.krs.madgp.DBHelper;
import ovh.krs.madgp.DateHistory;
import ovh.krs.madgp.R;

public class myinfoFragment extends Fragment {

    private myinfoViewModel myinfoViewModel;
    private DBHelper db;
    private ListView listView;
    private EditText et_kg, et_m;
    private TextView BMI;
    private int kg,m;
    private Button bt_up;

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

        et_kg = root.findViewById(R.id.et_kg);
        et_m = root.findViewById(R.id.et_m);
        BMI = root.findViewById(R.id.BMI);

        bt_up = root.findViewById(R.id.bt_up);
        bt_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BMI.setText(String.valueOf(et_kg));
                Integer.parseInt(et_kg.getText().toString());
                Integer.parseInt(et_m.getText().toString());
                BMI.setText(String.valueOf(kg/m^2));
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