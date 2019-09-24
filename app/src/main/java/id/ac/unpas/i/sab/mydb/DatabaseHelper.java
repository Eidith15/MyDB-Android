package id.ac.unpas.i.sab.mydb;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by admin601 on 3/13/2018.
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "DataMahasiswa";
    private final static String TABLES[] = {"nrp", "nama", "prodi"};
    private final static String NAMA_TABLE = "table_mahasiswa";

    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
    }
    public void createMahasiswaTable(SQLiteDatabase db){
        db.execSQL("CREATE TABLE if not exists "+NAMA_TABLE
                    +"(nrp TEXT PRIMARY KEY, nama TEXT, prodi TEXT);");
        Log.e("MSG : ", "succes");
    }
    public void insertDataMahasiswa(SQLiteDatabase db, String nrp, String nama, String prodi){
        ContentValues contentValues = new ContentValues();
        contentValues.put("nrp", nrp);
        contentValues.put("nama", nama);
        contentValues.put("prodi", prodi);
        db.insert(NAMA_TABLE, null, contentValues);
        Log.e("MSG : ","success");
    }

}
