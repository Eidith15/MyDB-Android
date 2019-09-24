package id.ac.unpas.i.sab.mydb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by admin601 on 3/13/2018.
 */

public class MainActivity extends AppCompatActivity{
    ListView listView;
    String arrMenu[] = {"addData", "View Data", "Logout"};
    @Override
    protected void onCreate(Bundle savenInstanceState) {
        super.onCreate(savenInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.lsView);
        listView.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, arrMenu));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0 :
                        startActivity(new Intent(MainActivity.this,
                                AddMahasiswaActivity.class));
                        break;
                    case 1 :
                        startActivity(new Intent(MainActivity.this,
                                ViewMahasiswaActivity.class));
                        break;
                    case 2 :
                        Session.logout(MainActivity.this);
                        startActivity(new Intent(MainActivity.this,
                                SignInActivity.class));
                        finish();
                        break;
                }
            }
        });
    }
}
