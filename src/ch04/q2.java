package ch04;

public class q2 {

	public static void main(String[] args) {
		/* 1~ 20 1부터 20까지의 정수 중에서 2또는 3의 배수가 아닌 수의 총합을 구하시 */
		int sum = 0;
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				continue;
			} else if (i % 3 == 0) {
				continue;
			} else {
				sum += i;
				System.out.println(i);
			}
		}
		System.out.println(sum);

	}

}
