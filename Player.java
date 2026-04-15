//Player.java

public class Player{
	private String name;
	private int hp;
	private MoveSet moveSet;
	
	public Player(String name){
		this.name = name;
		this.hp = 100; //Testing out 100 hp as a baseline.
		this.moveSet = new MoveSet();
	}
	
	public String getName(){
		return name;
	}

	public int getHp(){
		return hp;
	}
	
	public boolean isAlive(){
		return hp > 0;
	}

	public void heal(int amount){
		hp += amount;
		if (hp > 50) hp = 100; //Hp cap to prevent spam healing (Should implement a timer on healing
		System.out.println(name + " healed for " + amount  + " HP!");
	}

	public void takeDamage(int amount){
		hp -= amount;
		if (hp < 0) hp = 0;
		System.out.println(name + " took " + amount + " damage!");
	}

	public MoveSet getMoves(){
		return moveSet;
	}
}

