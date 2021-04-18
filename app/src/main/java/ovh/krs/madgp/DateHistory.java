package ovh.krs.madgp;

import java.sql.Date;
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

public class DateHistory extends Activity {

    // This gives us access to the database
    private DBHelper db;

    // The view that shows a list in the XML
    private ListView listView;
    Bundle dataBundle = this.getIntent().getExtras();
    String date = dataBundle.toString();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Load all contacts from the database
        db = new DBHelper(this);
        ArrayList<String> arrayList = db.getAllContacts(date);

        // Build an ArrayAdapter to show a list of items
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, arrayList);

        // Connect the ArrayAdapter with the List View from XML
        listView = (ListView) findViewById(R.id.listView1);
        listView.setAdapter(dataAdapter);
    }
}