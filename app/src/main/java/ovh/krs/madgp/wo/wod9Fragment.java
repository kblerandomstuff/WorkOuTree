package ovh.krs.madgp.wo;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import ovh.krs.madgp.DBHelper;
import ovh.krs.madgp.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link wod9Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class wod9Fragment extends Fragment {
    private DBHelper db;
    String woname = "Lunge and Mountain Climber Combo";
    public wod9Fragment() {
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
        TextView tv = view.findViewById(R.id.wodtv);
        SharedPreferences pref = getContext().getSharedPreferences("AppPref", 0); // 0 - for private mode
        SharedPreferences.Editor editor = pref.edit();
        db = new DBHelper(getContext());
        //set workout duration
        editor.putLong("duration", 90000);
        editor.putString("woname", woname);
        editor.commit();
        //work out detail
        tv.setText(woname);
        db.insertContact("Lunge and Mountain Climber Combo",10);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                timerFragment f = (timerFragment) fm.findFragmentByTag("timerFragment");
                if (f == null) {
                    f = new timerFragment();
                    fm.beginTransaction()
                            .replace(R.id.fragment, f,"timerFragment")
                            .commit();
                }
            }
        });
        return view;
    }

}