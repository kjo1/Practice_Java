
public class Main {

	public static void main(String[] args) {

		System.out.println("Greatest common divisor of (400, 300, 750): " + functionGCD(400, 300, 750));

		int result = functionDiv(3050, 10);
		if (result == -1) {
			System.out.println("10th divisor of 3050 is not avauable");
		} else {
			System.out.println("The 10th divisor of 3050 is " + result);
		}

		System.out.println("The last letter of Hello World is " + functionLast("Hello World"));

		System.out.println("The biggest number of (345, 567, 789) is " + functionMax(345, 567, 789));
	}

	// finding greatest common divisor
	public static int functionGCD(int a, int b, int c) {
		int min;
		if (a > b) {
			if (b > c) {
				min = c;
			} else {
				min = b;
			}
		} else {
			if (a > c) {
				min = c;
			} else {
				min = a;
			}
		}
		for (int i = min; i > 0; i--) {
			if (a % i == 0 && b % i == 0 && c % i == 0) {
				return i;
			}
		}
		return -1;
	}

	// finding divisor of
	public static int functionDiv(int number, int k) {
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				k--;
				if (k == 0) {
					return i;
				}
			}
		}
		return -1;
	}

	// finding the last letter
	public static char functionLast(String input) {
		return input.charAt(input.length() - 1);
	}

	public static int max(int a, int b) {
		// ternary operation
		return (a > b) ? a : b;
	}

	public static int functionMax(int a, int b, int c) {
		int result = max(a, b);
		result = max(result, c);
		return result;
	}

}
