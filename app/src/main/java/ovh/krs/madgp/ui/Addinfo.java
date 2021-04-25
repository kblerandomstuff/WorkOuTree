 package ovh.krs.madgp.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import ovh.krs.madgp.R;
import androidx.appcompat.app.AppCompatActivity;

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
                if (epref.getString("0", "")!=null){
                    for (int i = 49;i > -1;i--){
                        editor.putString(valueOf(i+1), epref.getString(valueOf(i), null) );
                        editor.putString(valueOf(i+51), epref.getString(valueOf(50+i), null) );
                    }
                }
                editor.putInt(valueOf(0), Integer.valueOf(et_kg.getText().toString()) );
                editor.putInt(valueOf(50), Integer.valueOf(et_m.getText().toString()) );
                Toast.makeText(getApplicationContext(), "Information Saved", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}