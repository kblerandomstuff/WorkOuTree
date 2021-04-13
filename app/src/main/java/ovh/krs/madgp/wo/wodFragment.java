package ovh.krs.madgp.wo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import ovh.krs.madgp.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link wodFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class wodFragment extends Fragment {

    public wodFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_wod, container, false);
        Button btn = view.findViewById(R.id.btn_a);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                timerFragment f = (timerFragment) fm.findFragmentByTag("timerFragment");
                if (f == null) {
                    f = new timerFragment();

                    fm.beginTransaction()
                            .replace(R.id.fragment, f,"timerFragment")
                            //.addToBackStack(null);  // uncomment this line if you want to be able to return to the prev. fragment with "back" button
                            .commit();
                }
            }
        });
        return view;
    }

}