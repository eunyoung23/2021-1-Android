package com.example.a2021_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MemoActivity extends AppCompatActivity {
    private EditText mTitleEditText;
    private EditText mContentsEditText;
    private long mMemoId = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memo);
        mTitleEditText = findViewById(R.id.title_edit);
        mContentsEditText = findViewById(R.id.contents_edit);

        Intent intent = getIntent();
        if(intent != null){
            mMemoId = intent.getLongExtra("id",-1);
            String title = intent.getStringExtra("title");
            String contents = intent.getStringExtra("contents");

            mTitleEditText.setText(title);
            mContentsEditText.setText(contents);
        }
    }

    @Override
    public void onBackPressed() {
        String title = mTitleEditText.getText().toString();
        String contents = mContentsEditText.getText().toString();

        //sqlite에 저장함
        ContentValues contentValues = new ContentValues();
        contentValues.put(MemoContract.MemoEntry.COLUMN_NAME_TITLE,title);
        contentValues.put(MemoContract.MemoEntry.COLUMN_NAME_CONTENTS,contents);

        SQLiteDatabase db = MemoDbHelper.getInstance(this).getWritableDatabase();
        if(mMemoId == -1){
            long newRowId = db.insert(MemoContract.MemoEntry.TABLE_NAME,
                    null,
                    contentValues);

            if( newRowId == -1){
                Toast.makeText(this,"저장에 문제가 생겼습니",Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(this,"계좌 내역이 저장되었습니다.",Toast.LENGTH_LONG).show();
                setResult(RESULT_OK);
            }
        }else {
            int count = db.update(MemoContract.MemoEntry.TABLE_NAME,contentValues,
                    MemoContract.MemoEntry. _ID+"="+mMemoId,null);
            if(count == 0){
                Toast.makeText(this,"수정에 문제가 생겼습니다",Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(this,"수정이 성공적으로 완료되었습니다",Toast.LENGTH_LONG).show();
                setResult(RESULT_OK);
            }
        }


        super.onBackPressed();
    }

}