package ch07;

public class q27 {
	
	public static void main(String[] args) {
			
		Outer out = new Outer();
		Outer.Inner ouin = out.new Inner();
		
		ouin.method1();
		
		
		// inner.method1();

	}

}
