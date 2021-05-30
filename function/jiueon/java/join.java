package com.example.meeting;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class join extends Activity {
    EditText Name;
    EditText Pw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.join);

    }


    public void mOnClick(View v){
        Name = findViewById(R.id.name);
        Pw = findViewById(R.id.pw);

        switch (v.getId()){
            case R.id.cancel:
                Name.setText(" ");
                Pw.setText(" ");
                Toast.makeText(this, "모임 가입 취소", Toast.LENGTH_LONG).show();
                //메인페이지로 돌아가기
                setContentView(R.layout.activity_main);
                break;

            case R.id.success:
                //DB에 저장된 정보와 입력된 정보가 같은지 확인

                //다를경우 올바르지 않습니다 경고창창
                //showAlert(false);

                //맞을 경우
                showAlert(true);


//
//                Toast.makeText(this, Name.getText() +" 모임 가입 완료", Toast.LENGTH_LONG).show();
//                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
//                startActivity(intent);
                break;
        }
    }

    //가입 확인 알림창
    void showAlert(Boolean b){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);


        if(b){//정보가 옳을 경우
            //DB에 정보 저장하기



            setContentView(R.layout.activity_main);
            builder.setTitle(" ").setMessage("'"+ Name.getText()+"' 가입되었습니다.");

        }else{//정보가 틀릴경우
            builder.setTitle(" ").setMessage("인증번호가 올바르지 않습니다.");
        }

        builder.setPositiveButton("확인", (DialogInterface dialog, int id)->{
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }




}

