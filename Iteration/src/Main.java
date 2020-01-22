
public class Main {

	final static int N = 30;
	final static int N2 = 15;

	public static void main(String[] args) {
		int a = 1, sum = 0;
		while (a <= 1000) {
			sum += a++;
		}
		System.out.println("The sum of 1 to 1000 = " + sum);

		// drawing a triangle shape
		for (int i = N; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		// drawing an oval shape
		// x^2 + y^2 = r^2
		for (int i = -N2; i <= N2; i++) {
			for (int j = -N2; j <= N2; j++) {
				if (i * i + j * j <= N2 * N2) {
					System.out.print("*");
				}

				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		int count = 0;

		for (;;) {
			System.out.println("print");
			count++;
			if (count == 10) {
				break; // breaking out of an infinite loop
			}
		}

		// drawing a rectangle shape
		int b = 15;
		char c = '*';

		for (int i = 0; i < b; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
