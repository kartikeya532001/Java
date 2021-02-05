package collegework;

class Operation {
	int square(int n) {
		return n * n;
	}
}

class Circle {
	Operation o;
	double pi = 3.14;

	double area(int radius) {
		o = new Operation();
		int rsquare = o.square(radius);
		return pi * rsquare;
	}

}

public class Aggregation {

	public static void main(String[] args) {
		Circle c = new Circle();
		double result = c.area(10);
		System.out.println(result);
	}

}
