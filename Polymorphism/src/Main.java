import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Cherry: 1, Mandarin: 2 ?");
		int input = scanner.nextInt();

		Fruit fruit;
		if (input == 1) {
			fruit = new Cherry();
			fruit.show();
		} else if (input == 2) {
			fruit = new Mandarin();
			fruit.show();
		}

//		Fruit fruit1 = new Cherry();
//		fruit1.show();
//
//		Fruit fruit2 = new Mandarin();
//		fruit2.show();

	}

}
