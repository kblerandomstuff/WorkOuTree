package ovh.krs.madgp.ui.startwo;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import ovh.krs.madgp.R;
import ovh.krs.madgp.wo.wo1activity;
import ovh.krs.madgp.wo.wo2activity;

public class startwoFragment extends Fragment {

    CardView wo1,wo2,wo3;

    private startwoViewModel startwoViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        startwoViewModel = new ViewModelProvider(this).get(startwoViewModel.class);
        View root = inflater.inflate(R.layout.fragment_startwo, container, false);
        wo1 = root.findViewById(R.id.card_wo1);
        wo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), wo1activity.class);
                startActivity(intent);
            }
        });
        wo2 = root.findViewById(R.id.card_wo2);
        wo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), wo2activity.class);
                startActivity(intent);
            }
        });
        wo3 = root.findViewById(R.id.card_wo3);
        wo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), wo2activity.class);
                startActivity(intent);
            }
        });

        return root;


    }
}