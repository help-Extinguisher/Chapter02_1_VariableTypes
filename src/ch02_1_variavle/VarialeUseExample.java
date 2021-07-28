package ch02_1_variavle;

public class VarialeUseExample {
	public static void main(String[] args) {
		int hour =3;
		int minute = 5;
		System.out.println(hour + "시간 " + minute + "분" );
		// 문자열 앞에 +이 있으니 3도 문자열이 되어버린다. "3" + "시간"
		// 연결이 되어버린다.
		// " " 은 문자열로 바꾼다. ex) "3" + 3 = 33
		//			= 문자열 + 숫자는 결국 문자열이 되어버림.
		
		int totalMinute = (hour*60) + minute;
		System.out.print("총 "+ totalMinute + "분");
	}

}
