package com.example.a2021_final;

import android.provider.BaseColumns;

import androidx.annotation.NonNull;

//테이블 정보를 담을 계약 클래스를 만
public class MemoContract {
    private MemoContract(){

    }

    public static class MemoEntry implements BaseColumns{
       public static final String TABLE_NAME = "memo";
       public static final String COLUMN_NAME_TITLE = "title";
       public static final String COLUMN_NAME_CONTENTS = "contents";
    }
}
