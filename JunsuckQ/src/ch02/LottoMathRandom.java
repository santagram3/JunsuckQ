package ch02;

public class LottoMathRandom {

	public static void main(String[] args) {

		// 기본 Math.random()
		// 0.0 <= Math.random()범위 < 1.0
		double num1 = Math.random();
		System.out.println("num1 = " + num1);

		// 범위 늘리기
		// 0.0 <= Math.random()범위 < 10.0
		double num2 = Math.random() * 10;
		System.out.println("num2 = " + num2);

		// 소수점 떼기
		// 0 <= Math.random()범위 < 10
		int num3 = (int) (Math.random() * 10);
		System.out.println("num3 = " + num3);

		// 45까지 랜덤 숫자 늘려주기
		// 0 <= Math.random()범위 < 45
		int num4 = (int) (Math.random() * 45);
		System.out.println("num4 = " + num4);

		// 첫번째 숫자 1로 만들어주기 , 마지막 숫자 45로 만들어주기(보정) 
		// 1 <= Math.random()범위 < 45
		int num5 = (int) (Math.random() * 44 +1);
		System.out.println("num5 = " + num5);
		
		int[] LottoArr  = new int[6];
		
		// 로 또 번 호 / 추출해서 배열에 넣기 !  
		for (int i = 0; i < LottoArr.length; i++) {
			int num6 = (int) (Math.random() * 44 +1);
			LottoArr[i] = num6;
		}
		
		// 로또번호 받기 ! 
		for (int i = 0; i < LottoArr.length; i++) {
			System.out.println(" 번호 : "+LottoArr[i]);
		}
		
		
		
		

	}

}
