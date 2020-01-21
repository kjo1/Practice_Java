
public class Main {

	final static int SECOND = 1000;

	public static void main(String[] args) {

		int minute = SECOND / 60;
		int second = SECOND % 60;

		System.out.println(minute + "min " + second + "s");

		int a = 10;
		System.out.println("Current a is " + a);
		a++;
		System.out.println("Current a is " + a);
		System.out.println("Current a is " + ++a);
		System.out.println("Current a is " + a++);
		System.out.println("Current a is " + a);

		// modular
		System.out.println(1 % 3);
		System.out.println(2 % 3);
		System.out.println(3 % 3);
		System.out.println(4 % 3);
		System.out.println(5 % 3);
		System.out.println(6 % 3);

		int b = 50;
		int c = 50;

		System.out.println("Is the b same as the c? " + (b == c));
		System.out.println("Is the b bigger than the c? " + (b > c));
		System.out.println("Is the b smaller than the c? " + (b < c));
		System.out.println("Is the b same as the c and bigger than 30? " + ((b == c) && (b > 30)));
		System.out.println("Is the b 50? " + !(b == 50));

		int x = 50;
		int y = 60;

		System.out.println("The max is " + max(x, y));

		double f = Math.pow(3.0, 20.0);
		System.out.println("3 to the power of 20 is " + (long) f);

	}

	static int max(int d, int e) {
		int result = (d > e) ? d : e;
		return result;
	}

}
