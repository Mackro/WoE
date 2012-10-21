package com.cheesymountain.woe;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Database {

	private static final String KEY_ROWID = "_id";
	private static final String KEY_NAME = "_id";	

	private static final String DATABASE_NAME = "Everbiedb";
	private static final String DATABASE_TABLE = "EverbieTable";
	private static final int DATABASE_VERSION = 1;
	
	private DbHelper helper;
	private final Context context;
	private SQLiteDatabase database;
	
	
	private static class DbHelper extends SQLiteOpenHelper{

		public DbHelper(Context context) {
			super(context, DATABASE_NAME, null, DATABASE_VERSION);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void onCreate(SQLiteDatabase db) {
			db.execSQL("CREATE TABLE " + DATABASE_TABLE + " ("+
					KEY_ROWID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
					KEY_NAME + " TEXT NOT NULL);"
			);
		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			db.execSQL("DROP TABLE IF EXISTS " + DATABASE_TABLE);
			onCreate(db);
		}
		
	}
	
	public Database(Context context){
		this.context = context;
	}
	
	public Database open(){
		helper = new DbHelper(this.context);
		database = helper.getWritableDatabase();
		return this;
	}
	
	public void close(){
		helper.close();
	}
	
	public void save(Everbie everbie){
		database.delete(DATABASE_TABLE, null, null);
		ContentValues values = new ContentValues();
		values.put(KEY_NAME, everbie.getName());
		database.insert(DATABASE_TABLE, null, values);
	}
	
	public void load(){
		if(Everbie.exists()){
			return;
		}
		String[] columns = new String[]{ KEY_ROWID, KEY_NAME };
		Cursor c = database.query(DATABASE_TABLE, columns, null, null, null, null, null);

		c.moveToLast();
		int iName = c.getColumnIndex(KEY_NAME);
		
		Everbie.getEverbie().restoreEverbie(c.getString(iName), null, true, null);
		
	}
	
}
