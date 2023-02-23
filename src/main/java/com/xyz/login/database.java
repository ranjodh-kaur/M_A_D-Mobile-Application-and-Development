package com.xyz.login;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class database extends SQLiteOpenHelper {
    private final static String dbname = "Signup.db";

    public database(@Nullable Context context) {
        super(context, dbname, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public Boolean insert_data(String fname, String lname, String user, String pass) {
        return null;
    }


    public static class DBHelper extends SQLiteOpenHelper {
        public static final String dbname = "Signup.db";

        public DBHelper(Context context) {
            super(context, "Signup.db", null, 1);
        }

        @Override
        public void onCreate(SQLiteDatabase sqLiteDatabase) {

            String a = "Create table users ( uid integer primary key autoincrement not null  , fname text, lname text,username text,password text)";
            sqLiteDatabase.execSQL(a);


        }

        @Override
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
            sqLiteDatabase.execSQL("Drop table if exists users");
        }

        public boolean insert_data(String fname, String lname, String username, String password) {
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues c = new ContentValues();
            c.put("fname", fname);
            c.put("lname", lname);
            c.put("username", username);
            c.put("password", password);
            long r = db.insert("Users", null, c);
            if (r == -1) return false;
            else {
                return true;
            }


        }

        public boolean check_username(String username) {
            SQLiteDatabase db = this.getWritableDatabase();
            Cursor cursor = db.rawQuery("Select * from users where username = ?", new String[]{username});
            if (cursor.getCount() > 0)
                return true;
            else
                return false;


        }

        public boolean check_username_pass(String username, String password) {
            SQLiteDatabase db = this.getWritableDatabase();
            Cursor cursor = db.rawQuery("Select * from users where username = ? and password = ? ", new String[]{username, password});
            if (cursor.getCount() > 0)
                return true;
            else
                return false;
        }
    }
}

