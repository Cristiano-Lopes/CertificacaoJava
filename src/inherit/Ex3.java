package inherit;

class Animal{
	
}

class Mammal extends Animal{
	
}

class Dog extends Mammal{
	
}

public class Ex3 {

	public static void main(String[] args) {
		Animal a = new Mammal();
		Mammal b = new Dog();
		Dog c = new Dog();
		
		boolean t1 = c instanceof Animal;
		
		System.out.println(t1);

	}

}
