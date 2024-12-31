package practice;

public class AnimalTest {
	public static void main(String[] args) {
		Animal lion = new Animal(2,5.0f);
		Animal monkey = new Animal(3,8.0f);
		Elephant elephant = new Elephant(8,1200.0f,"大象");
		
		lion.speak();
		System.out.println("==========");
		monkey.speak();
		System.out.println("==========");
		elephant.speak();
	}
	
	
	
	
}
