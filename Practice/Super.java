package Class;

class C {
	int i;
}

class D extends C {
	int i;

	D(int a, int b) {
		super.i = a;
		i = b;
	}

	void show() {
		System.out.println("A: " + super.i);
		System.out.println("B: " + i);
	}
}

public class Super {
	public static void main(String arg[]) {
		D ob = new D(5, 10);
		ob.show();
	}

}
