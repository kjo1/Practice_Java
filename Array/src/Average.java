
public class Average {

	public static void main(String[] args) {

		int[] array = new int[100];
		for (int i = 0; i < 100; i++) {
			array[i] = (int) (Math.random() * 100 + 1);
		}
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			sum += array[i];
		}
		System.out.println("The average of 100 random number is " + sum / 100);
	}

}
