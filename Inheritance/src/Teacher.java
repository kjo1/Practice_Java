
public class Teacher extends Person {

	private String teacherID;
	private int salary;
	private int workedYear;

	public String getTeacherID() {
		return teacherID;
	}

	public void setTeacherID(String teacherID) {
		this.teacherID = teacherID;
	}

	public int getSalary() {
		return salary;
	}

	public void setMonthSalary(int monthSalary) {
		this.salary = monthSalary;
	}

	public int getWorkedYear() {
		return workedYear;
	}

	public void setWorkedYear(int workedYear) {
		this.workedYear = workedYear;
	}

	public Teacher(String name, int age, int height, int weight, String teacherID, int salary, int workedYear) {
		super(name, age, height, weight);
		this.teacherID = teacherID;
		this.salary = salary;
		this.workedYear = workedYear;
	}

	public void show() {
		System.out.println("------------------------------");
		System.out.println("Name: " + getName());
		System.out.println("Age: " + getAge());
		System.out.println("Height: " + getHeight());
		System.out.println("Weight: " + getWeight());
		System.out.println("ID#: " + getTeacherID());
		System.out.println("Salary: " + getSalary());
		System.out.println("Year: " + getWorkedYear());
	}
}
