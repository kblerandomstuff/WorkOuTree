package ovh.krs.madgp.ui.mycollection;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import ovh.krs.madgp.R;

public class mycolFragment extends Fragment {

    private mycolViewModel mycolViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mycolViewModel = new ViewModelProvider(this).get(mycolViewModel.class);
        View root = inflater.inflate(R.layout.fragment_myinfo, container, false);
        return root;
    }

}