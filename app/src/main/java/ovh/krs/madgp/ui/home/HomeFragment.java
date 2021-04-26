package ovh.krs.madgp.ui.home;

import android.content.ContentProviderClient;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;

import ovh.krs.madgp.DBHelper;
import ovh.krs.madgp.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private ImageView home_imageView;
    private ProgressBar pgb;
    private Button history_list_btn;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        home_imageView = root.findViewById(R.id.home_imageView);
        pgb = root.findViewById(R.id.determinateBar);
        history_list_btn = root.findViewById(R.id.history_list_btn);
        history_list_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                HistoryListHomeFragment historyListHomeFragment = new HistoryListHomeFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction()
                        .replace(R.id.nav_host_fragment, historyListHomeFragment, historyListHomeFragment.getTag())
                        .commit();
            }
        });

        return root;
    }

}



