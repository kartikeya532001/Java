package Class;

public class Program7 {

	public static void main(String[] args) {
		String ob1 = "Frsit String";
		String ob2 = "Second String";
		String ob3 = ob1;
		String ob4;
		ob4 = ob1 + " " + ob2;
		System.out.println("Frist String: " + ob1);
		System.out.println("Second String: " + ob2);
		System.out.println("Adding both strings: " + ob4);
		System.out.println("Length of frist string is:" + ob1.length());
		System.out.println("Char at index 4 in second string is: " + ob2.charAt(4));
		if (ob1.equals(ob2)) {
			System.out.println("Frist String is same as second string.");
		} else {
			System.out.println("Frist String is not same as second string.");

		}
		if (ob1.equals(ob3)) {
			System.out.println("Frist String is same as third string.");
		} else {
			System.out.println("Frist String is not same as third string.");

		}
	}

}
