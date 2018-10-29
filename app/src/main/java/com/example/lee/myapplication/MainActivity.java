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

    public void onLoginBtn1Clicked(View v) {
        Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "로그인!", Toast.LENGTH_LONG).show();

    }

    public void onJoinBtn1Clicked(View v) {
        Toast.makeText(getApplicationContext(), "회원가입!", Toast.LENGTH_LONG).show();
    }

    public void onJoinBtn2Clicked(View v) {
        Toast.makeText(getApplicationContext(), "심판 전용 회원가입!", Toast.LENGTH_LONG).show();
    }

    public void onJoinBtn3Clicked(View v) {
        Toast.makeText(getApplicationContext(), "네이버 회원가입!", Toast.LENGTH_LONG).show();
    }

}
