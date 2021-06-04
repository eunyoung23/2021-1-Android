package com.sungshin.publicmoney;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }

        public void mOnClick(View v) {
            switch (v.getId()) {
                //로그인하기
                case R.id.button_login:
                    //정보가 일치하면
                    startActivity(new Intent(this,Home.class));
                    //일치하지 않으면
                    showAlert(false);
                    break;

            }
        }

        void showAlert(Boolean b) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            if(b != true) {
                builder.setTitle(" ").setMessage("아이디 혹은 비밀번호가\n정확하지 않습니다.\n다시 한 번 시도해주세요.");
            }
            builder.setPositiveButton("확인", yesButtonClickListener);

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        }
        // 확인 버튼 눌렀을 때의  실행
        private DialogInterface.OnClickListener yesButtonClickListener = new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //startActivity(new Intent(this,Login.class));
            }
        };
}