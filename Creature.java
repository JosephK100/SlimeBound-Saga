//Creature.java

public abstract class Creature{
	//Protected instead of private to make inheritence easier
	protected String name;
	protected int hp;
	protected int attackPower;
	protected int defense;
	protected ElementalType type;
	protected MoveSet moveSet;

	public Creature(String name, int hp, int attackPower, int defense, ElementalType type, MoveSet moveSet){
		this.name = name;
		this.hp = hp;
		this.attackPower = attackPower;
		this.defense = defense;
		this.type = type;
		this.moveSet = moveSet;
	}

	public boolean isAlive(){
		return hp > 0;
	}

	public void takeDamage(int amount){
		int reduced = Math.max(1, amount - defense);
		hp -= reduced;
		if (hp < 0) hp = 0;
		System.out.println(name + " took " + reduce + " damage!");
	}

	public void attack(Player p){
		Move move = moveSet.getRandomMove();
		int damage = move.getPower();
		System.out.println(name + " used " + move.getName() + "!");
		p.takeDamage(damage);
	}
	
	public MoveSet getMoves(){
		return moveSet;
	}

	public String getName(){
		return name;
	}

	public int getHp(){
		return hp;
	}

	public ElementalType getType(){
		return type;
	}
}
