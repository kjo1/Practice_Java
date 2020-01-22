import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please put an integer: ");
		int i = sc.nextInt();
		System.out.println("Your typed integer is " + i);
		sc.close();

		// file input and output
		File file = new File("input.txt");
		try {
			Scanner sc2 = new Scanner(file);
			while (sc2.hasNextInt()) {
				System.out.println(sc2.nextInt() * 100);
			}
			sc2.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Can't import the file");
		}
	}

}
