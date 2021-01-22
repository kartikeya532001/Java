package collegework;

class Sum {
	int a, b;

	Sum() {
		System.out.println("Values not passed.");
	}

	Sum(int i) {
		a = i;
		b = i;
	}

	Sum(int k, int l) {
		a = k;
		b = l;
	}

	int cal() {
		return (a + b);
	}
}

public class Constructor {

	public static void main(String args[]) {
		Sum obj1 = new Sum();
		Sum obj2 = new Sum(5);
		Sum obj3 = new Sum(5, 8);
		int sum;
		sum = obj1.cal();
		System.out.println("Sum is: " + sum);
		sum = obj2.cal();
		System.out.println("Sum is: " + sum);
		sum = obj3.cal();
		System.out.println("Sum is: " + sum);

	}

}
