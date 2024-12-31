package practice;

public class Elephant extends Animal {
	private String name;
	
	public Elephant() {
		
	}
	
	public Elephant(int age,float weight,String name) {
		super(age,weight);
		this.name = name;
	}
	
	public void speak() {
		System.out.println("你好，我的名字是"+name);
		super.speak();
	}
	

}
