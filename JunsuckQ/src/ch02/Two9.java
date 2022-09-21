package ch02;

public class Two9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 다음 중 형변환을 생략할 수 있는 것은 ? (모두 고르시오) 
		byte b = 10;
		char ch = 'A';
		int i = 100;
		long l = 1000L;
		
		 b= (byte)i; // byte = (byte)i = i는 int로 byte 보다 크기때문에 형변환을 해야된다
		 ch = (char)b; // 알아서 형변환이 된다 char=2byte , b=1byte 이기때문에  
		 short s = (short)ch; // short 도 2byte , ch도 2byte 로 둘다 2byte 이기때문에 안바꿔도 된다 
		 float f = (float)l; // float 는 4byte , l = 8byte 이기때문에 형변환 해야 된다 
 		 i = (int)ch; //i = 4byte , char = 2byte 이기때문에 형변환을 안해도 된다  
		
 		 
// 		정답 
//		
// 		a. b = (byte)i; // int(4byte) byte(1byte) → 이므로 반드시 형변환 필요
// 		b. ch = (char)b; // byte(1byte) char(2byte) → 이지만 범위가 달라서 형변환 필요
// 		c. short s = (short)ch; // char,short 2byte 은 이지만 범위가 달라서 형변환 필요
// 		d. float f = (float)l; // float(4byte) long(8byte) 의 범위가 보다 커서 생략가능
// 		e. i = (int)ch; // char(2 byte) int(4byte) → 이므로 생략가능
//		
		
	}

}
