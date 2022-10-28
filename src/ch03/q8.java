package ch03;

public class q8 {

	public static void main(String[] args) { // 
		byte a = 10;
		byte b = 20;
		int c = a + b; // 여기밖에 못고침 .. 
		char ch = 'A';
		//ch = ch + 2;
		float f = (float)3 / 2;
		long l = 3000 * 3000 * 3000; // 
		float f2 = 0.1f;
		double d = 0.1;
		boolean result = d==f2;
		System.out.println("c="+c); // 맞춤 
		System.out.println("ch="+ch); // 틀림 
		System.out.println("f="+f); // 맞춤 
		System.out.println("l="+l); // 여기모름 
		System.out.println("result="+result); // 여기모름..
	}

}
