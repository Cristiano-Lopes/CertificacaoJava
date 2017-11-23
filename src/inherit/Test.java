package inherit;

public class Test {
	public static void main(String[] args) {
		boolean flag = false;
		int x = 0;
		for (; flag = !flag;) {
			x++;
		}
		System.out.println(x);
	}

}
