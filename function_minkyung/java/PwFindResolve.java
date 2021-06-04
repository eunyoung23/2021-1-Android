package com.sungshin.publicmoney;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class PwFindResolve extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle saveInstancesState){
        super.onCreate(saveInstancesState);
        setContentView(R.layout.pw_find_resolve);
    }
    public void mOnClick(View v) {
        switch (v.getId()) {
            case R.id.button_pw_resolve_login:
                startActivity(new Intent(this,Login.class));
                break;
        }
    }
}
