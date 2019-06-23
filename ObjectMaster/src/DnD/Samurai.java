package DnD;

public class Samurai extends Human {
	
	static int numberOfSamurai = 0;
	public Samurai() {
		this.setHealth(200);
		numberOfSamurai++;
	}
	
	public void deathBlow(Human defender) {
		defender.setHealth(0);
		this.setHealth((this.getHealth()/2));
	}
	
	public void meditate() {
		int health = (int) this.getHealth();
		this.setHealth(health);
		if(health > 200) {
			this.setHealth(200);
		}
	}
	
	
	public void howMany() {
		System.out.println("Number of Samurai: " + numberOfSamurai);
	}
}
