package ovh.krs.madgp.wo;

import android.database.Cursor;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import java.util.ArrayList;

import ovh.krs.madgp.DBHelper;
import ovh.krs.madgp.R;

public class HomeFragment extends Fragment {
    private ImageView home_imageView;
    private Button home_btn1, home_btn2, home_btn3, history_list_btn;
    private AnimationDrawable slideShowAnimation;
    private ProgressBar pgb;
    private DBHelper db;
    /*
    private Bundle dataBundle = getIntent().getExtras();
    String date = dataBundle.toString();

     */

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        home_imageView = view.findViewById(R.id.home_imageView);
        pgb = view.findViewById(R.id.determinateBar);
        history_list_btn = view.findViewById(R.id.history_list_btn);
        history_list_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container,new HistoryListHomeFragment());
                fr.commit();
            }
        });



        //db = new DBHelper(getContext());
        // db.getAllContacts(date);





        return view;

    }



}
