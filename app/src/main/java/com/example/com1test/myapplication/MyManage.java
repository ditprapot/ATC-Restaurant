package com.example.com1test.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by com1test on 22/3/2559.
 */
public class MyManage {

    //Explicit
    private Myopenhelper myopenhelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;


    public MyManage(Context context) {

        //create & Connected SQLite
        myopenhelper = new Myopenhelper(context);
        writeSqLiteDatabase = myopenhelper.getWritableDatabase();
        readSqLiteDatabase = myopenhelper.getReadableDatabase();


    }   //Constructor

} // Main Class
