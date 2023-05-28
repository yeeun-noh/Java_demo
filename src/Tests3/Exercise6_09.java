package Tests3;
//컴퓨턱게임의 병사(Marine)를 클래스로 정의함, 이 클래스의 멤버중에 static을 붙여야 하는것은 어떤것들이고 그이유는?
//(단, 모든 병사의 공격력과 방어력은 같아야함)

//=> 답: weapon, armor (weaponUp(), armorUp() 도 static을 붙여주어야함)
//=> 이유: 모든 병사의 공격력과 방어력은 같아야 하므로(하나의 공격력과 하나의 방어력을 공통으로 사용), static을 붙여서 일정하게 사용하도록 함 (병사마다 각각의 위치좌표와 체력은 계속해서 변함)

class Marine {
	int x=0, y=0;	//Marine의 위치좌표(x,y)
	int hp = 60;	//현재 체력
	int weapon = 6;	//공격력
	int armor = 0;	//방어력
	
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

public class Exercise6_09 {}
