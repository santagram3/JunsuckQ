package ch05;

public class q9_1 {

	public static void main(String[] args) {
		// . 큰 금액의 동전을 우선적으로 거슬러 줘야한다
		int money = 3690;
		System.out.println("money=" + money);
		int[] coinUnit = { 500, 100, 50, 10 }; // 동전의 단위
		int[] coin = { 5, 5, 5, 5 }; // 단위별 동전의 개수
		for (int i = 0; i < coinUnit.length; i++) {
			if (money / coinUnit[i] >= 5) {
				
				System.out.println(coinUnit[i]+"원 : "+coin[i]+"개");
				money = money - (coinUnit[i] * coin[i]);
				
				coin[i] = 0;
			} else if (money / coinUnit[i] < 5) {
				
				coin[i] = money / coinUnit[i];
				System.out.println(coinUnit[i]+"원 : "+coin[i]+"개");
				money = money % coinUnit[i];
				coin[i] = money / coinUnit[i];
			}
		} // for 
		if(money > 0) {
			System.out.println("=====================");
			System.out.println("거스름돈이 부족합니다 .");
			System.exit(0); // . 프로그램을 종료한다
		}else if(money <= 0){
			System.out.println("=====================");
			System.out.println("남은 동전 갯수 ");
			for (int j = 0; j < coin.length; j++) {
				System.out.println(coinUnit[j]+"원 : "+coin[j]+"개");
			}
		}
		
	} // main 
}
// class
