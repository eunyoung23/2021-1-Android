package com.sungshin.publicmoney;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Sign extends AppCompatActivity {
    Button b1;
    @Override
    protected void onCreate(Bundle saveInstancesState){
        super.onCreate(saveInstancesState);
        setContentView(R.layout.sign);

        b1 = (Button) findViewById(R.id.sign);
        b1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v){
                AlertDialog.Builder dlg = new AlertDialog.Builder(Sign.this);
                dlg.setMessage("회원가입을 축하드립니다.");
                dlg.setPositiveButton("ok", null);
                dlg.show();
            }
        });
    }
    public void mOnClick(View v) {
        switch (v.getId()) {
            case R.id.check:
                //동일한 아이디 있을 경우
                //동일한 아이디 없을 경우
                break;
            case R.id.sign:
                //회원가입 축하메세지
                break;
        }
    }
}