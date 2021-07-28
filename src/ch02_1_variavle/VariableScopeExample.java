package ch02_1_variavle;

public class VariableScopeExample {
	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
			int v2;
			v2 = v1 - 10;
			int v3 = v1 + v2 + 5; // v2 변수를 사용할 수 없기 때문에 컴파일 에러 발생
			System.out.println("v3 =" + v1 + v2 + 5);
			
			// { } 는 { }를 벗어났을때 사라진다.
			// ( { } 안에서 선언된 어쩌구가 다 사라진다는 이야기임)
			// if 블록 바깥에서는 사용할 수 없기 때문에 v2 변수를 사용 할 수 없다.
			// 선언한 스코프({})안에서만 작동된다.
			
			// 주로 메모리 관리 측면?에서 생각하면 됨.
			// 계속 실행해 놓는게 아니고 할일 다하면 종료하게... {}로 관리하는듯
			// 아님말고
		}
	}

}

class A {
	String pre = "method";
	public static void 임시1번() {
		
	}
}
