package ch04;

public class q9 {

	public static void main(String[] args) {
		/*
		 * 숫자로 이루어진 문자열 이 있을 때 각 자리의 합을 더한 결과를 출력하는 코 str , 드를 완성하라 만일 문자열이 라 . "12345"
		 * 면 의 , ‘1+2+3+4+5’ 결과인 를 출력이 출력되 15 어야 한다 에 알맞은 코드를 넣으시오 . (1) . [Hint] String
		 * charAt(int i) 클래스의 을 사용
		 * 
		 */

		String str = "12345";
		int sum = 0;
		int strNum = Integer.parseInt(str);
		for (int i = 0; i < str.length(); i++) {
			// 나눠서 1의 자리숫자를 sum 에 넣고 
			sum +=strNum % 10 ;
			// 다시 10으로나눠서 
			strNum = strNum/10; 
		}
		System.out.println("sum=" + sum);

	}

}
