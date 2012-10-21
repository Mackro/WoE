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

/**
 * Thread responsible for everything that takes up real life time. such as work or training.
 * @author Cheesy Mountain
 *
 */


public class Occupation extends Thread {
	
	public long startingTime;

	public void start(){
		startingTime = System.currentTimeMillis();
		super.start();
	}

	@Override
	public void run(){
		while(Everbie.getEverbie().isAlive() && Everbie.getEverbie().getOccupiedSeconds() > 0){
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){}
			Everbie.getEverbie().setOccupiedSeconds((int)((Everbie.getEverbie().getOccupation().getTime()*60) 
					- ((System.currentTimeMillis() - startingTime)/1000)));
			android.util.Log.d("Time", Everbie.getEverbie().getOccupiedSeconds() + "");
			if(Everbie.getEverbie().getOccupiedSeconds() <= 0 &&
					Everbie.getEverbie().getStarvation() != Everbie.getEverbie().getStandardStarvation()){
				Everbie.getEverbie().setStarvation(Everbie.getEverbie().getStandardStarvation());
			}
		}
		Use.done(Everbie.getEverbie().getOccupation());
	}
}
