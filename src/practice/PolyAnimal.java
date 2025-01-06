package practice;

public class PolyAnimal {
	public static void main(String[] args) {
		
//		(1)老師先用object創立，但因它沒有speak方法，所以不行使用!!!
//		(2)記得呼叫的方法要有return，如果方法本身有void就不行喔!!請注意!!
//		(3)或是不用改void，直接在這裡把方法呼叫出來 a[i].speak();
//		要先將回傳性質更改，再把方法內的寫法微調
//		不是print東西出來，而是改成return要印出的東西出來!!
		Animal[] a = new Animal[2];
		a[0] = new Animal(2,3.0f);
		a[1] = new Elephant(5,100.0f,"elephant");
		
		for(int i=0 ; i<a.length ; i++) {
			System.out.println(a[i].speak());
			
		}
		
	}

}
