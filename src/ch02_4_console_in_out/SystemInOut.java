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
////												int�� ���ڰ� ��
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
//		System.out.println("���α׷��� ���������� ����Ǿ����ϴ�.");
		
		
		
		
		
		
		
		
//        [ScannerExample.java]
		
		
		
		Scanner scn = new Scanner(System.in);
		String str = "";
		
		while(true) {
			str = scn.nextLine();
			System.out.printf("�Էµ� ���ڿ��� \"%s\" �Դϴ�. \n", str );
			
			if(str.contentEquals("q")) {
				break;
			}
		}
		
		
		
		System.out.println("���α׷��� ���������� ����Ǿ����ϴ�.");
		
		scn.close();
		
	}

}
