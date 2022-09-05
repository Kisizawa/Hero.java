
public class Hero {
	//初期化用ゾーン
	int hp;
	int mp;
	String name;
	
	
	
	//ヒーローの初期能力
	public Hero(String name) {
		this.hp = 100;
		this.mp = 40;
		this.name = name;
		
	}
	//初期能力の違うヒーローを作るとき
	public Hero(String name,int hp,int mp) {
		this.name=name;
		this.hp=hp;
		this.mp=mp;
	}

}
