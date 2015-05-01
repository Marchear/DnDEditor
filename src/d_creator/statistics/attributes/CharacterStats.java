package d_creator.statistics.attributes;

public class CharacterStats {

	private int Str;
	private int Dex;
	private int Con;
	private int Int;
	private int Wis;
	private int Cha;
	
	
	public String FormatStatsForPrint() {
		
		return "The stats are :\n" + "Str : 10\n" + "Dex : 10\n" + "Con : 10\n" +
		"Int : 10\n" + "Wis : 10\n" + "Cha : 10";
		
		
	}


	public void setStr(int i) throws IllegalArgumentException
	{ 
		if(i>0)
			Str = i;
		else
			throw new IllegalArgumentException("Strength must be greater than 0");
	}
	
	public void setDex(int i) throws IllegalArgumentException
	{ 
		if(i>0)
			Dex = i;
		else
			throw new IllegalArgumentException("Dexterity must be greater than 0");
	}
	
	public void setCon(int i) throws IllegalArgumentException
	{ 
		if(i>0)
			Con = i;
		else
			throw new IllegalArgumentException("Constitution must be greater than 0");
	}
	
	public void setInt(int i) throws IllegalArgumentException
	{ 
		if(i>0)
			Int = i;
		else
			throw new IllegalArgumentException("Intellect must be greater than 0");
	}
	
	public void setWis(int i) throws IllegalArgumentException
	{ 
		if(i>0)
			Wis = i;
		else
			throw new IllegalArgumentException("Wisdom must be greater than 0");
	}
	
	public void setCha(int i) throws IllegalArgumentException
	{ 
		if(i>0)
			Cha = i;
		else
			throw new IllegalArgumentException("Charisma must be greater than 0");
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


	private int getGenericBonus(int stat) {
		
		return (stat/2)-5;
	}
	
	
	
}
