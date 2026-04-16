//Player.java
import java.util.Random;
import java.io.Serializable;

public class Player implements Serializable{
	private String name;
	private int hp;
	private MoveSet moveSet;
	private Creature activeSlime;
	private Inventory inventory = new Inventory();

	public Player(String name){
		this.name = name;
		this.hp = 100; //Testing out 100 hp as a baseline.
		this.moveSet = new MoveSet();
		this.activeSlime = new Slime();
	}
	
	public Creature getActiveSlime(){
		return activeSlime;
	}

	public void setActiveSlime(Creature slime){
		this.activeSlime = slime;
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
	}

	public MoveSet getMoves(){
		return moveSet;
	}
	
	//My idea is to have a random secondary attack from the player alongside thier slime.
	public int spellAttack(){
		return 8;
	}

	public int swordAttack(){
		return 5;
	}

	public int bowAttack(){
		return 6;
	}

	public int frostShard(){
		return 10;
	}

	public int thunderStrike(){
		return 12;
	}

	public int lightBeam(){
		return 7;
	}

	public int shadwoSlash(){
		return 11;
	}

	public int randomAttack(){
		Random rand = new Random();
		int choice = rand.nextInt(7);

		switch(choice){
			case 0:
				System.out.println(name + " casts a spell!");
				return spellAttack();
			case 1:
				System.out.println(name + " swings their sword!");
				return swordAttack();
			case 2: System.out.println(name + " shoots an arrow!");
				return bowAttack();
			case 3:
				System.out.println(name + " conjures a hailstorm!");
				return frostShard();
			case 4:
				System.out.println(name + " unleashes thunder bolt!");
				return thunderStrike();
			case 5:
				System.out.println(name + " uses light beam!");
				return lightBeam();
			case 6:
				System.out.println(name + "uses shadow slash!");
				return shadwoSlash();
		}
		//Just in case
		return bowAttack();
	}

	public Inventory getInventory(){
		return inventory;
	}
}

