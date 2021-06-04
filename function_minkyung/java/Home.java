package com.sungshin.publicmoney;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle saveInstancesState) {
        super.onCreate(saveInstancesState);
        setContentView(R.layout.home);
    }

    public void mOnClick(View v) {
        switch (v.getId()){
            //나의 모임
            case R.id.button_main_my_meeting:
                //startActivity(new Intent(this,list.class));
                break;
            //모임 개설
            case R.id.button_main_meeting_create:
                //startActivity(new Intent(this,make1.class));
                break;
            //모임 가입
            case R.id.button_main_meeting_join:
                //startActivity(new Intent(this,join.class));
                break;
            //모임 알림
            case R.id.alarm:
                //startActivity(new Intent(this,      ));
                break;
            //로그아웃
            case R.id.logout:
                startActivity(new Intent(this,Login.class));
                break;
        }
    }
}
