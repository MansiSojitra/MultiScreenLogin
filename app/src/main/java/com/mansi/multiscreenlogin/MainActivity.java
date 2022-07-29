package com.mansi.multiscreenlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    EditText etUser;
    EditText etPass;
    Button btLogin , btCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUser = findViewById(R.id.etUser);
        etPass = findViewById(R.id.etPass);
        btLogin = findViewById(R.id.btLogin);
        btCancel = findViewById(R.id.btCancel);

        btCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etUser.setText("");
                etPass.setText("");
            }
        });

       btLogin.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String user = etUser.getText().toString();
               String pass = etPass.getText().toString();

               if(user.equals("compact") && pass.equals("android")){
                   Intent ii =new Intent(getApplicationContext(),SuccessActivity.class);
                   ii.putExtra("myuser",user);
                   startActivity(ii);
               }
           }
       });

    }
}