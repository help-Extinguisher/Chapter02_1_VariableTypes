package ch02_1_variavle;

public class VariableExchangeExample {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + " , y:" + y);
		
		/* [x와 y의 값을 바꾸고 싶을 때] - 스와핑
		 * temp라는 머시기에 임시로 담아놔야 제대로 바뀐다.
		 * 그냥 x=y하는 순간 x는 5로 바뀌어서 제대로 바뀌지 않는다.
		 * (코드는 처음부터 차례대로 읽으므로 동시에 할 수 없다)
		 */
		
		int temp = x;	// x를 temp에 담아라
		x = y; // x가 비었으니 y를 x에 담아
		y = temp; // 이제 temp를 y에 담아
		
		// temp이 빈 통이라고 생각하면 된다. (임시) ★자주쓰임!
		
		// ★[팁] 줄 앞에서 컨트롤+알트+(아래)방향키 하면 그 줄이 복사가 된다
		
		System.out.println("x:" + x + " , y:" + y);
	}

}
