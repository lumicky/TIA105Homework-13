package practice;

public class Animal {
	
	private int age;
	private float weight;
	
	public Animal() {
		
	}
	
	public Animal(int age,float weight) {
		this.age = age;
		this.weight = weight;
	}
	
	public void speak() {
		System.out.println("我"+age+"歲");
		System.out.println(weight+"公斤");
	}


	
}
