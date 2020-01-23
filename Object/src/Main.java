
public class Main {

	public static void main(String[] args) {

		Archer archer1 = new Archer("Archer1", "High");
		Archer archer2 = new Archer("Archer2", "Medium");
		// false
		System.out.println(archer1 == archer2);

		Archer archer3 = new Archer("Archer3", "High");
		Archer archer4 = new Archer("Archer3", "High");
		// still false because although variables are the same, the instances are
		// different
		System.out.println(archer3 == archer4);
		// true
		System.out.println(archer3.equals(archer4));

	}

}
