package Class;

class Pro {
	int a, b;

	Pro() {
		System.out.println("Values not passed.");
	}

	Pro(int i) {
		a = i;
		b = i;
	}

	Pro(int k, int l) {
		a = k;
		b = l;
	}

	int cal() {
		return (a * b);
	}
}

public class Program3 {
	public static void main(String args[]) {
		Pro obj1 = new Pro();
		Pro obj2 = new Pro(5);
		Pro obj3 = new Pro(5, 4);
		int pro;
		pro = obj1.cal();
		System.out.println("Product is: " + pro);
		pro = obj2.cal();
		System.out.println("Product is: " + pro);
		pro = obj3.cal();
		System.out.println("Product is: " + pro);

	}

}
