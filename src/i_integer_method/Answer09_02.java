package i_integer_method;

/**
 * 【Integerのメソッド】
 * 下記の例では、maxメソッドで数値の大小を比較し、結果をコンソールに表示しています。
 * 同様にminメソッドを使用して「数値の大小を比較」し、結果をコンソールに表示してみましょう。
 */

public class Answer09_02 {

	public static void main(String[] args) {
		int maxValue = Integer.max(100, 50);

		System.out.println("大きい数値は「" + maxValue + "」です。");

		int minValue = Integer.min(100, 50);

		System.out.println("小さい数値は「" + minValue + "」です。");
	}
}

/*
本当にmaxに倣えば問題ない。
こういうInteger系のメソッドあるんだ～　という回。

*/