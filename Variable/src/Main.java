
public class Main {
	// Constants
	final static double PI = 3.141592;
	final static int INT_MAX = 2147483647;

	public static void main(String[] args) {

		// Variables
		int intType = 100;
		double doubleType = 150.5;
		String stringType = "Name";

		System.out.println(intType);
		System.out.println(doubleType);
		System.out.println(stringType);

		int r = 30;
		System.out.println(r * r * PI);

		int a = INT_MAX;
		// overflow
		System.out.println(a + 1);

		int num1 = 1;
		int num2 = 2;

		// The Basic Operations
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + (num1 / num2));

	}

}
