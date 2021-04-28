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


public class wod5Fragment extends Fragment {
    String woname = "Cross-body Plank";
    public wod5Fragment() {
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
        editor.putLong("duration", 90000);
        editor.putString("woname", woname);
        editor.commit();
        tv.setText(woname);
        TextView dtv = view.findViewById(R.id.dtv);
        dtv.setText("Cross Body Planks is a core body exercise that strengthens all the muscle in your abdominals, lower back as well as arms and shoulders. The unique part of the Cross Body Plank is the cross-under motion of the knee toward the opposite elbow. This engages your oblique muscles that shape your waistline and strengthen you core strength and stability. Any type of plank is great for training your core, but if you learn how to do Cross Body Planks, you are getting a move that targets virtually every muscle of your core in a very powerful way. You won’t need to do many of these to get results!");
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