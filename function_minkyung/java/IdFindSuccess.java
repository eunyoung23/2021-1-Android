package com.sungshin.publicmoney;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class IdFindSuccess extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle saveInstancesState){
        super.onCreate(saveInstancesState);
        setContentView(R.layout.id_find_success);
    }

    public void mOnClick(View v) {
        switch (v.getId()) {
            case R.id.button_id_success_login:
                startActivity(new Intent(this,Login.class));
                break;
            case R.id.button_id_success_pw_find:
                startActivity(new Intent(this,PwFind.class));
                break;
        }
    }
}

