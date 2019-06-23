package DnD;

public class Ninja extends Human {
	
	public Ninja() {
		this.setStealth(10);
	}
	
	public void steal(Human target) {
		int steal = this.getStealth();
		if(steal > target.getHealth()) {
			steal = target.getHealth();
		}
		this.setHealth(this.getHealth() + steal);
		target.setHealth(target.getHealth() - steal);
	}
	
	public void runAway() {
		this.setHealth(this.getHealth() - 10);
	}
}
