package ch02_4_console_in_out;

import java.io.IOException;
import java.util.Scanner;

public class SystemInOut {
	public static void main(String[] args) {
////		[KeyCodeExample.java]
//
////		int KeyCode;
//		
//		try {
//			System.out.printf("keCode: %d\n", System.in.read());
////												int형 숫자가 옴
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
//		[ContinueKeyCodeReadExample.java]
		
//		while(true) {
//			try {
//				System.out.printf("keyCode: %d\n", System.in.read());
//				
//				
//			} catch (IOException e) {
//				
//				e.printStackTrace();
//			}
//		}
		
//        [QstopExample.java]
		
//		boolean working = true;
//		int keyCode;
//		
//		while(working) {
//			try {
//				keyCode = System.in.read();
//				System.out.printf("keyCode: %d\n", keyCode);
//				if(keyCode == 113) {
//					working = false;
//				}
//				
//			} catch (IOException e) {
//				
//				e.printStackTrace();
//			}
//		}
//		
//		System.out.println("프로그램이 정상적으로 종료되었습니다.");
		
		
		
		
		
		
		
		
//        [ScannerExample.java]
		
		
		
		Scanner scn = new Scanner(System.in);
		String str = "";
		
		while(true) {
			str = scn.nextLine();
			System.out.printf("입력된 문자열은 \"%s\" 입니다. \n", str );
			
			if(str.contentEquals("q")) {
				break;
			}
		}
		
		
		
		System.out.println("프로그램이 정상적으로 종료되었습니다.");
		
		scn.close();
		
	}

}
