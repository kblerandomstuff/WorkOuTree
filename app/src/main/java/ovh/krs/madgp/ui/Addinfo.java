 package ovh.krs.madgp.ui;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import ovh.krs.madgp.R;
import androidx.appcompat.app.AppCompatActivity;


import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.String.valueOf;


public class Addinfo extends AppCompatActivity {

    private TextView mTextView;
    private EditText et_kg, et_m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addinfo);
        SharedPreferences epref = getApplicationContext().getSharedPreferences("mybody", 0);
        SharedPreferences.Editor editor = epref.edit();


        mTextView = (TextView) findViewById(R.id.text);
        et_kg = findViewById(R.id.et_kg);
        et_m = findViewById(R.id.et_m);
        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String tss = dateFormat.format(new Date()); // Find todays date
                if (epref.getString("0", "")!=null){
                    for (int i = 49;i > -1;i--){
                        editor.putString(valueOf(i+1), epref.getString(valueOf(i), null) );
                        editor.putInt(valueOf(i+51), epref.getInt(valueOf(50+i), -1) );
                        editor.putInt(valueOf(i+101), epref.getInt(valueOf(100+i), -1) );
                    }
                }
                editor.putString(valueOf(0), tss);
                editor.putInt(valueOf(50), Integer.valueOf(et_m.getText().toString()) );
                editor.putInt(valueOf(100), Integer.valueOf(et_kg.getText().toString()) );
                editor.commit();
                Toast.makeText(getApplicationContext(), "Information Saved, please refresh My Body Information to view change", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}