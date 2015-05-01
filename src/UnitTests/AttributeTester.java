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
		Pluto = new CharacterStats();
		int stat = 0;

		Pluto.setStr(16);
		stat = Pluto.getStr();
		assertEquals(16, stat);

		Pluto.setDex(15);
		stat = Pluto.getDex();
		assertEquals(15, stat);

		Pluto.setCon(14);
		stat = Pluto.getCon();
		assertEquals(14, stat);

		Pluto.setInt(13);
		stat = Pluto.getInt();
		assertEquals(13, stat);

		Pluto.setWis(12);
		stat = Pluto.getWis();
		assertEquals(12, stat);

		Pluto.setCha(11);
		stat = Pluto.getCha();
		assertEquals(11, stat);


	}

	@Test(expected=IllegalArgumentException.class)
	public void testInvalidStats() {
		Pluto = new CharacterStats();

		Pluto.setStr(-2);
	}

	@Test
	public void testStatBonuses() {
		Pluto = new CharacterStats();
		int Bonus = 0;

		Pluto.setStr(16);
		Pluto.setDex(14);
		Pluto.setCon(14);
		Pluto.setInt(10);
		Pluto.setWis(10);
		Pluto.setCha(13);

		Bonus = Pluto.getStrBonus();
		assertEquals(3,Bonus);
		Pluto.setStr(14);
		Bonus = Pluto.getStrBonus();
		assertEquals(2,Bonus);
		
		Pluto.setStr(1);
		Bonus = Pluto.getStrBonus();
		assertEquals(-5,Bonus);
		
		Pluto.setStr(2);
		Bonus = Pluto.getStrBonus();
		assertEquals(-4,Bonus);
		
		Pluto.setStr(3);
		Bonus = Pluto.getStrBonus();
		assertEquals(-4,Bonus);
		
		Pluto.setStr(4);
		Bonus = Pluto.getStrBonus();
		assertEquals(-3,Bonus);
		
		Pluto.setStr(9);
		Bonus = Pluto.getStrBonus();
		assertEquals(-1,Bonus);
		
		Pluto.setStr(35);
		Bonus = Pluto.getStrBonus();
		assertEquals(12,Bonus);
		
		

	}

}
