package com.cheesymountain.woeTests;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cheesymountain.woe.Everbie;

public class EverbieTest {

	private Everbie everbie;
	
	public EverbieTest(){
		everbie = Everbie.getEverbie();
		everbie.reset();
	}
	
	@BeforeClass
	public void Before(){
		assertTrue(everbie.isAlive());
		
	}
	
	@Test
	public void TestGnCforHealth(){
		int maxHealth = everbie.getMaxHealth();
		assertTrue(everbie.getHealth()==1);
		everbie.changeHealth(48);
		assertTrue(everbie.getHealth()==49);
		everbie.changeHealth(maxHealth);
		assertTrue(everbie.getHealth()==maxHealth);
		everbie.changeHealth(-78);
		assertTrue(everbie.getHealth()==(maxHealth-78));
		everbie.changeHealth(-maxHealth);
		assertTrue(everbie.getHealth()==0);
		assertTrue(everbie.isAlive()==false);
	}
}
