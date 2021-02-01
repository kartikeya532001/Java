package collegework;

class UseStatic {
	static int a = 3;
	static int b;

	static void meth(int x) {
		System.out.println("x= " + x);
		System.out.println("a= " + a);
		System.out.println("b= " + b);
	}

	static {
		System.out.println("Static block initialized.");
		b = a * 4;
	}

}

class Add {
	int a, b;

	Add(int c, int d) {
		a = c;
		b = d;
	}

	int sum() {
		return (a + b);
	}
}

public class Static {
	public static void main(String args[]) {
		Add obj = new Add(4, 5);
		System.out.println("Sum is: " + obj.sum());
		UseStatic.meth(42);

	}
}