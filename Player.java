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
	
	//My idea is to have a random seocndary attack from the player alongside thier slime.
	public int spellAttack(){
		return 8;
	}

	public int SwordAttack(){
		return 5;
	}

	public int bowAttack(){
		return 6;
	}

	public int randomAttack(){
		Random rand = new Random();
		int choice = rand.nextInt(3);

		switch(choice){
			case 0:
				System,out.printlln(name + " casts a spell!");
				return spellAttack();
			case 1:
				System.out.println(name + " swings thier sword !");
				return swordAttack();
			case 2: System.out.println(name + "shoots an arrow!");
				return bowAttack();
		}
		//Just in case
		return bowAttack();
	}
}

