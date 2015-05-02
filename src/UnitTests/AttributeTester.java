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
	public void testStatBonuses() {
		Pluto = new CharacterStats(16,14,14,10,10,13);
		int Bonus = 0;


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

}
