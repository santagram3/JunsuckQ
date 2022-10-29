package ch04;

public class q11 {

	public static void main(String[] args) {
		/*
		 * [4-11] 피보나치 수열 은 앞을 두 수를 더해서 다음 수를 만들어 나가 (Fibonnaci) ( ) 數列 는 수열이다 예를 들어 앞의
		 * 두 수가 과 이라면 그 다음 수는 가 되고 그 다음 수는 . 1 1 2 1 2 3 1,1,2,3,5,8,13,21,... . 1 1 과 를
		 * 더해서 이 되어서 과 같은 식으로 진행된다 과 부터 시작하는 피보나치수열의 번째 수는 무엇인지 계산하는 프로그램을 완성하시오 10 .
		 * 
		 */
		// 이건답 봤음 

		int num1 = 1;
		int num2 = 1;
		int num3 = 0; // 세번째 값
		System.out.print(num1 + "," + num2);
		for (int i = 0; i < 8; i++) {
			num3 = num1 + num2 ; 
			System.out.print(","+num3);
			
			num1 = num2 ;
			num2 = num3 ; 
			
		}

	}

}
