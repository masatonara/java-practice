package myproject;

public class Main {

	public static void main(String[] args) {
		// 練習問題
		
		int x = 5;
		int y = 10;
		String ans = "x+yは" + (x + y);
		System.out.println(ans);
		
		//占いゲーム
		
		System.out.println("占いの館へようこそ");
		System.out.println("あなたの名前を入力してください");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください");
		String ageString = new java.util.Scanner(System.in).nextLine();
		int age = Integer.parseInt(ageString);
		int fortune = new java.util.Random().nextInt(4);
		fortune++;
		System.out.println("占い結果が出ました！");
		System.out.println(age +"際の" + name + "さん、あなたの運気番号は" + fortune + "です");
		System.out.println("１：大吉　２：吉　３：中吉　４：凶");
	}
}
