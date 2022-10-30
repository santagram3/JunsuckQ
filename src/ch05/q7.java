package ch05;

public class q7 {
	public static void main(String[] args) {
		char[][] star = { { '*', '*', ' ', ' ', ' ' }, { '*', '*', ' ', ' ', ' ' }, { '*', '*', '*', '*', '*' },
				{ '*', '*', '*', '*', '*' } };
		char[][] result = new char[star[0].length][star.length];
		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length; j++) {
				if(star[i][j]==' ') {
					continue;
				}
				System.out.print(star[i][j]);
			}
			System.out.println();
			
		}
		System.out.println("=======================1");
		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length; j++) {
				/*star[i].length = 무조건 5 */
				if(star[star[i].length-2-j][i]==' ') {
					continue;
				}if(star[i].length-2-j<0) {
					continue;
				}
				System.out.print(star[star[i].length-2-j][i]);
				/*31 ,21 ,11 ,01*/
			}
			System.out.println();
		}
		System.out.println("=======================2");
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j]);
			}
			
		}
	} // end of main
}
// class
