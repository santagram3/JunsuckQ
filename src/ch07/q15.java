package ch07;

public class q15 {

	public static void main(String[] args) {
		Unit u = new GroundUnit(); // 이것도 자동 형변환 
		Tank t = new Tank();
		AirCraft ac = new AirCraft();
		
		// 
			
		 u = (Unit)ac; // 
		 System.out.println(u);
		 u = ac;  // 
		 GroundUnit gu = (GroundUnit)u;
		 AirUnit au = ac;
		 t = (Tank)u;
		 //GroundUnit gu = t;


	}

}
