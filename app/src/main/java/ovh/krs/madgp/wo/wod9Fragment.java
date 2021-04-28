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
        TextView dtv = view.findViewById(R.id.dtv);
        dtv.setText("Start in a plank position with arms and legs long.Beginning in a solid plank is the key to proper form and good results in the Mountain Climber. Keep your abs pulled in and your body straight. Squeeze your glutes and pull your shoulders away from your ears.As the knee draws to the chest, pull your abs in even tighter to be sure your body doesn’t sag or come out of its plank position.At the same time you push your right leg back, pull your left knee in to the chest using the same form.Pull the knees in right, left, right, left—always switching simultaneously so that you are using a “running” motion.As you begin to move more quickly be in constant awareness of your body position and be sure to keep a straight line in your spine and don’t let your head droop. Core body stability is crucial.\n\nIn the following time, please do it for 10 times.");
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