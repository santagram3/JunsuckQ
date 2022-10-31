package ch07;

public class q18 {
	
	static void action(Robot r) {
		if(r instanceof DanceRobot) {
			DanceRobot dc = (DanceRobot)r;
			dc.dance();
		}
		if(r instanceof SingRobot) {
			SingRobot sr = (SingRobot)r;
			sr.sing();
		}
		if(r instanceof DrawRobot) {
			DrawRobot dr = (DrawRobot)r;
			dr.draw();
		}
	}

	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
		for(int i=0; i< arr.length;i++) {
			action(arr[i]);
		}
		
	}

}
