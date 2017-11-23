package inherit;

abstract class X {
	abstract void a1();

	void a2() {
		System.out.println("A2 Da Classe X");
	}
}

class Y extends X {
	void a1() {
		System.out.println("A1 da Classe Y");
	}

	void a2() {
		System.out.println("A2 da Classe Y");
	}
}

class Z extends Y {
	void c1() {
		System.out.println("C1 da Classe Z");
	}

	public static void main(String[] args) {
		X x = new Y();
		Y y = new Z();
		X z = new Z();

		x.a2();
		z.a2();
		z.a1();
		
	}
}
