package Class;

class A {
	void abc() {
		System.out.println("A");
	}
}

class B extends A {
	void abc() {
		System.out.println("B");
	}
}

class C extends A {
	void abc() {
		System.out.println("C");
	}
}

public class DMD {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		a.abc();
		b.abc();
		c.abc();
		A r;
		r = a;
		r.abc();
		r = b;
		r.abc();
		r = c;
		r.abc();
	}

}
