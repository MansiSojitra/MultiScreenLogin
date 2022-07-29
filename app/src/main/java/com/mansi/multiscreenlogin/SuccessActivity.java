package com.mansi.multiscreenlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SuccessActivity extends Activity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        tv=findViewById(R.id.tv);

        Intent ii = getIntent();
        String user = ii.getStringExtra("myuser");

        tv.setText("WELCOME USER : "+user);

    }
}