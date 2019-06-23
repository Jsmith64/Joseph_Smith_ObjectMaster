package DnD;

public class Wizard extends Human {
	
	public Wizard() {
		this.setHealth(50);
		this.setIntelligence(8);
	}
	
	public void heal(Human target) {
		int heal = this.getIntelligence() * 3;
		target.setHealth(target.getHealth() + heal);
	}
	
	public void fireball(Human target) {
		int damage = this.getIntelligence() * 3;
		target.setHealth(target.getHealth() - damage);
	}
}
