package id.ac.unpas.i.sab.mydb;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Thread background = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                    Intent intent = null;
                    SharedPreferences preferences = SplashScreenActivity.this
                            .getSharedPreferences(Session.PREF_NAME,0);
                    try{
                        String id = preferences.getString("username", null);
                        Log.e("username", id);
                        Intent = new Intent(SplashScreenActivity.this, MainActivity.class);
                    }catch (Exception e){
                        intent = new Intent(SplashScreenActivity.this, SignInActivity.class);
                    }
                    startActivity(intent);
                    finish();
                }catch (Exception ignored){}
            }
        };
        background.start();
    }
}
