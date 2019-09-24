package id.ac.unpas.i.sab.mydb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by admin601 on 3/13/2018.
 */

public class SignInActivity extends AppCompatActivity {
    EditText us, pass;
    @Override
    protected void onCreate(Bundle savenInstanceState) {
        super.onCreate(savenInstanceState);
        setContentView(R.layout.activity_sign_in);
        us = (EditText) findViewById(R.id.username);
        pass = (EditText) findViewById(R.id.password);
        findViewById(R.id.btnSignIn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = us.getText().toString().trim();
                String pswd = pass.getText().toString().trim();
                if (user.equalsIgnoreCase("Admin") && pswd.equalsIgnoreCase("Admin")){
                    Session.createSignInSession(SignInActivity.this, user);
                    startActivity(new Intent(SignInActivity.this, MainActivity.class));
                    finish();
                }else{
                    Toast.makeText(SignInActivity.this, "User invalis", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
