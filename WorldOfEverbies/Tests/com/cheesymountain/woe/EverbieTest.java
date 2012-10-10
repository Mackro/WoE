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
		System.out.println("" + (everbie.getCharm() == 0?"Everbie has no Charm": "Everbie has charm"));
		System.out.println("" + (everbie.getCuteness() == 0?"Everbie has no Cuteness": "Everbie has Cuteness"));
		System.out.println("" + (everbie.getFullness() == 0?"Everbie has no Fullness": "Everbie has fullness"));
		System.out.println("" + (everbie.getHappiness() == 0?"Everbie has no Happiness": "Everbie has Happiness"));
		System.out.println("" + (everbie.getHealth() == 0?"Everbie is dead": "Everbie has Life"));
		System.out.println("" + (everbie.getIntelligence() == 0?"Everbie has no Intelligence": "Everbie has Smart"));
		System.out.println("" + (everbie.getLevel() == 0?"Everbie has no Level": "Everbie has Level"));
		System.out.println("" + (everbie.getMaxHealth() == 0?"Everbie has no MaxHealth": "Everbie has MaxHealth"));
		System.out.println("" + (everbie.getMoney() == 0?"Everbie has no Money": "Everbie has Money"));
		System.out.println("" + (everbie.getStamina() == 0?"Everbie has no Stamina": "Everbie has Stamina"));
		System.out.println("" + (everbie.getStrength() == 0?"Everbie has no Strength": "Everbie has Strength"));
		System.out.println("" + (everbie.getToxicity() == 100?"Everbie has Toxicity": "Everbie has no Toxicity"));
		
		everbie.setName("Oscar");
		
		System.out.println("" + (everbie.getName() == null?"Everbie has no name": "Everbie has name"));
		System.out.println("" + (everbie.getName().equalsIgnoreCase("Oscar")?"Everbie's name isn't Oscar": "Everbie's name is Oscar"));
		
	}
}
