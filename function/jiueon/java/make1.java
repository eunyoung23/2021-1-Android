package com.example.meeting;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class make1 extends Activity{
    EditText Name;
    EditText Tel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.make1);


    }


    public void mOnClick(View v){
        Name = findViewById(R.id.name);
        Tel = findViewById(R.id.tel);
        switch (v.getId()){
            //취소버튼 눌렀을 때
            case R.id.cancel:
                Name.setText(" ");
                Tel.setText(" ");
                Toast.makeText(this, "모임 생성 취소", Toast.LENGTH_LONG).show();
                //메인페이지로 돌아가기
                setContentView(R.layout.activity_main);
                break;

            case R.id.success:
                showAlert();
        }
    }


    //가입 확인 알림창
    void showAlert(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(" ").setMessage(Name.getText()+" 모임을 생성하겠습니까?");

        //취소
        builder.setNeutralButton("Cancel", (DialogInterface dialog, int id)->{
            Toast.makeText(getApplicationContext(), "모임 생성 취소", Toast.LENGTH_SHORT).show();
            setContentView(R.layout.activity_main);
        });

        //완료
        builder.setPositiveButton("OK", (DialogInterface dialog, int id)->{
            //DB에 저장(이름, 전화번호, 비밀번호, 사용자id)



            Toast.makeText(getApplicationContext(), Name.getText() +" 모임 생성 완료", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(getApplicationContext(), make2.class);
            startActivity(intent);
        });


        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }



}
