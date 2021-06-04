package com.sungshin.publicmoney;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class IdFind extends AppCompatActivity {
    EditText Name;
    EditText Tel;
    @Override
    protected void onCreate(Bundle saveInstancesState){
        super.onCreate(saveInstancesState);
        setContentView(R.layout.id_find);
    }

    public void mOnClick(View v){
        Name = findViewById(R.id.edit_id_find_name);
        Tel = findViewById(R.id.edit_id_find_tel);
        switch (v.getId()) {
            //아이디찾기 버튼을 눌렀을 때
            case R.id.button_id_find:
                //일치하는 정보가 있을 경우
                //startActivity(new Intent(this,IdFindSuccess.class));
                //일치하는 정보가 없을 경우
                startActivity(new Intent(this,IdFindFail.class));
                break;
        }
    }
}
