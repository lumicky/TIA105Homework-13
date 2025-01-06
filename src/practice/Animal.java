package practice;

public class Animal {
	
	private int age;
	private float weight;
	
	public Animal(int age,float weight) {
		this.age = age;
		this.weight = weight;
	}
	
	public String speak() {
		return "我"+age+"歲"+weight+"公斤";
	}


	
}
