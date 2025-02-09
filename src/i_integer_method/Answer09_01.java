package i_integer_method;

/**
 * 【Integerのメソッド】
 * 下記の例では、parseIntメソッドで文字列を整数型に変換し、判定結果をコンソールに表示しています。
 * 同様にvalueOfメソッドで「文字列を整数型に変換」し、判定結果をコンソールに表示してみましょう。
 */

public class Answer09_01 {

	public static void main(String[] args) {
		int value = Integer.valueOf("100");

		if(value < 500) {
			System.out.println(value + "は500未満");
		} else {
			System.out.println(value + "は500以上");
		}
	}
}




/*
parseIntメソッド…文字列を整数型に変換
valueOfメソッド…整数型を文字列に変換


Q【Integerのメソッド】
Java_training i_integer_method Question9_01について
.valueOfと.parseIntの違いと使い分けることによって生じるメリットを教えていただきたいです。
違いについては調べてみた結果返す値が違う（int型とIntegerクラス）とのことでしたがそれによってなにが変わるのか、までは理解できませんでした。
よろしくお願いいたします。

A.
"返す型にnullが欲しいかどうかで使い分ける。.parseInt　int型→nullなし、.valueOf　Integer→nullあり
処理の速度が若干.parseIntのほうが速いのでこちらのほうがよく使われる。"

*/