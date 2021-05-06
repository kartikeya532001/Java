package Class;

class AB {
	private int a;
	private int b;
	int c;

	AB() {
		a = 5;
		b = 6;
	}

	void abc() {
		c = a + b;
	}
}

class BA extends AB {
	int d;

	int sal() {
		d = 2 * c;
		return d;
	}
}

public class Abstraction {

	public static void main(String[] args) {
		BA b = new BA();
		b.abc();
		int e = b.sal();
		System.out.println(e);

	}

}
