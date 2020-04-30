package com.almetrix.playgroundtask.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update
import com.almetrix.playgroundtask.Pojo.data_For_Database

@Dao
interface BaseDAO {

    @Insert
    fun insertData(value:data_For_Database)


    @Update
    fun updateData(value:data_For_Database)

    @Delete
    fun deletData(value:data_For_Database)
}
