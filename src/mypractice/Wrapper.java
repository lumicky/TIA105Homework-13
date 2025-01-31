package mypractice;

import java.util.Scanner;

public class Wrapper {
	
	public static void main(String[] args) {
		int a = Integer.valueOf("1010",2);
		System.out.println(a);	
		
		int b = Integer.valueOf("1010",8);
		System.out.println(b);
		
		int c = Integer.valueOf("1010",16);
		System.out.println(c);
		
		//輸入任意兩數，A、B，用讀取字串方式讀取，然後解析A、B的比較關係。
		//列印出"A>B"或"A=B"或"A<B"
//		Scanner input = new Scanner(System.in);
//		System.out.println("請輸入A值:");
//		String x = input.nextInt() ;
		
		
	}

}
