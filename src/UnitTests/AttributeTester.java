package UnitTests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import d_creator.statistics.attributes.CharacterStats;

public class AttributeTester {

	CharacterStats Pluto;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetGetStats() {
		Pluto = new CharacterStats(16,15,14,13,12,11);
		int stat = 0;

		stat = Pluto.getStr();
		assertEquals(16, stat);

		stat = Pluto.getDex();
		assertEquals(15, stat);

		stat = Pluto.getCon();
		assertEquals(14, stat);

		stat = Pluto.getInt();
		assertEquals(13, stat);

		stat = Pluto.getWis();
		assertEquals(12, stat);

		stat = Pluto.getCha();
		assertEquals(11, stat);


	}

	@Test(expected=IllegalArgumentException.class)
	public void testInvalidStats() {
		Pluto = new CharacterStats(-2,10,11,12,13,15);

	}

	@Test
	public void testStrStatBonuses() {
		Pluto = new CharacterStats(16,14,14,10,10,13);
		int Bonus = 0;

// 		comments and stuff! And stuff!
		Bonus = Pluto.getStrBonus();
		assertEquals(3,Bonus);
		
		Pluto = new CharacterStats(1,14,14,10,10,13);
		Bonus = Pluto.getStrBonus();
		assertEquals(-5,Bonus);
		
		Pluto = new CharacterStats(2,14,14,10,10,13);
		Bonus = Pluto.getStrBonus();
		assertEquals(-4,Bonus);
		
		Pluto = new CharacterStats(3,14,14,10,10,13);
		Bonus = Pluto.getStrBonus();
		assertEquals(-4,Bonus);
		
		Pluto = new CharacterStats(4,14,14,10,10,13);
		Bonus = Pluto.getStrBonus();
		assertEquals(-3,Bonus);
		
		Pluto = new CharacterStats(9,14,14,10,10,13);
		Bonus = Pluto.getStrBonus();
		assertEquals(-1,Bonus);
		
		Pluto = new CharacterStats(35,14,14,10,10,13);
		Bonus = Pluto.getStrBonus();
		assertEquals(12,Bonus);
		
		

	}

	@Test
	public void testDexStatBonuses() {
		Pluto = new CharacterStats(14,16,14,10,10,13);
		int Bonus = 0;

		Bonus = Pluto.getDexBonus();
		assertEquals(3,Bonus);
		
		Pluto = new CharacterStats(1,1,14,10,10,13);
		Bonus = Pluto.getDexBonus();
		assertEquals(-5,Bonus);
		
		Pluto = new CharacterStats(2,3,14,10,10,13);
		Bonus = Pluto.getDexBonus();
		assertEquals(-4,Bonus);
		
		Pluto = new CharacterStats(3,2,14,10,10,13);
		Bonus = Pluto.getDexBonus();
		assertEquals(-4,Bonus);
		
		Pluto = new CharacterStats(4,5,14,10,10,13);
		Bonus = Pluto.getDexBonus();
		assertEquals(-3,Bonus);
		
		Pluto = new CharacterStats(9,9,14,10,10,13);
		Bonus = Pluto.getDexBonus();
		assertEquals(-1,Bonus);
		
		Pluto = new CharacterStats(35,34,14,10,10,13);
		Bonus = Pluto.getDexBonus();
		assertEquals(12,Bonus);
		
	}
	
	@Test
	public void testConStatBonuses() {
		Pluto = new CharacterStats(14,16,16,10,10,13);
		int Bonus = 0;

		Bonus = Pluto.getConBonus();
		assertEquals(3,Bonus);
		
		Pluto = new CharacterStats(1,1,1,10,10,13);
		Bonus = Pluto.getConBonus();
		assertEquals(-5,Bonus);
		
		Pluto = new CharacterStats(2,3,2,10,10,13);
		Bonus = Pluto.getConBonus();
		assertEquals(-4,Bonus);
		
		Pluto = new CharacterStats(3,2,3,10,10,13);
		Bonus = Pluto.getConBonus();
		assertEquals(-4,Bonus);
		
		Pluto = new CharacterStats(4,5,4,10,10,13);
		Bonus = Pluto.getConBonus();
		assertEquals(-3,Bonus);
		
		Pluto = new CharacterStats(9,9,9,10,10,13);
		Bonus = Pluto.getConBonus();
		assertEquals(-1,Bonus);
		
		Pluto = new CharacterStats(35,34,35,10,10,13);
		Bonus = Pluto.getConBonus();
		assertEquals(12,Bonus);
		
		

	}
	
	@Test
	public void testIntStatBonuses() {
		Pluto = new CharacterStats(14,16,14,16,10,13);
		int Bonus = 0;

		Bonus = Pluto.getIntBonus();
		assertEquals(3,Bonus);
		
		Pluto = new CharacterStats(1,1,14,1,10,13);
		Bonus = Pluto.getIntBonus();
		assertEquals(-5,Bonus);
		
		Pluto = new CharacterStats(2,3,14,2,10,13);
		Bonus = Pluto.getIntBonus();
		assertEquals(-4,Bonus);
		
		Pluto = new CharacterStats(3,2,14,3,10,13);
		Bonus = Pluto.getIntBonus();
		assertEquals(-4,Bonus);
		
		Pluto = new CharacterStats(4,5,14,4,10,13);
		Bonus = Pluto.getIntBonus();
		assertEquals(-3,Bonus);
		
		Pluto = new CharacterStats(9,9,14,9,10,13);
		Bonus = Pluto.getIntBonus();
		assertEquals(-1,Bonus);
		
		Pluto = new CharacterStats(35,34,14,35,10,13);
		Bonus = Pluto.getIntBonus();
		assertEquals(12,Bonus);
		
	}
	
	@Test
	public void testWisStatBonuses() {
		Pluto = new CharacterStats(14,16,14,10,16,13);
		int Bonus = 0;

		Bonus = Pluto.getWisBonus();
		assertEquals(3,Bonus);
		
		Pluto = new CharacterStats(1,1,14,10,1,13);
		Bonus = Pluto.getWisBonus();
		assertEquals(-5,Bonus);
		
		Pluto = new CharacterStats(2,3,14,10,2,13);
		Bonus = Pluto.getWisBonus();
		assertEquals(-4,Bonus);
		
		Pluto = new CharacterStats(3,2,14,10,3,13);
		Bonus = Pluto.getWisBonus();
		assertEquals(-4,Bonus);
		
		Pluto = new CharacterStats(4,5,14,10,5,13);
		Bonus = Pluto.getWisBonus();
		assertEquals(-3,Bonus);
		
		Pluto = new CharacterStats(9,9,14,10,9,13);
		Bonus = Pluto.getWisBonus();
		assertEquals(-1,Bonus);
		
		Pluto = new CharacterStats(35,34,14,10,35,13);
		Bonus = Pluto.getWisBonus();
		assertEquals(12,Bonus);
	}
	
	@Test
	public void testChaStatBonuses() {
		Pluto = new CharacterStats(14,16,14,10,10,16);
		int Bonus = 0;

		Bonus = Pluto.getChaBonus();
		assertEquals(3,Bonus);
		
		Pluto = new CharacterStats(1,1,14,10,10,1);
		Bonus = Pluto.getChaBonus();
		assertEquals(-5,Bonus);
		
		Pluto = new CharacterStats(2,3,14,10,10,2);
		Bonus = Pluto.getChaBonus();
		assertEquals(-4,Bonus);
		
		Pluto = new CharacterStats(3,2,14,10,10,3);
		Bonus = Pluto.getChaBonus();
		assertEquals(-4,Bonus);
		
		Pluto = new CharacterStats(4,5,14,10,10,4);
		Bonus = Pluto.getChaBonus();
		assertEquals(-3,Bonus);
		
		Pluto = new CharacterStats(9,9,14,10,10,9);
		Bonus = Pluto.getChaBonus();
		assertEquals(-1,Bonus);
		
		Pluto = new CharacterStats(35,34,14,10,10,35);
		Bonus = Pluto.getChaBonus();
		assertEquals(12,Bonus);
	}

}
