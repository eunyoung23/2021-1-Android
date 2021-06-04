package com.sungshin.publicmoney;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class PwFind extends AppCompatActivity {
    EditText Name;
    EditText Tel;
    EditText Id;

    @Override
    protected void onCreate(Bundle saveInstancesState) {
        super.onCreate(saveInstancesState);
        setContentView(R.layout.pw_find);
    }

    public void mOnClick(View v) {
        Name = findViewById(R.id.edit_pw_find_name);
        Tel = findViewById(R.id.edit_pw_find_tel);
        Id = findViewById(R.id.edit_pw_find_id);

        switch (v.getId()) {
            //비밀번호 찾기 버튼을 눌렀을 떄
            case R.id.button_pw_find:
                // 정보가 일치했을 떄
                startActivity(new Intent(this, PwFindResolve.class));
                // 정보가 일치하지 않았을 떄
                showAlert(false);
                break;
        }
    }

    void showAlert(Boolean b) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        if(b == false) {
            builder.setTitle(" ").setMessage("정보를 다시 입력해주세요.");
        }
        builder.setPositiveButton("확인", yesButtonClickListener);

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
    //확인 버튼을 눌렀을 때 실행
    private DialogInterface.OnClickListener yesButtonClickListener = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            //startActivity(new Intent(this,PwFind.class));
        }
    };
}
