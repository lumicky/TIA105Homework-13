package work8;

import java.util.Objects;

public class Train implements Comparable<Train> {
	
	//HashSet確實不允許重複，所以直接加入重複的"基本型別"是可以避免重複的
	//但這題的重點在"物件"，物件創建本身就在"不同記憶體"，所以需要透過"override"來預先設定"重複的定義為何"
	
	
	//hashCode用來提供一個數值（哈希值），用於快速判斷物件是否可能相同
	@Override
	public int hashCode() {
		return Objects.hash(dest, number, price, start, type);
	}
	
	//equals要override，為了防止相同內容的物件
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(dest, other.dest) && number == other.number
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(start, other.start) && Objects.equals(type, other.type);
	}
	
	//單純讓印出的物件好看一點~~~
	@Override
	public String toString() {
		return "Train [number=" + number + ", type=" + type + ", start=" + start + ", dest=" + dest + ", price=" + price
				+ "]";
	}
	
	
	
	//-------------------------------------------------------------------------------------
	//需要透過改寫排序，讓顯示出的順序是依照"Number的大小"，否則ArrayList只是依據我們放進去集合的順序來排index
	@Override
	public int compareTo(Train o) {
		if(this.number < o.number) {
			return 1;
		}else if(this.number == o.number) {
			return 0;
		}else{
			return -1;
		}
		
		
	}
	
	
	//-------------------------------------------------------------------------------------
	




	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;
	
	//先建立建構子(建立所有物件的初使值)
	public  Train(int number,String type,String start,String dest,double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}
	
	//建立getter、setter方法
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	} 
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getStart() {
		return start;
	}
	
	public void setStart(String start) {
		this.start = start;
	}
	
	public String getDest() {
		return dest;
	}
	
	public void setDest(String dest) {
		this.dest = dest;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}


	
	
	
	

}
