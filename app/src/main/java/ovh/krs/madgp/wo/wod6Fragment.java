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
import ovh.krs.madgp.R;


public class wod6Fragment extends Fragment {
    String woname = "Knees To Chest";
    public wod6Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_wod, container, false);
        Button btn = view.findViewById(R.id.btn_a);
        TextView tv = view.findViewById(R.id.wodtv);
        SharedPreferences pref = getContext().getSharedPreferences("AppPref", 0); // 0 - for private mode
        SharedPreferences.Editor editor = pref.edit();
        editor.putLong("duration", 110000);
        editor.putString("woname", woname);
        editor.commit();
        tv.setText(woname);
        TextView dtv = view.findViewById(R.id.dtv);
        dtv.setText("Lie on your back with your legs extended and back straight. Keep you hips level and your lower back down on the floor.Bend your right knee and hug your knee towards your chest, placing hands on your right leg. Then breath deeply and hold this position for 10-30 seconds. Now, relax and lower the knee to starting position and repeat on opposite side.\n\nIn the following time, please do it for 3 times.");
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