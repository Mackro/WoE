package com.cheesymountain.woe;
/*=============================================================
 * Copyright 2012, Cheesy Mountain Production
 * 
 * This file is part of World of Everbies.
 * 
 * World of Everbies is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * World of Everbies is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with World of Everbies.  If not, see <http://www.gnu.org/licenses/>.
================================================================*/
import com.cheesymountain.woe.race.Race;
import com.cheesymountain.woe.race.Skrom;
import com.cheesymountain.woe.util.Occupationable;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Database {

	private static final String KEY_ROWID = "_id";						//Saved as:
	private static final String KEY_NAME = "name";						//String
	private static final String KEY_MAXHEALTHMOD = "maxHealthMod";		//int
	private static final String KEY_HEALTH = "health";					//int
	private static final String KEY_STR = "strength";					//int
	private static final String KEY_INT = "intelligence";				//int
	private static final String KEY_STA = "stamina";					//int
	private static final String KEY_CHARM = "charm";					//int
	private static final String KEY_CUTENESS = "cuteness";				//int
	private static final String KEY_FULLNESS = "fullness";				//int
	private static final String KEY_HAPPINESS = "happiness";			//int
	private static final String KEY_TOX = "toxicity";					//int
	private static final String KEY_OI = "oi";							//int
	private static final String KEY_OCCUPIEDSEC = "occupiedsec"; 		//int
	private static final String KEY_ALIVE = "alive";					//"boolean"(1=true, 0=false)
	private static final String KEY_FAINTED = "fainted";				//"boolean"(1=true, 0=false)
	private static final String KEY_RACE = "race";						//int
	private static final String KEY_OCCUPATION = "occupation";			//String

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
					KEY_ROWID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_NAME + 
					" TEXT NOT NULL, " + KEY_MAXHEALTHMOD + " INTEGER, " + KEY_HEALTH +
					" INTEGER, " + KEY_STR + " INTEGER, " + KEY_INT + " INTEGER, " +
					KEY_STA + " INTEGER, " + KEY_CHARM + " INTEGER, " + KEY_CUTENESS +
					" INTEGER, " + KEY_FULLNESS + " INTEGER, " + KEY_HAPPINESS +
					" INTEGER, " + KEY_TOX + " INTEGER, " + KEY_OI + " INTEGER, " +
					KEY_OCCUPIEDSEC + " INTEGER, " + KEY_ALIVE + " BOOLEAN, " + KEY_FAINTED +
					" BOOLEAN, " + KEY_RACE + " INTEGER, " + KEY_OCCUPATION + " TEXT);"
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
		
		String occupationName;
		Occupationable occupation = everbie.getOccupation();
		if(occupation == null){
			occupationName = "null";
		}else{
			occupationName = occupation.getName();
		}
		
		values.put(KEY_NAME, everbie.getName());
		values.put(KEY_MAXHEALTHMOD, everbie.getMaxHealthMod());
		values.put(KEY_HEALTH, everbie.getHealth());
		values.put(KEY_STR, everbie.getStrength());
		values.put(KEY_INT, everbie.getIntelligence());
		values.put(KEY_STA, everbie.getStamina());
		values.put(KEY_CHARM, everbie.getCharm());
		values.put(KEY_CUTENESS, everbie.getCuteness());
		values.put(KEY_FULLNESS, everbie.getFullness());
		values.put(KEY_HAPPINESS, everbie.getHappiness());
		values.put(KEY_TOX, everbie.getToxicity());
		values.put(KEY_OI, everbie.getMoney());
		values.put(KEY_OCCUPIEDSEC, everbie.getOccupiedSeconds());
		values.put(KEY_ALIVE, everbie.isAlive());
		values.put(KEY_FAINTED, everbie.isFainted());
		values.put(KEY_RACE, everbie.getRaceId());
		values.put(KEY_OCCUPATION, occupationName);
		database.insert(DATABASE_TABLE, null, values);
	}
	
	public void load(){
		if(Everbie.exists()){
			return;
		}
		String[] columns = new String[]{ KEY_ROWID, KEY_NAME };
		Cursor c = database.query(DATABASE_TABLE, columns, null, null, null, null, null);
		c.moveToLast();
		if(c.isAfterLast() || c.isBeforeFirst()){
			return;
		}
		int iNAME = c.getColumnIndex(KEY_NAME);
		
		int iMAXHEALTHMOD = c.getColumnIndex(KEY_MAXHEALTHMOD);
		int iHEALTH = c.getColumnIndex(KEY_HEALTH);
		int iSTR = c.getColumnIndex(KEY_STR);
		int iINT = c.getColumnIndex(KEY_INT);
		int iSTA = c.getColumnIndex(KEY_STA);
		int iCHARM = c.getColumnIndex(KEY_CHARM);
		int iCUTENESS = c.getColumnIndex(KEY_CUTENESS);
		int iFULLNESS = c.getColumnIndex(KEY_FULLNESS);
		int iHAPPINESS = c.getColumnIndex(KEY_HAPPINESS);
		int iTOX = c.getColumnIndex(KEY_TOX);
		int iOI = c.getColumnIndex(KEY_OI);
		int iOCCUPIEDSEC = c.getColumnIndex(KEY_OCCUPIEDSEC);
		
		int iALIVE = c.getColumnIndex(KEY_ALIVE);
		int iFAINTED = c.getColumnIndex(KEY_FAINTED);
		int iRACE = c.getColumnIndex(KEY_RACE);
		int iOCCUPATION = c.getColumnIndex(KEY_OCCUPATION);
		
		int[] values = {c.getInt(iMAXHEALTHMOD), c.getInt(iHEALTH), c.getInt(iSTR),
				c.getInt(iINT), c.getInt(iSTA), c.getInt(iCHARM),
				c.getInt(iCUTENESS), c.getInt(iFULLNESS), c.getInt(iHAPPINESS),
				c.getInt(iTOX), c.getInt(iOI), c.getInt(iOCCUPIEDSEC)};
		Everbie.getEverbie().restoreEverbie(c.getString(iNAME), values, c.getInt(iALIVE)==1,
				c.getInt(iFAINTED)==1, Race.RACELIST[c.getInt(iRACE)], c.getString(iOCCUPATION));
		if(c.getInt(iOCCUPIEDSEC)>0){
			new Use.Occupation().start();
		}
		
	}
	
}
