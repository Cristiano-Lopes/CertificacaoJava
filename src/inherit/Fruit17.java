package inherit;

class Exception1 extends Exception {
}

public class Fruit17 {
	public void eatMe() throws Exception1 {
		System.out.println("Eat a Fruit");
	}

	public static void main(String[] args) {
		Mango17 m = new Mango17();
		m.eatMe();
	}

}

class Mango17 extends Fruit {
	public void eatMe() throws IllegalStateException {
		System.out.println("Eating a mango");
	}
}
