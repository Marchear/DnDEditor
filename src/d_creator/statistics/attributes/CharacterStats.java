package d_creator.statistics.attributes;

public class CharacterStats {

	private int Str;
	private int Dex;
	private int Con;
	private int Int;
	private int Wis;
	private int Cha;
	
	
	/**
	 * New character stats selection, parameter order is same as DnD 3.5 character
	 * sheet
	 * 
	 * @param Str
	 * @param Dex
	 * @param Con
	 * @param Int
	 * @param Wis
	 * @param Cha
	 * @throws IllegalArgumentException
	 */
	public CharacterStats(int Str, int Dex, int Con, int Int, int Wis, int Cha)
										throws IllegalArgumentException
	{
		if(Str>0)
			this.Str = Str;
		else
			throw new IllegalArgumentException("Strength must be greater than 0");
		
		if(Dex>0)
			this.Dex = Dex;
		else
			throw new IllegalArgumentException("Dexterity must be greater than 0");
		
		if(Con>0)
			this.Con = Con;
		else
			throw new IllegalArgumentException("Constitution must be greater than 0");
		
		if(Int>0)
			this.Int = Int;
		else
			throw new IllegalArgumentException("Intellect must be greater than 0");
		
		if(Wis>0)
			this.Wis = Wis;
		else
			throw new IllegalArgumentException("Wisdom must be greater than 0");
		
		if(Cha>0)
			this.Cha = Cha;
		else
			throw new IllegalArgumentException("Charisma must be greater than 0");
		
	}
	


	public String FormatStatsForPrint() 
	{
			return "The stats are :\n" + "Str : 10\n" + "Dex : 10\n" + "Con : 10\n" +
		"Int : 10\n" + "Wis : 10\n" + "Cha : 10";
	}
	
	public int getStr() { return Str;	}
	public int getDex() { return Dex;	}
	public int getCon() { return Con;	}
	public int getInt() { return Int;	}
	public int getWis() { return Wis; }
	public int getCha() { return Cha; }


	public int getStrBonus() {
				
		return getGenericBonus(Str);
	}
	
	public int getDexBonus() {
		
		return getGenericBonus(Dex);
	}
	
	public int getConBonus() {
		
		return getGenericBonus(Con);
	}
	
	public int getIntBonus() {
		
		return getGenericBonus(Int);
	}
	
	public int getWisBonus() {
		
		return getGenericBonus(Wis);
	}

	public int getChaBonus() {
		
		return getGenericBonus(Cha);
	}




	private int getGenericBonus(int stat) {
		
		return (stat/2)-5;
	}
	
	
	
}
