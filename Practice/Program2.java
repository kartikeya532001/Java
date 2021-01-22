package Class;

class Triangle {
	int a, b, c;

	double area() {
		double s;
		s = (a + b + c) / 2;
		return Math.pow((s*(s - a)*(s - b)*(s - c)),.5);
	}

	double perimeter() {
		return (a + b + c) / 2;
	}
}

public class Program2 {

	public static void main(String args[]) {
		double i, k;
		Triangle obj = new Triangle();
		obj.a = 5;
		obj.b = 3;
		obj.c = 3;
		i = obj.area();
		k = obj.perimeter();
		System.out.println("Area of the triangle is: " + i);
		System.out.println("Perimeter of the triangle is: " + k);

	}

}
