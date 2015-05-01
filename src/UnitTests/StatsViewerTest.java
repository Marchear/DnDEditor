package UnitTests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import d_creator.statistics.attributes.CharacterStats;

public class StatsViewerTest {

	CharacterStats Pluto;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		Pluto = new CharacterStats(); 
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBasicPrint() {
		String ExpectedString = "The stats are :\n" + "Str : 10\n" + "Dex : 10\n" + "Con : 10\n" +
				"Int : 10\n" + "Wis : 10\n" + "Cha : 10";
		assertEquals(ExpectedString, Pluto.FormatStatsForPrint());
	}

}
