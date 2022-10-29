package ch04;

class q14 {
	public static void main(String[] args) {
		// 1~100 answer . 사이의 임의의 값을 얻어서 에 저장한다
		int answer = (int) (Math.random() * 100);
		int input = 0; // 사용자입력을 저장할 공간
		int count = 0; // 시도횟수를 세기위한 변수
		// Scanner 화면으로 부터 사용자입력을 받기 위해서 클래스 사용
		java.util.Scanner s = new java.util.Scanner(System.in);
		do {
			count++;
			System.out.println("1~100사이의 숫자를 입력하세요");
			input = s.nextInt(); // input . 입력받은 값을 변수 에 저장한다
			if(input == answer) {
				System.out.println("당신이 입력한 횟수는" + count+"회 입니다.");
				
				System.out.println("당신이 입력한 숫자는 : " +input+"입니다 " );
				System.out.println("정답입니다." );
				break; 
			}else if (input > answer) {
				System.out.println("당신이 입력한 횟수는" + count+"회 입니다.");

				System.out.println("당신이 입력한 숫자보다 작습니다." );
				System.out.println("===========================");
				continue;
				
			}else if (input < answer) {
				System.out.println("당신이 입력한 횟수는" + count+"회 입니다.");
				System.out.println("당신이 입력한 숫자보다 큽니다. " );
				System.out.println("===========================");
				continue;
			}

		} while (true); // 무한반복문
	} // end of main
} // end of class