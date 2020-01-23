
public class Main implements Dog, Cat {

	public static void main(String[] args) {

		Main main = new Main();
		main.sound();
		main.one();
		main.two();

	}

	@Override
	public void sound() {

		System.out.println("woof-woof!");

	}

	@Override
	public void two() {

		System.out.println("Two!");

	}

	@Override
	public void one() {

		System.out.println("One!");

	}

}
