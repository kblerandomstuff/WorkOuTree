package ovh.krs.madgp.ui.startwo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import ovh.krs.madgp.R;

public class startwoFragment extends Fragment {

    private startwoViewModel startwoViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        startwoViewModel = new ViewModelProvider(this).get(startwoViewModel.class);
        View root = inflater.inflate(R.layout.fragment_startwo, container, false);
        return root;
    }

}