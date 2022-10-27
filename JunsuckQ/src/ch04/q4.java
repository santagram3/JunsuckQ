package ch04;

import java.util.Iterator;

public class q4 {

	public static void main(String[] args) {
		/*
		 * 1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이 100 . 이상이 되는지 구하시오
		 * 
		 */
		int sum = 0; 
		
		for (int i = 0; i <10000; i++) {
			if(i%2 == 1) {
				sum +=i;
			}else if(i%2==0) {
				sum -=i;
			}
			if(sum >=100) {
				System.out.println("i = "+i);
				break;
			}
		}
		
	
	}

}
