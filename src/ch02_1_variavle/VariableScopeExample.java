package ch02_1_variavle;

public class VariableScopeExample {
	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
			int v2;
			v2 = v1 - 10;
			int v3 = v1 + v2 + 5; // v2 ������ ����� �� ���� ������ ������ ���� �߻�
			System.out.println("v3 =" + v1 + v2 + 5);
			
			// { } �� { }�� ������� �������.
			// ( { } �ȿ��� ����� ��¼���� �� ������ٴ� �̾߱���)
			// if ��� �ٱ������� ����� �� ���� ������ v2 ������ ��� �� �� ����.
			// ������ ������({})�ȿ����� �۵��ȴ�.
			
			// �ַ� �޸� ���� ����?���� �����ϸ� ��.
			// ��� ������ ���°� �ƴϰ� ���� ���ϸ� �����ϰ�... {}�� �����ϴµ�
			// �ƴԸ���
		}
	}

}

class A {
	String pre = "method";
	public static void �ӽ�1��() {
		
	}
}
