package ch04;

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) . 의 결과를 계산하시오*/
		
		int sumi = 0;
		int totalSum = 0;
		
		
		for (int i = 1; i <=10; i++) {
			sumi += i ; // i의 첫 값은 1  
			// 1 을 totalSum 에 넣으면 첫번째 값이 완성 된다 
			totalSum += sumi;
		}
		// i가 2가되면 sum 은 아까 넣었던 1 과 지금 for 문이 돌아가서 2가되서 2를 더해준다 1+2 ~ 이런식으로 for문이 다돌아가면 된다 .
		
		System.out.println(totalSum);
		
		
		
	}

}
