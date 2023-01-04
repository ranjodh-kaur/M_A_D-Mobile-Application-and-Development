package com.example.calculator_app;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class database extends SQLiteOpenHelper{

    private static final String dbname="signup.db";

    public database(@Nullable Context context) {
        super(context, dbname, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String q = "create table users (_id integer primary key autoincrement, name text , Email text,  Password text)";
        sqLiteDatabase.execSQL(q);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table if exists users");
        onCreate(sqLiteDatabase);

    }

    public boolean insert_data(String Email, String name, String Password){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues c = new ContentValues();
        c.put("name", name);
        c.put("Email", Email);
        c.put("Password", Password);
        long r = db.insert("users",null,c);
        if (r==-1) return false;
        else
            return true;
    }
}
