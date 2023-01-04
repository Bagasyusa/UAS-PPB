package com.laras.laundry.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.laras.laundry.database.dao.LaundryDao;
import com.laras.laundry.model.ModelLaundry;

@Database(entities = {ModelLaundry.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract LaundryDao laundryDao();
}
