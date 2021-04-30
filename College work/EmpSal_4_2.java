package collegework;

class Emp {
	String Name;
	int basic_sal, sa, hra, da;

	Emp(String a, int b, int c, int d, int e) {
		Name = a;
		basic_sal = b;
		sa = c;
		hra = d;
		da = e;
	}

	int calculateSalary() {
		return (basic_sal + sa + hra + da);
	}
}

class Manager extends Emp {
	Manager(String a, int b, int c, int d, int e) {
		super(a, b, c, d, e);
	}

	int calculateSalary() {
		return (basic_sal + 2 * sa + hra + da);
	}
}

class ProjectManager extends Manager {

	ProjectManager(String a, int b, int c, int d, int e) {
		super(a, b, c, d, e);
	}

	int calculateSalary() {
		return (basic_sal + 2 * sa + 2 * hra + da);
	}
}

public class EmpSal_4_2 {

	public static void main(String[] args) {
		Emp A = new Emp("Ajay", 10000, 5000, 500, 200);
		System.out.println(A.Name);
		int sal = A.calculateSalary();
		System.out.println(sal);
		Manager B = new Manager("Rachit", 1000, 500, 50, 20);
		System.out.println(B.Name);
		int sal1 = B.calculateSalary();
		System.out.println(sal1);
		ProjectManager C = new ProjectManager("Aman", 100000, 50000, 5000, 2000);
		System.out.println(C.Name);
		int sal2 = C.calculateSalary();
		System.out.println(sal2);
	}

}
