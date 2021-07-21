package myproject;

public class Main {

	public static void main(String[] args) {
		//3章　条件分岐
		System.out.println("あなたの運勢を占います");
		int fortune = new java.util.Random().nextInt(5) +1;
		switch(fortune) {
		case 1:
		case 2:
			System.out.println("いいね！");
			break;
		case 3:
			System.out.println("普通です");
			break;
		case 4:
		case 5:
			System.out.println("うーん・・・残念");
		}
		
		for (int i = 0; i < 3; i++) {
			System.out.println("現在" + (i + 1) + "週目⇨");
		}
	}
}
