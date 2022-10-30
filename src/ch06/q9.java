package ch06;

public class q9 {

	/*
	 * 단 모든 병사의 공격력과 방어력은 같아야 한다
	 */
	/*
	 * int weapon = 6; // 공격력 int armor = 0; // 방어력 모든 인스턴스가 , 공통적인 값을 가져야하는 변수는 클래스
	 * 변수 변수 로 선언해야한다 (static )
	 */
	/*
	 * void weaponUp() { weapon++; }
	 * 
	 * void armorUp() { armor++; }
	 * 
	 * 
	 * 그것과 관련있는 메소드 또한 static 를 붙여야헌다
	 */

	int x = 0, y = 0; // Marine (x,y) 의 위치좌표
	int hp = 60; // 현재 체력
	int weapon = 6; // 공격력
	int armor = 0; // 방어력

	void weaponUp() {
		weapon++;
	}

	void armorUp() {
		armor++;
	}

	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}

}
