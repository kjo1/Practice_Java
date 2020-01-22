
public class Main {

	public static void main(String[] args) {

		System.out.println("Factorial of 10 is " + factorial(10));

		System.out.println("Factorial of 10 is " + factorialRecursive(10));

		System.out.println("The 10th Fibonacci number is " + fibonacci(10));

		System.out.println("The 10th Fibonacci number is " + fibonacciRecursive(10));

	}

	public static int factorial(int number) {
		int sum = 1;
		for (int i = 2; i <= number; i++) {
			sum *= i;
		}
		return sum;
	}

	public static int factorialRecursive(int number) {
		if (number == 1)
			return 1;
		else
			return number * factorialRecursive(number - 1);
	}

	public static int fibonacci(int number) {
		int one = 1;
		int two = 1;
		int result = -1;
		if (number == 1) {
			return one;
		} else if (number == 2) {
			return two;
		} else {
			for (int i = 2; i < number; i++) {
				result = one + two;
				one = two;
				two = result;
			}
		}
		return result;
	}

	public static int fibonacciRecursive(int number) {
		if (number == 1) {
			return 1;
		} else if (number == 2) {
			return 1;
		} else {
			return fibonacciRecursive(number - 1) + fibonacciRecursive(number - 2);
		}
	}
}
