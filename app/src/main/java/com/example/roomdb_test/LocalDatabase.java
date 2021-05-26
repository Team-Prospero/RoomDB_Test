package com.example.roomdb_test;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {com.example.roomdb_test.DataModel.class}, version = 1, exportSchema = false)
public abstract class LocalDatabase extends RoomDatabase {

    /**
     * 이 객체가 제공하는 Data Access Object
     * AppDatabase 가 생성되고 TodoDAO 를 통해서 조작한다.
     **/
    public abstract DataModelDAO dataModelDAO();

}