import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student("John", 20, 180, 70, "2020012201", 1, 4.5);
		Student student2 = new Student("Jane", 23, 163, 45, "2020012202", 4, 3.9);

		student1.show();
		student2.show();

		Teacher teacher1 = new Teacher("Doe", 40, 175, 70, "T2020012201", 70000, 3);
		Teacher teacher2 = new Teacher("Smith", 37, 168, 55, "T2020012202", 55000, 1);

		teacher1.show();
		teacher2.show();

		Student[] students = new Student[100];
		for (int i = 0; i < 100; i++) {
			students[i] = new Student("John Doe", 23, 173, 60, "202001220" + i, 1, 4.0);
			students[i].show();
		}

		Scanner scan = new Scanner(System.in);
		System.out.print("How many studetns do you like to add? ");
		int number = scan.nextInt();
		Student[] studentsAdd = new Student[number];
		for (int i = 0; i < number; i++) {
			String name;
			int age;
			int height;
			int weight;
			String studentID;
			int grade;
			double gPA;

			System.out.print("Student Name: ");
			name = scan.next();
			System.out.print("Student Age: ");
			age = scan.nextInt();
			System.out.print("Student Height: ");
			height = scan.nextInt();
			System.out.print("Student Weight: ");
			weight = scan.nextInt();
			System.out.print("Student ID#: ");
			studentID = scan.next();
			System.out.print("Student Grade: ");
			grade = scan.nextInt();
			System.out.print("Student GPA: ");
			gPA = scan.nextDouble();

			studentsAdd[i] = new Student(name, age, height, weight, studentID, grade, gPA);
		}
		for (int i = 0; i < number; i++) {
			studentsAdd[i].show();
		}

	}

}
