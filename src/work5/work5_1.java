package work5;

import java.util.Scanner;

//請設計一個方法為starSquare(int width, int height),
//當使用者鍵盤輸入寬與高時,即會印出對應的*長方形,如圖:

public class work5_1 {
	public static void main(String[] args) {
		System.out.println("請輸入寬與高:");
		Scanner input = new Scanner(System.in);
		int width = input.nextInt();
		int height = input.nextInt();
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		input.close();
	}

}
