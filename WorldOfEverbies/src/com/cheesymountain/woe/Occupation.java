package com.cheesymountain.woe;


public class Occupation extends Thread {
	@Override
	public void run(){
		while(Everbie.getEverbie().isAlive() && Everbie.getEverbie().getOccupiedSeconds() > 0){
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){}
			Everbie.getEverbie().decreaseOccupiedSeconds();
			android.util.Log.d("Time", Everbie.getEverbie().getOccupiedSeconds() + "");
			if(Everbie.getEverbie().getOccupiedSeconds() <= 0 &&
					Everbie.getEverbie().getStarvation() != Everbie.getEverbie().getStandardStarvation()){
				Everbie.getEverbie().setStarvation(Everbie.getEverbie().getStandardStarvation());
			}
		}
		Log.getLog().doneWith(Everbie.getEverbie().getOccupation());
	}
}
