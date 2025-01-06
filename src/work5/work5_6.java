package work5;
//回傳亂數的進階寫法

import java.security.SecureRandom;

public class work5_6 {
	private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	private static final SecureRandom RANDOM = new SecureRandom();
	
	public static String getAuthCode(int length) {
		StringBuilder code = new StringBuilder();
		for(int i=0 ; i<length ; i++) {
			int index = RANDOM.nextInt(CHARACTERS.length());
			code.append(CHARACTERS.charAt(index));
		}
		return code.toString();
	}
	
	public static void main(String[] args) {
		System.out.print(getAuthCode(8));
	}

}
