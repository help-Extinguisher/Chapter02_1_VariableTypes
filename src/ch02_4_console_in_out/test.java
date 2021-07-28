package ch02_4_console_in_out;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		
//		long var1 = 2L;
//		float var2 = 1.8f;
//		double var3 = 2.5;
//		String var4 = "3.9";
//		
//		int result = (int)(var1 + var2 + var3 + (int)Double.parseDouble(var4));
//		System.out.println(result);
		
//		long var1 = 2L;
//		float var2 = 1.8f;
//		double var3 = 2.5;
//		String var4 = "3.9";
//		
//		int result = (int)(var1 + var2 + var3 + Double.parseDouble(var4));
//		System.out.println(result);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 수");
		String strNum1 = scanner.nextLine();
	
		
		System.out.print("두번째 수");
		String strNum2 = scanner.nextLine();
		
//		int num1 = scanner.nextLine(strNum1) ;
		int num1 = Integer.parseInt(scanner.nextLine()) ;
//		int num1 = Integer.parseInt(strNum1) ;
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println("덧셈 결과: " + result);
		
		
	}

}
