package com.example.lee.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.kakao.usermgmt.LoginButton;

public class MainActivity extends AppCompatActivity {
    private Context mContext;
    private LoginButton join_kakao_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, LoadingActivity.class);
        startActivity(intent);
        setContentView(R.layout.activity_main);
        mContext = getApplicationContext();

        join_kakao_btn = (LoginButton) findViewById(R.id.join_kakao_btn);
        join_kakao_btn.performClick();
        Toast.makeText(this, "MainActivity onCreate called", Toast.LENGTH_SHORT).show();
    }

    public void onLoginBtnClicked(View v) {
        Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "로그인!", Toast.LENGTH_LONG).show();
    }

    public void onJoinBtnClicked(View v) {
        Toast.makeText(getApplicationContext(), "회원가입!", Toast.LENGTH_LONG).show();
    }

    public void onJoinNaverBtnClicked(View v) {
        Toast.makeText(getApplicationContext(), "네이버 회원가입!", Toast.LENGTH_LONG).show();
    }

    public void onJoinGoogleBtnClicked(View v) {
        Toast.makeText(getApplicationContext(), "구글 회원가입!", Toast.LENGTH_LONG).show();
    }

    public void onJoinKakaoBtnClicked(View v) {

        Toast.makeText(getApplicationContext(), "카카오톡 회원가입!", Toast.LENGTH_LONG).show();
    }


}
