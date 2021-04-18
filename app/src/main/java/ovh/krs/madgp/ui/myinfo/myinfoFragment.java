package ovh.krs.madgp.ui.myinfo;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

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



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        myinfoViewModel = new ViewModelProvider(this).get(myinfoViewModel.class);
        View root = inflater.inflate(R.layout.fragment_myinfo, container, false);
        Button btn = root.findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DateHistory.class);
                startActivity(intent);
            }
        });
        return root;
    }

}