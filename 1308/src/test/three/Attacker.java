package test.three;

public class Attacker extends AbstractMonster {
	

	public Attacker(String name,int hp,int attack,int defense) {
		super(name,hp,attack,defense);
		this.name = "Attacker";
		this.hp = 30;
		this.attack = 20;
		this.defense = 10;
	}
	
	

	
	
	@Override
	public int attack() {
		System.out.println("Attacker - Very Strong Attack");
		return attack;
	}
	
	
	
	
	
	
}
