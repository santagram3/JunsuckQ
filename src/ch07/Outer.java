package ch07;

class Outer {
	int value = 10;
	class Inner {
		int value = 20;

		void method1() {
			int value = 30;// 매서드 안에 지역변수 
			System.out.println(value);
			// inner 의 전역변수  // this 는 자기 자신을 가르키는 클래스 
			System.out.println(this.value); 
			// outer 의 전역변수 // outer 자기 자신의 value  
			System.out.println(Outer.this.value);
		}
	} // Inner클래스의 끝
} // Outer클래스의 끝


