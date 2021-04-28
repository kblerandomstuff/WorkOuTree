package ovh.krs.madgp.wo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;

import java.util.concurrent.TimeUnit;

import ovh.krs.madgp.R;
import ovh.krs.madgp.wo.wo1activity;

public class timerFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_timer, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SharedPreferences pref = getContext().getSharedPreferences("AppPref", 0);

        TextView tv = view.findViewById(R.id.tv_timer);
        Button btn = view.findViewById(R.id.btn_start);
        ProgressBar pb = (ProgressBar) view.findViewById(R.id.progressBar);
        long duration = pref.getLong("duration", 1000);
        String ds = String.format("%02d:%02d",
                TimeUnit.MILLISECONDS.toMinutes(duration) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(duration)),
                TimeUnit.MILLISECONDS.toSeconds(duration) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(duration)));
        tv.setText(ds);
        pb.setProgress(0);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn.setVisibility(View.INVISIBLE);
                CountDownTimer  countDownTimer = new CountDownTimer(duration, 1000) {

                    public void onTick(long millisUntilFinished) {
                        long millis = millisUntilFinished;
                        pb.setMax(Long.valueOf(duration).intValue());
                        pb.setProgress(Long.valueOf(duration-(millis-1000)).intValue());
                        String cs = String.format("%02d:%02d",
                                TimeUnit.MILLISECONDS.toMinutes(millis) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millis)),
                                TimeUnit.MILLISECONDS.toSeconds(millis) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis)));
                        tv.setText(cs);

                    }

                    public void onFinish() {
                        FragmentManager fm = getFragmentManager();
                        wofFragment f = (wofFragment) fm.findFragmentByTag("wofFragment");
                        if (f == null) {
                            f = new wofFragment();

                            fm.beginTransaction()
                                    .replace(R.id.fragment, f,"wofFragment")
                                    .commit();
                        }
                    }
                }.start();
            }
        });


    }
    public void onBackPressed() {
    }
}