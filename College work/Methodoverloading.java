package collegework;

class Pro {
	int a, b;

	Pro() {
		System.out.println("Values not passed.");
	}

	int cal(int a) {

		return (a * a);
	}

	int cal(int a, int b) {

		return (a * b);
	}
}

public class Methodoverloading {

	public static void main(String[] args) {

		Pro obj1 = new Pro();
		int pro;

		pro = obj1.cal(5);
		System.out.println("Product is: " + pro);
		pro = obj1.cal(5, 4);
		System.out.println("Product is: " + pro);
	}

}
