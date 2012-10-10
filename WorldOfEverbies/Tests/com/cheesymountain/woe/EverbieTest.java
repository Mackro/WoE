package com.cheesymountain.woe;

public class EverbieTest {
	
	private Everbie everbie;
	
	public EverbieTest(){
		
		everbie = Everbie.getEverbie();
		
		testConstructor();
		testVariables();
	}

	private void testConstructor(){
		System.out.println("Creating Everbie = " + (everbie == null? "Failed, everbie = null": "Success"));
	}
	
	private void testVariables() {

		System.out.println("" + (everbie.getImageId() == 0?"Everbie has no image": "Everbie has image"));
		System.out.println("" + (everbie.getName() == null?"Everbie has no name": "Everbie has name"));
		
	}
}
