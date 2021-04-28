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

public class wod7Fragment extends Fragment {
    String woname = "Lunge and Burpee";
    public wod7Fragment() {
        // Required empty public constructor
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
        editor.putLong("duration", 80000);
        editor.putString("woname", woname);
        editor.commit();
        tv.setText(woname);
        TextView dtv = view.findViewById(R.id.dtv);
        dtv.setText("To do the Lunge Burpee, start standing tall and then place your hands on the ground and jump your feet back into a high plank position." +
                "Jump back into the plank and then jump your feet back into your hands as quickly as you can without being sloppy in the plank position. Stand up, and as you stand up, jump into a lunge on one side. You want to land in a lunge, sinking as low as you can and then jump out of the lunge to repeat the burpee."+
                "Jump back into plank and then jump back up, lunging on the other side this time. Keep alternating sides with each burpee."+
                "Beginners can step into a lunge and even step back into plank instead of jumping.\n\nIn the following time, please do it for 10 times.");
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