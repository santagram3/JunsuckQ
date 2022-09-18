package ch02;

public class Two5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1" + "2"); // 문자 12 가 됨 
		System.out.println("========");
		System.out.println(true + ""); // 문자 true + 빈공백 
		System.out.println("========");
		System.out.println('A'+'B'); // char 타입으로 들어가서 계산된다 131 
		System.out.println("========");
		System.out.println('1'+2); // (char - int) + int = 51 
		System.out.println("========");
		System.out.println('1'+'2'); //(char - int) + (char - int) 99
		System.out.println("========");
		System.out.println('j'+"ava"); // String 으로 변환되서 들어감  
		//System.out.println(true + null); // 오류 
	
		
		
		
	}

}
