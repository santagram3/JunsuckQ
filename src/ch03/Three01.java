package ch03;

public class Three01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(true || true); //true 
		System.out.println(true || false );//true
		System.out.println(false || true );//true
		System.out.println(false || false );//false 
		System.out.println("====================");
		
		System.out.println(true || true || true); //true 
		System.out.println(true || false || false );//true
		System.out.println(true || true && true); //true 
		System.out.println(true || false && false );//true
		System.out.println("====================");
//		System.out.println(false || true );//true
//		System.out.println(false || false );//false 
		
		System.out.println(true && true  ); // true
		System.out.println(true && false );//false 
		System.out.println(false && true);//false 
		System.out.println(false && false);//false 
		
		System.out.println("====================");
		System.out.println(true && true || true ); // true
		System.out.println(true && false || false);//false 
		System.out.println(true && false || true);//false 
		
		
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A' 65 의 문자코드는
//		System.out.println(1 + x << 33);  // 이건 비트연산자 이건 잘 못하겠다 
//		System.out.println(y >= 5 || x < 0 && x > 2);  // 결론 false 
		// y >= 5 = true , x < 0 = false ,x > 2 false 
//		System.out.println(y += 10 - x++);
//		System.out.println(x+=2);
//		System.out.println( !('A' <= c && c <='Z') );
//		System.out.println('C'-c);
//		System.out.println('5'-'0');
//		System.out.println(c+1);
//		System.out.println(++c);
//		System.out.println(c++);
//		System.out.println(c);


	}

}
