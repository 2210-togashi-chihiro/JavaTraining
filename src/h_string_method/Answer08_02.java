package h_string_method;

/**
 * 【Stringのメソッド】
 * 下記の例では、substringメソッドで文字列の6文字目から8文字目を抜き出して、その結果をコンソールに表示しています。
 * substringを応用して13文字ある例題の文字列から「名前はALH太郎」をコンソールに表示してみましょう。
 */

public class Answer08_02 {

	public static void main(String[] args) {
		String greeting = "私の名前はALH太郎です。";
		String part = greeting.substring(2, 10);

		System.out.println(part);
	}
}

/*
substringの開始位置について：インデックス番号は0から始まるところがみそ
あとは以下のように、開始位置のみを指定することも可能。

	##開始位置のみを指定する場合
	構文：「対象の文字列.substring(開始位置);」

	##終了位置を指定する場合
	構文：「対象の文字列.substring(開始位置,終了位置);」
*/