package DnD;

public class HumanTest {
	
	public static void main(String[] args) {
		Human man1 = new Human();
		Human man2 = new Human();
		man1.printHealth();
		man2.attack(man1);
		man1.printHealth();
		Samurai sam = new Samurai();
		Ninja nin = new Ninja();
		Wizard wiz = new Wizard();
		sam.printHealth();
		sam.deathBlow(wiz);
		sam.printHealth();
		wiz.printHealth();
		sam.meditate();
		sam.howMany();
		nin.steal(sam);
		nin.runAway();
		sam.printHealth();
		wiz.printHealth();
		wiz.heal(wiz);
		wiz.printHealth();
		sam.printHealth();
		wiz.fireball(sam);
		sam.printHealth();

	}
}
