package com.sungshin.publicmoney;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class IdFindFail extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle saveInstancesState){
        super.onCreate(saveInstancesState);
        setContentView(R.layout.id_find_fail);
    }

    public void mOnClick(View v){
        switch (v.getId()) {
            case R.id.button_id_fail_sign:
                startActivity(new Intent(this,Sign.class));
                break;
        }
    }
}
