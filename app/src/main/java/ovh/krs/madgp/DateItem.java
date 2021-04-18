package ovh.krs.madgp;

import java.util.ArrayList;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class DateItem extends Activity {

    // This gives us access to the database
    private DBHelper db;

    // The view that shows a list in the XML
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Load all contacts from the database
        db = new DBHelper(this);
        ArrayList<String> arrayList = db.getDate();

        // Build an ArrayAdapter to show a list of items
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, arrayList);

        // Connect the ArrayAdapter with the List View from XML
        listView = (ListView) findViewById(R.id.listView1);
        listView.setAdapter(dataAdapter);

        // Create all the objects listeners
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        // Create the ListView listener
        listView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int pos, long l) {

                // Get the ID of the item in the list that was selected
                String dateSearch = listView.getItemAtPosition(pos).toString();

                // Go to DisplayContact activity with ID value
                Bundle dataBundle = new Bundle();
                dataBundle.putString("date", dateSearch);
                Intent intent = new Intent(getApplicationContext(), DateHistory.class);
                intent.putExtras(dataBundle);
                startActivity(intent);
            }
        });
    }
}