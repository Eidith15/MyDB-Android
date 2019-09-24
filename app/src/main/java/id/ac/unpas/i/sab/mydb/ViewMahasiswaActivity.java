package id.ac.unpas.i.sab.mydb;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

/**
 * Created by admin601 on 3/13/2018.
 */

public class ViewMahasiswaActivity extends AppCompatActivity {
    ListView myListView;
    protected DatabaseHelper dbHelper;
    protected SQLiteDatabase db;

    protected void onCreate(Bundle savenInstance) {
        super.onCreate(savenInstance);
        setContentView(R.layout.activity_view_mahasiswa);
        myListView = (ListView) findViewById(R.id.lsMhs);
        dbHelper = new DatabaseHelper(this);
        db = dbHelper.getWriteableDatabase();
        try{
            loadDataMahasiswa();
        }catch (Exception e){
            Log.e("Masuk", "->"+e.getMessage());
        }
    }
}
