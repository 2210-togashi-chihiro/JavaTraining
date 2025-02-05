package f_method;

/**
 * 【メソッド】
 * 引数なし・戻り値なし
 * 下記の例では、mainメソッドからカウントダウンして、結果をコンソールに表示するメソッドを呼び出しています。
 * 同様に「カウントアップして、結果をコンソールに表示」するメソッドを作成し、mainメソッドから呼び出してみましょう。
 */

public class Question06_01 {

	public static void main(String[] args) {
		countDown();
	}

	private static void countDown() {
		System.out.println("カウントダウン");

		for(int i = 5; i >= 0; i--) {
			System.out.println(i);
		}
	}
}