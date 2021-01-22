package Class;

class Student {
	String name;
	int roll_no;
	long no;
}

public class Program1 {

	public static void main(String args[]) {
		Student obj1 = new Student();
		Student obj2 = new Student();
		obj1.name = "John";
		obj1.roll_no = 2;
		obj1.no = 844503395;
		obj2.name = "Sam";
		obj2.roll_no = 3;
		obj2.no = 807775427;

		System.out.println("Name is: " + obj1.name);
		System.out.println("Roll.No is: " + obj1.roll_no);
		System.out.println("Number is: " + obj1.no);

		System.out.println("Name is: " + obj2.name);
		System.out.println("Roll.No is: " + obj2.roll_no);
		System.out.println("Number is: " + obj2.no);

	}

}
