package d_array_for;

/**
 * 【繰り返し】
 * 九九の7の段(7 ～ 63)をコンソールに表示してください。
 * ※配列は使用しません。
 */

public class Answer04_03 {

	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			System.out.println("7かける" + i + " = " + i * 7);
		}
	}

}

//これは割とシンプルだった。
//for文の構文をソラで書けるかと、7の段は9までってところと、1ずつ足していくっていう所。
//あとはコンソール出力時の工夫が出来るか。