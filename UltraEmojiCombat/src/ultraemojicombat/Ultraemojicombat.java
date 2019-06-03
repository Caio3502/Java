package ultraemojicombat;

public class Ultraemojicombat {
	public static void main(String[] args) {
		Lutador l[]= new Lutador[6];
		
		l[0] = new Lutador("Pretty Boy", "França", 31, 1.75,
				68.9f, 11, 1, 1);
		
		l[1] = new Lutador("Anderson Silva", "Brasil", 32, 1.78,
				69.0f, 12, 2, 3);
		l[1].status();
		l[1].ganharLuta();
		l[1].status();
	}
	
}
