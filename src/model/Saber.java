package model;

public class Saber extends Servant {
	public Saber(String name, String type, int maxHp, int attack, int defense) {
		super(name, type, maxHp, attack, defense);
	}

	@Override
	public void action(Servant opponent, char form) {
		if(opponent != null) {
			System.out.println(this.getName()+" deals damage to "+opponent.getName()+".");
			if(form=='A') {
				opponent.takeDamage(2*this.attack-opponent.defense);
			} else {
				opponent.takeDamage(this.attack-opponent.defense);
			}
			System.out.println(opponent.getName()+"'s current HP is "+opponent.getHp()+".");
		}
		
	}

}
