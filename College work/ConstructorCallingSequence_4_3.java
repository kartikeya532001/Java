package collegework;

class ONE {
	ONE() {
		System.out.println("CONSTRUCTOR ONE");
	}

}

class TWO extends ONE {
	TWO() {
		System.out.println("CONSTRUCTOR TWO");
	}

}

class THREE extends TWO {
	THREE() {
		System.out.println("CONSTRUCTOR THREE");
	}

}

class FOUR extends THREE {
	FOUR() {
		System.out.println("CONSTRUCTOR FOUR");
	}

}

class FIVE extends FOUR {
	FIVE() {
		System.out.println("CONSTRUCTOR FIVE");
	}

}

public class ConstructorCallingSequence_4_3 {

	public static void main(String[] args) {
		FIVE A = new FIVE();

	}

}
