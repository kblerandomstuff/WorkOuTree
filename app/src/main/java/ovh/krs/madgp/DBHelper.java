package ovh.krs.madgp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;

import java.util.ArrayList;

public class DBHelper extends SQLiteOpenHelper {
    // If you change the database schema, you must increment the database version.
    public static final int DATABASE_VERSION = 1;
    // Name of database
    private static final String DATABASE_NAME = "MyDBName.db";

    // Column containing unique ID number
    private static final String CONTACTS_COLUMN_ID = "id";

    // Columns containing details of contacts
    public static final String CONTACTS_COLUMN_NAME = "name";
    public static final String CONTACTS_COLUMN_DATE = "date";
    public static final String CONTACTS_COLUMN_TIME = "time";
    public static final String CONTACTS_COLUMN_SECOND = "second";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME , null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table contacts " +
                "(id integer primary key autoincrement, name text, second integer, date date DEFAULT CURRENT_DATE, time time DEFAULT CURRENT_TIME)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS contacts");
        onCreate(db);
    }

    public boolean insertContact(String name, int second) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", "q");
        contentValues.put("second", 5);
        db.insert("contacts", null, contentValues);
        return true;
    }

    public ArrayList<String> getAllContacts(String date) {

        // Create an ArrayList which will store the contacts from the database
        ArrayList<String> arrayList = new ArrayList<String>();

        // Use Cursor which will iterate through each record in database
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery("select * from contacts where date =" +date, null );
        c.moveToFirst();

        // Go though each contact
        while (!c.isAfterLast()) {

            // Get details from database and put into ArrayList
            String s = c.getString(c.getColumnIndex(CONTACTS_COLUMN_NAME)) +
                    " " + c.getString(c.getColumnIndex(CONTACTS_COLUMN_TIME))+
                    " "+ c.getString(c.getColumnIndex(CONTACTS_COLUMN_SECOND));
            arrayList.add(s);
            c.moveToNext();
        }
        return arrayList;
    }

    public ArrayList<String> getDate() {

        // Create an ArrayList which will store the contacts from the database
        ArrayList<String> arrayList = new ArrayList<String>();

        // Use Cursor which will iterate through each record in database
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery("select date from contacts group by date order by date desc", null );
        c.moveToFirst();

        // Go though each contact
        while (!c.isAfterLast()) {

            // Get details from database and put into ArrayList
            String s = c.getString(c.getColumnIndex(CONTACTS_COLUMN_DATE));
            arrayList.add(s);
            c.moveToNext();
        }
        return arrayList;
    }
}
