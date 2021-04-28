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


public class wod10Fragment extends Fragment {
    String woname = "Push-up To Side Plank";
    public wod10Fragment() {
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
        editor.putLong("duration", 70000);
        editor.putString("woname", woname);
        editor.commit();
        tv.setText(woname);
        TextView dtv = view.findViewById(R.id.dtv);
        dtv.setText("Begin in plank position." +
                "Bend your elbows lowering into a push-up." +
                "Straighten your arms and lift your right arm toward the ceiling, twisting into a side plank to make a T shape with your body." +
                "Rotate back to plank, placing your right palm on the floor to lower into a push-up." +
                "This time as you straighten your arms, rotate to the left lifting the left up. Return to plank." +
                "Continue this exercise for 45 seconds, alternating between sides. Rest for 15 seconds.\n\nIn the following time, please do it for 10 times.");
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