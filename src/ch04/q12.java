package ch04;

public class q12 {

	public static void main(String[] args) {
		/*
		 * 방정식 의 모든 해를 구하시오 단 와 는 정수이고 각각의 범위는 2x+4y=10 . , x y 0<=x<=10, 0<=y<=10 . .
		 */
		for (int x = 2; x <= 9; x++) {
			for (int y = 1; y <= 3; y++) {
				System.out.println(x+"x"+y+"="+x*y);
			}
			System.out.println("=========================");
		}

	}

}
