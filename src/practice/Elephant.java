package practice;

public class Elephant extends Animal {
	private String name;
	
	public Elephant(int age,float weight,String name) {
		super(age,weight);
		this.name = name;
	}
	
	public String speak() {
		super.speak();
		return "你好，我的名字是"+name;
	}
	

}
