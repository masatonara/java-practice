package myproject;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a;
		a = 100;
		a++;
		System.out.println(a);
		
		// 代入時の自動変換
		float f = 3;
		double d = f;
		System.out.println(f);
		System.out.println(d);
		
		//強制的な型変換 
		int age = (int)3.2;
		System.out.println(age);
		//コンパイル結果は３と表示
		
		//異なる同志の算術演算
		double e = 8.5/2;
		long l = 5 + 2L;
		System.out.println(e);
		System.out.println(l);
		
		//文字型の連結
		String msg = "私の年齢は" + 23;
		System.out.println(msg);
		
		//命令実行文
		String name = "菅原";
		String message;
		message = name + "さん,こんにちわ";
		System.out.println(message);
		//改行なしの画面出力
		System.out.print("私の名前は");
		System.out.print(name);
		System.out.print("です");
		
		//大きい方に数値を代入
		int x = 5;
		int y = 3;
		int z = Math.max(x, y);
		System.out.println("比較実験:" + x + "と" + y + "とで大きい方は・・・" + z );
		
		//String型をint型に変換する命令
		String Age = "31";
		int n = Integer.parseInt(Age);
		System.out.println("あなたは来年、" + (n + 1) + "歳になりますね。");
		
		//ランダム数の生成
		int r = new java.util.Random().nextInt(90);
		System.out.println("あなたは多分、" + r + "歳ですね？");
		
		//キーボードから入力を受け付ける
		System.out.println("あなたの名前を入力してください。");
		String Name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください。");
		int ages = new java.util.Scanner(System.in).nextInt();
		System.out.println("ようこそ、" + ages + "際の" + Name + "さん");
	}
}
