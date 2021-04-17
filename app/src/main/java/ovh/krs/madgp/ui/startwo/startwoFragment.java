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
import ovh.krs.madgp.wo.wo3activity;
import ovh.krs.madgp.wo.wo4activity;
import ovh.krs.madgp.wo.wo5activity;
import ovh.krs.madgp.wo.wo6activity;
import ovh.krs.madgp.wo.wo7activity;
import ovh.krs.madgp.wo.wo8activity;
import ovh.krs.madgp.wo.wo9activity;
import ovh.krs.madgp.wo.wo10activity;
import ovh.krs.madgp.wo.wo11activity;
import ovh.krs.madgp.wo.wo12activity;
import ovh.krs.madgp.wo.wo13activity;
import ovh.krs.madgp.wo.wo14activity;
import ovh.krs.madgp.wo.wo15activity;

public class startwoFragment extends Fragment {

    CardView wo1,wo2,wo3,wo4,wo5,wo6,wo7,wo8,wo9,wo10,wo11,wo12,wo13,wo14,wo15;

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
                Intent intent = new Intent(getActivity(), wo3activity.class);
                startActivity(intent);
            }
        });
        wo4 = root.findViewById(R.id.card_wo4);
        wo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), wo4activity.class);
                startActivity(intent);
            }
        });
        wo5 = root.findViewById(R.id.card_wo5);
        wo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), wo5activity.class);
                startActivity(intent);
            }
        });
        wo6 = root.findViewById(R.id.card_wo6);
        wo6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), wo6activity.class);
                startActivity(intent);
            }
        });
        wo7 = root.findViewById(R.id.card_wo7);
        wo7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), wo7activity.class);
                startActivity(intent);
            }
        });
        wo8 = root.findViewById(R.id.card_wo8);
        wo8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), wo8activity.class);
                startActivity(intent);
            }
        });
        wo9 = root.findViewById(R.id.card_wo9);
        wo9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), wo9activity.class);
                startActivity(intent);
            }
        });
        wo10 = root.findViewById(R.id.card_wo10);
        wo10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), wo10activity.class);
                startActivity(intent);
            }
        });
        wo11 = root.findViewById(R.id.card_wo11);
        wo11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), wo11activity.class);
                startActivity(intent);
            }
        });
        wo12 = root.findViewById(R.id.card_wo12);
        wo12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), wo12activity.class);
                startActivity(intent);
            }
        });
        wo13 = root.findViewById(R.id.card_wo13);
        wo13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), wo13activity.class);
                startActivity(intent);
            }
        });
        wo14 = root.findViewById(R.id.card_wo14);
        wo14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), wo14activity.class);
                startActivity(intent);
            }
        });
        wo15 = root.findViewById(R.id.card_wo15);
        wo15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), wo15activity.class);
                startActivity(intent);
            }
        });


        return root;


    }
}