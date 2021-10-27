import java.util.ArrayList;
import java.util.Scanner;

public class allstudents {

	private String name;
	int number;
	int age;

	public allstudents(String name, int number, int age) {
		super();
		this.name = name;
		this.number = number;
		this.age = age;
	}

	public String getStudentName() {
		return name;
	}

	public int getStudentNumber() {
		return number;
	}

	public int getStudentAge() {
		return age;
	}

	public static void main(String[] args) {

		ArrayList<allstudents> student = new ArrayList<allstudents>();

		Scanner scan = new Scanner(System.in);

		System.out.print("Number of students you want to Enter : ");
		int n = scan.nextInt();

		int count = 0;

		for (int i = 1; i <= n; i++) {

			System.out.print("Enter Student name : ");
			String name = scan.next();

			System.out.print("Enter Student number : ");
			int number = scan.nextInt();

			System.out.print("Enter Student age : ");
			int age = scan.nextInt();

			allstudents st = new allstudents(name, number, age);

			student.add(st);

			count++;
			System.out.println(count + " data Entered!!");
		}

		System.out.println("Students whose age is 18+ are : ");
		for (int i = 0; i < student.size(); i++) {
			if ((student.get(i).age >= 18)) {
				System.out.println(student.get(i).getStudentName());
				System.out.println(student.get(i).getStudentNumber());
				System.out.println(student.get(i).getStudentAge());
			}
		}
	}
}
