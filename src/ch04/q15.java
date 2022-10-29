package ch04;

class q15 {
	public static void main(String[] args) {

		int number = 12321;
		int tmp = number;
		// while 을 멈출 불린 만들기 
		boolean stop = true ; 
		// 띄어내기 쉽게 스트링으로 만들기 
		String strNum = Integer.toString(tmp);
		// 문자로 받을 s 만들기 
		String s ="";
		int result = 0; // number 변수 를 거꾸로 변환해서 담을 변수
		
		while (stop) {
			for (int i = 0; i < strNum.length(); i++) {
				// 끝에서부터 하나씩 char로 띄어내기
				char start = strNum.charAt(strNum.length()-1-i);
				// 더하기위해서 char 를 String 으로 만들기 
				String str = String.valueOf(start);
				// 띄어낸 스트링 s 에다가 더하기 
				s += str ;
			}
			// 다 더한 s를 스트링에서 인트로 바꾸기 
			int num = Integer.parseInt(s);
			// 인트로 바꾼 num 을 결과에 넣어주기 
			result = num;
			stop = false;
		}
		if (number == result) {
			System.out.println(number + "는 회문수 입니다 .");
		} else {
			System.out.println(number + "는 회문수가 아닙니다 .");
		}

	} // end of main
} // end of class