
public class Character 
{
	String race; 
	String playerClass;
	int level = 0;
	boolean isDead = false;
	private int gold;
	int fightBonus = 0;
	int runBonus = 0;
	
	
	Character() //Constructor
	{
		race = "Human";
		playerClass = "Cleric";
		this.gold = 0;
	}
	
	//getters
	public String getRace()
	{
		return race;
	}
	
	public String getplayerClass()
	{
		return playerClass;
	}  
	
	public int getLevel()
	{
		return level;
	}
	
	public boolean getIsDead()
	{
		return isDead;
	}
	
	public int getGold()
	{
		return this.gold;
	}
	
	public int getFightBonus()
	{
		return fightBonus;
	}
	
	public int getRunBonus()
	{
		return runBonus;
	}
	
	public void setFightBonus(int pFightBonus)
	{
		
		fightBonus = pFightBonus;
	}
	
	public void setRunBonus(int pRunBonus)
	{	
		runBonus = pRunBonus;
	}
	
	public void setLevel(int pLevel)
	{
		level = pLevel;
	}
	
	public void setRace(String pRace)
	{
		race = pRace;
	}
	
	public void setPlayerClass(String pPlayerClass)
	{
		playerClass = pPlayerClass;
	}
	
	public void setGold(int pGold)
	{
		this.gold = pGold;
	}
	
	public void setIsDead(boolean pIsDead)
	{
		isDead = pIsDead;
	}
}
