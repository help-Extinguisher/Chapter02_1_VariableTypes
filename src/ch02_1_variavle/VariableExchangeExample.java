package ch02_1_variavle;

public class VariableExchangeExample {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + " , y:" + y);
		
		/* [x�� y�� ���� �ٲٰ� ���� ��] - ������
		 * temp��� �ӽñ⿡ �ӽ÷� ��Ƴ��� ����� �ٲ��.
		 * �׳� x=y�ϴ� ���� x�� 5�� �ٲ� ����� �ٲ��� �ʴ´�.
		 * (�ڵ�� ó������ ���ʴ�� �����Ƿ� ���ÿ� �� �� ����)
		 */
		
		int temp = x;	// x�� temp�� ��ƶ�
		x = y; // x�� ������� y�� x�� ���
		y = temp; // ���� temp�� y�� ���
		
		// temp�� �� ���̶�� �����ϸ� �ȴ�. (�ӽ�) �����־���!
		
		// ��[��] �� �տ��� ��Ʈ��+��Ʈ+(�Ʒ�)����Ű �ϸ� �� ���� ���簡 �ȴ�
		
		System.out.println("x:" + x + " , y:" + y);
	}

}
