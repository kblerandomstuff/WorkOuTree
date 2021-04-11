package ovh.krs.madgp.ui.myinfo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import ovh.krs.madgp.R;

public class myinfoFragment extends Fragment {

    private myinfoViewModel myinfoViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        myinfoViewModel = new ViewModelProvider(this).get(myinfoViewModel.class);
        View root = inflater.inflate(R.layout.fragment_myinfo, container, false);
        return root;
    }

}