package com.example.meeting;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class make2 extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.make2);


        TextView Pw = (TextView)findViewById(R.id.pw);
        String pw = getRandomPassword(8);
        Pw.setText(pw);
        //DB에 pw 저장하기
    }


    public void mOnClick(View v){
        TextView Pw = (TextView)findViewById(R.id.pw);

        switch (v.getId()){
            case R.id.paste:
                ClipboardManager clipboard = (ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("",Pw.getText());
                clipboard.setPrimaryClip(clip);
                break;

            case R.id.main:
                Intent intent2 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent2);
                //setContentView(R.layout.activity_main);
                break;
        }
    }


    //랜덤 비밀번호 생성하기
    public static String getRandomPassword(int length)
    {
        String[] passwords = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z",
                "a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        StringBuilder builder = new StringBuilder("");
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            builder.append(passwords[random.nextInt(passwords.length)]);
        }
        return builder.toString();
    }

}
