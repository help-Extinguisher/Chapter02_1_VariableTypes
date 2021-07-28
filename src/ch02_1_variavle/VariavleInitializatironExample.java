package ch02_1_variavle;

public class VariavleInitializatironExample {
	// 클래스 이름은 앞이 대문자. 단어 앞도 대문자로 씀
	// 카멜 (낙타)? 표기법이라고 함
	// 숫자가 앞에 오면 안됨...
	public static void main(String[] args) {
		// 변수 value 선언
		int value;
		
		// 변수 value 값을 읽고 10을 더하는 산술 연산을 수행
		// 연산의 결과값을 변수 result의 초기값으로 저장
		
		value = 1;	// value는 이름일뿐이다...
		// 변수 이름은 통상적으로 소문자만 쓴다 (대문자x)
		int result = value + 10;
				
		// 변수 result 값을 읽고 콘솔에 출력
		System.out.println(result);
		
		// 변수의 반대말은 상수.
		// 상수는 그럼? 고정되어 있는 값임
		// 그럼 변수는? 변할수 있는 값임
		// wow...
	}

}
