import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please type the size of your array : ");
		int number = scanner.nextInt();
		int[] array = new int[number];
		for (int i = 0; i < number; i++) {
			System.out.print("Please type positive numbers for the array : ");
			array[i] = scanner.nextInt();
		}
		int result = -1;
		for (int i = 0; i < number; i++) {
			result = max(result, array[i]);
		}
		System.out.println("The biggest number within the array is " + result);
	}

	public static int max(int a, int b) {
		return (a > b) ? a : b;
	}

}
