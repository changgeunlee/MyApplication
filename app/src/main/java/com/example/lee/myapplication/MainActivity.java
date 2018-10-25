package com.example.lee.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this, LoadingActivity.class);
        startActivity(intent);
    }

    public void onButton1Clicked(View v) {
        Toast.makeText(getApplicationContext(), "축심!!", Toast.LENGTH_LONG).show();

    }

    public void onButton2Clicked(View v) {
        Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
        startActivity(intent);
        //Toast.makeText(getApplicationContext(), "메뉴 이동!", Toast.LENGTH_LONG).show();
    }
}
