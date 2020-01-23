
public class Main {

	public static void main(String[] args) {

		Hero[] heros = new Hero[3];

		heros[0] = new Knight("Knight");
		heros[1] = new Archer("Archer");
		heros[2] = new Witcher("Witcher");

		for (int i = 0; i < heros.length; i++) {
			heros[i].attack();

			if (heros[i] instanceof Knight) {
				Knight temp = (Knight) heros[i];
				temp.groundSmash();
			} else if (heros[i] instanceof Archer) {
				Archer temp = (Archer) heros[i];
				temp.fireArrow();
			} else if (heros[i] instanceof Witcher) {
				Witcher temp = (Witcher) heros[i];
				temp.blizzard();
			}

		}
	}
}
