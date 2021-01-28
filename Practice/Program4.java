package Class;

class Test {
	int a, b;

	Test(int i, int j) {
		a = i;
		b = j;
	}

	boolean equalTo(Test o) {
		if (o.a == a && o.b == b)
			return true;

		else
			return false;
	}
}

public class Program4 {

	public static void main(String args[]) {
		Test obj1 = new Test(100, 22);
		Test obj2 = new Test(100, 22);
		Test obj3 = new Test(10, 2);
		System.out.println("obj1==obj2" + obj1.equalTo(obj2));
		System.out.println("obj1==obj3" + obj1.equalTo(obj3));

	}

}
