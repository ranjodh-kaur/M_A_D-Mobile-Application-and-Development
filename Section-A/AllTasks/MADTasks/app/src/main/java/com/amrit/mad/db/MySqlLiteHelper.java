package com.amrit.mad.db;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MySqlLiteHelper extends SQLiteOpenHelper {
    private static final String TAG = "MySqlLiteHelper";
    private static final String DB_NAME = "Education";
    private static final String DB_TABLE = "students";
    private static final int DB_VER = 1;
    Context context;
    SQLiteDatabase myDb;

    public MySqlLiteHelper(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VER);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+DB_TABLE+" (_id integer primary key autoincrement,student_name text,college_name text);");
        Log.i(TAG, "onCreate: Table Created");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists "+DB_TABLE);
        onCreate(db);
    }

    public void insertData(String s1,String s2){
        myDb = getWritableDatabase();
        myDb.execSQL("insert into "+DB_TABLE+" (student_name,college_name) values('"+s1+"','"+s2+"');");
        Toast.makeText(context,"Data Saved Successfully",Toast.LENGTH_SHORT).show();
    }

    public void getAll(){
        myDb = getReadableDatabase();
        Cursor cr = myDb.rawQuery("Select * from " + DB_TABLE,null);
        StringBuilder str = new StringBuilder();
        while ((cr.moveToNext())){
            String s1= cr.getString(1);
            String s2= cr.getString(2);
            str.append("StudentName: ").append(s1).append("\nCollegeName: ").append(s2);
        }
        cr.close();
        Toast.makeText(context,str.toString(),Toast.LENGTH_SHORT).show();
    }
}
