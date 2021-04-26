package ovh.krs.madgp.ui.myhis;

import android.content.SharedPreferences;
import android.database.MatrixCursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cursoradapter.widget.SimpleCursorAdapter;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import java.util.ArrayList;

import ovh.krs.madgp.R;

import static java.lang.String.valueOf;

public class myhisFragment extends Fragment {

    private myhisViewModel myhisViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        myhisViewModel = new ViewModelProvider(this).get(myhisViewModel.class);
        View root = inflater.inflate(R.layout.fragment_myhis, container, false);
        SharedPreferences hpref = getContext().getSharedPreferences("woh", 0); // 0 - for private mode
        ListView l = root.findViewById(R.id.list);
        ArrayList<wohis> alldata = new ArrayList();
        for (int i=0;i<50;i++){
            if (hpref.getString(valueOf(i), null)!=null){
            alldata.add(i,new wohis(hpref.getString(valueOf(i), null),hpref.getString(valueOf(50+i), null)));}
        }
        MyDataListAdapter adapter = new MyDataListAdapter (getContext(), alldata);
        l.setAdapter(adapter);
        return root;
    }

}