package inherit;

public class Fruit{
	public void eatMe()throws Exception{
		System.out.println("Eat a Fruit");
	}

	public static void main(String[] args) {
		Fruit f = new Fruit();
		try {
			f.eatMe();
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}

}

class Mango extends Fruit {
	public void eatMe() {
		System.out.println("Eating a mango");
	}
}
