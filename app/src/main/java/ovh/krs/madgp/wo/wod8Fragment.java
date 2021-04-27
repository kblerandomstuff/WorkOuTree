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
 * Use the {@link wod8Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class wod8Fragment extends Fragment {
    private DBHelper db;
    String woname = "Push-Up To Pike";
    public wod8Fragment() {
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
        editor.putLong("duration", 80000);
        editor.putString("woname", woname);
        editor.commit();
        //work out detail
        tv.setText(woname);
        TextView dtv = view.findViewById(R.id.dtv);
        dtv.setText("Start off at the top of a pushup position on the floor, with your arms straight and your hands should be shoulder-width apart. Then lift your hips and walk your feet in closer to your hands so that your body forms an upside down V. Your legs and arms should stay as straight as possible." +
                "From here, bend your elbows and lower your upper body down and forwards, until the top of your head nearly touches the floor. Your head should be infront of your hands once your elbows bend. Imagine, your hands are the bottom two points of a triangle, and your head moves forward as you lower down to make the top point of the triangle."+
                "From the bottom position, push down into the floor hard with your hands and keep your elbows in close to your body to straighten your arms and return to the start position. Make sure that as you push your body upwards, you maintain the angle at your hips rather than pressing your chest away from the floor and collapsing at the hips.\n\nIn the following time, please do it for 10 times.");
        db.insertContact("Push-Up To Pike",10);
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