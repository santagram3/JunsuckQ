package ch03;

public class q1 {

	public static void main(String[] args) {
		
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A' 65
		
		System.out.println(1 + x << 33);  // 비트연산자 안함 . 
		System.out.println(y >= 5 || x < 0 && x > 2); // 
		// true || false && false  // true 란다 ;; 
		System.out.println(y += 10 - x++);// 15-2 ? 13 
		System.out.println(x+=2); // 2+2 // 이거 왜 5 인지 모르겠음 
		System.out.println( !('A' <= c && c <='Z') ); // ! (true && true ) == false 
		System.out.println('C'-c); // 67 - 5 = 62  // 이건왜 2 임 ? 
		System.out.println('5'); // 이건왜 그냥 5 일까 ... 
		System.out.println('5'-'0'); // 이건왜 그냥 5 일까 ? 
		System.out.println(c+1); // 66
		System.out.println(++c); // 66 // 왜 B 가 되는지 모르겠음 
		System.out.println(c++); // 65 // 위에가 B라면 밑에서부터 이해는됨 
		System.out.println(c); // 65 

		
		
		
		
	}

}
