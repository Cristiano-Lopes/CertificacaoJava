package exceptions;

public class Whiz {

	public static void main(String[] args) {
		new Whiz().go();

	}

	void go() {
		System.out.println("A");
		try {
			run(0);
			System.out.println("B");
		} catch (Exception e) {
			System.out.println("C");
		} finally {
			System.out.println("D");
		}
	}

	void run(int i) {
		try {
			System.out.println("E");
			int x = 5 / i;
			System.out.println("F");
		} catch (NumberFormatException e2) {
			System.out.println("G");
		} finally {
			System.out.println("H");
		}
	}
}
