package ch05;

public class q6 {

	public static void main(String[] args) {
		// . 큰 금액의 동전을 우선적으로 거슬러 줘야한다
		int[] coinUnit = { 500, 100, 50, 10 };
		int money = 2680;
		int[] coinHow = new int[4]; // 갯수 담을 배열 만들기 
		System.out.println("money="+money);
		for(int i=0;i<coinUnit.length;i++) {
			// 새로 만든 배열에 큰금액의 동전으로 나눈 갯수 넣어줌 
			coinHow[i] = money/coinUnit[i];
			System.out.println(coinUnit[i]+"원 : "+coinHow[i]+"개");
			// 큰금액으로 나눈 나머지를 넣어줌 그렇고 그걸 money 에 넣어줌 // 
			money = money%coinUnit[i];		
		}
	}

}
