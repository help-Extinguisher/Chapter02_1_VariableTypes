package ch02_1_variavle;

public class VarialeUseExample {
	public static void main(String[] args) {
		int hour =3;
		int minute = 5;
		System.out.println(hour + "�ð� " + minute + "��" );
		// ���ڿ� �տ� +�� ������ 3�� ���ڿ��� �Ǿ������. "3" + "�ð�"
		// ������ �Ǿ������.
		// " " �� ���ڿ��� �ٲ۴�. ex) "3" + 3 = 33
		//			= ���ڿ� + ���ڴ� �ᱹ ���ڿ��� �Ǿ����.
		
		int totalMinute = (hour*60) + minute;
		System.out.print("�� "+ totalMinute + "��");
	}

}
