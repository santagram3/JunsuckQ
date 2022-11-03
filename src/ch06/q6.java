package ch06;

public class q6 {

	// (x,y) (x1,y1) . 두 점 와 간의 거리를 구한다
	static double getDistance(int x, int y, int x1, int y1) {
	
	
		
		int a = Math.abs(x1-x);
		
		int b = Math.abs(y1-y);
		
		int c = a*a + b*b;
		double t = Math.sqrt(c);
		
		return t;
	}

	public static void main(String args[]) {
		System.out.println(getDistance(1, 1, 2, 2));
	}

}
