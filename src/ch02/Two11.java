package ch02;

public class Two11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		
//		[2-11] 다음중 변수를 잘못 초기화 한 것은 모두 고르시오 ? ( )
//				a. byte b = 256;
//				b. char c = '';
//				c. char answer = 'no';
//				d. float f = 3.14
//				e. double d = 1.4e3f; 
		
		// 답 a  = byte 는 127 까지 저장할수잇음 
		//    b = char 는 뭐라도 넣어야 됨 
		//  c = char 에는 2개의 문자를 저장할수 없다 
		//  d = 3.14 는 기본적으로 double 로 취급되기때문에 형변환 안해서 틀림 
		System.out.println(1.4e3f); //1400.0 이런값이 나옴 
 
		
		
	}

}
