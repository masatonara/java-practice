package myproject;

public class Main {

	public static void main(String[] args) {
		//3章　条件分岐
		//九九に式
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i * j); //掛け算の結果を出力
				System.out.println("　"); //空白を出力
			}
			System.out.println(""); //改行を出力
		}
	}
}
