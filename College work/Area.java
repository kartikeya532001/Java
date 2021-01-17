apackage collegework;

public class Area {

	public static void main(String args[]) {
		int h = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		double k = triangle(h, b);
		System.out.println("Area of Triangle with height " + h + " units and base " + b + " units is " + k + " units.");
		double r = square(h);
		System.out.println("Area of Square with side " + h + " units is " + r + " units.");
		double u = circle(b);
		System.out.println("Area of Circle with radius " + b + " units is " + u + " units.");
	}

	static double triangle(int p, int l) {
		return (0.5 * p * l);
	}

	static double square(int z) {
		return (z * z);
	}

	static double circle(int t) {
		return (3.14 * t * t);
	}
}
