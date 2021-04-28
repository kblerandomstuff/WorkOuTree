package ovh.krs.madgp.wo;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.text.SimpleDateFormat;
import java.util.Date;
import ovh.krs.madgp.R;
import static java.lang.String.valueOf;

public class wofFragment extends Fragment {

    public wofFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_wof, container, false);
        SharedPreferences gpref = getContext().getSharedPreferences("AppPref", 0);
        SharedPreferences hpref = getContext().getSharedPreferences("woh", 0);
        SharedPreferences.Editor editor = hpref.edit();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String tss = dateFormat.format(new Date());
        if (hpref.getString("0", "")!=null){
            for (int i = 49;i > -1;i--){
                editor.putString(valueOf(i+1), hpref.getString(valueOf(i), null) );
                editor.putString(valueOf(i+51), hpref.getString(valueOf(50+i), null) );
            }
        }
        editor.putString(valueOf(0), tss);
        editor.putString(valueOf(50), gpref.getString("woname", "") );
        if (hpref.getInt("wocount", -1)==-1){
            editor.putInt("wocount", 1 );
        }else {
            editor.putInt("wocount", hpref.getInt("wocount", 1)+1 );
        }
        editor.commit();
        Button btna = view.findViewById(R.id.btn_a);
        Button btnb = view.findViewById(R.id.btn_b);
        btna.setOnClickListener(new View.OnClickListener() {
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
        btnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().finish();
            }
        });

        return view;
    }

}