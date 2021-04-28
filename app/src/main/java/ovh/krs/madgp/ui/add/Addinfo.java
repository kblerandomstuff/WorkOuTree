 package ovh.krs.madgp.ui.add;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import ovh.krs.madgp.R;
import androidx.appcompat.app.AppCompatActivity;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.String.valueOf;


public class Addinfo extends AppCompatActivity {

    private EditText et_kg, et_m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addinfo);
        SharedPreferences epref = getApplicationContext().getSharedPreferences("mybody", 0);
        SharedPreferences.Editor editor = epref.edit();
        String[] g = {"Male", "Female"};
        et_kg = findViewById(R.id.et_kg);
        et_m = findViewById(R.id.et_m);
        Button btn = findViewById(R.id.button);
        Spinner spin = (Spinner) findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                editor.putString("gender", g[position]);
                editor.commit();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
            });
        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, g);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String tss = dateFormat.format(new Date()); // Find todays date
                    if (epref.getString("0", "") != null) {
                        for (int i = 49; i > -1; i--) {
                            editor.putString(valueOf(i + 1), epref.getString(valueOf(i), null));
                            editor.putInt(valueOf(i + 51), epref.getInt(valueOf(50 + i), -1));
                            editor.putInt(valueOf(i + 101), epref.getInt(valueOf(100 + i), -1));
                        }
                    }
                    editor.putString(valueOf(0), tss);
                    editor.putInt(valueOf(50), Integer.valueOf(et_m.getText().toString()));
                    editor.putInt(valueOf(100), Integer.valueOf(et_kg.getText().toString()));
                    editor.commit();
                    Toast.makeText(getApplicationContext(), "Information Saved, please refresh My Body Information to view change", Toast.LENGTH_SHORT).show();
                    finish();
                } catch(Exception e){
                    Toast.makeText(getApplicationContext(), "Please fill in all the information", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
