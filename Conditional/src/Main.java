
public class Main {

	public static void main(String[] args) {

		String a = "I like you.";

		if (a.contains("like")) {
			System.out.println("So do I.");
		} else {
			System.out.println("Are you sure?");
		}

		int score = 95;

		if (score >= 90) {
			System.out.println("You are A+");
		} else if (score >= 80) {
			System.out.println("You are B+");
		} else if (score >= 70) {
			System.out.println("You are C+");
		} else {
			System.out.println("You are F");
		}

		String b = "Man";
		int c = 0;

		if (b.equals("Man")) {
			System.out.println("You are a man.");
		} else {
			System.out.println("You aren't a man.");
		}

		if (c == 3) {
			System.out.println("c is 3");
		} else {
			System.out.println("c isn't 3");
		}

		if (b.equalsIgnoreCase("man") && c == 0) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

}
