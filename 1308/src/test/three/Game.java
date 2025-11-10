package test.three;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractMonster m1 = new Attacker("attacker",0,0,0);
		AbstractMonster m2 = new Defender("defender",0,0,0);
		
		
		
		System.out.println(m2.defense(m1.attack()));
		System.out.println(m1.defense(m2.attack()));
		
		
		
		System.out.println("Attacker : " + m1.getHp());
		System.out.println("Defender : " + m2.getHp());
	}

}
