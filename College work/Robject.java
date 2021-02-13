package collegework;

import java.util.Scanner;

class Objec {
	int i;

	Objec(int a) {
		i = a;

	}

	Objec Square() {
		Objec area = new Objec(i * i);
		return area;
	}
}

public class Robject {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int b;
		System.out.println("Enter the length of side of a square: ");
		b = scan.nextInt();
		Objec obj = new Objec(b);
		Objec obj1;
		obj1 = obj.Square();
		System.out.println("Area of Square is: " + obj1.i);
		scan.close();
	}

}
