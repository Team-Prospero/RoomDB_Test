package com.example.roomdb_test;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

//모든 디비 CRUD작업은 메인스레드가아닌 백그라운드로 작업해야한다. (단, 라이브데이터는 반응시 자기가 알아서 백그라운드로 작업을 처리해준다. 굳)
//필터링 작업 시 메소드에 필터링 기준이 되는 매개변수를 메소드의 맴버변수로 집어넣으면 됨 예) @Query("SELECT * FROM user WHERE age > :minAge") public User[] loadAllUsersOlderThan(int minAge);
@Dao
public interface DataModelDAO {

    @Query("select * from farm_info")
    public void selectAll(DataModel dataModel);

    @Insert
    public void insertValue(DataModel dataModel);

}