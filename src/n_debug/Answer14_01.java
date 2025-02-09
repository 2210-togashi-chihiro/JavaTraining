package n_debug;

/**
 * 【デバッグ】
 * プログラミングにはバグやエラーがつきものです。
 * 入力間違いや勘違いなど、様々な理由でバグやエラーが発生します。
 *
 * エラーの種類は大きく分けて2つに分類されます。
 * ①コンパイルエラー：作成したJavaプログラムをコンパイルするときに起きるエラーです。Eclipse上では赤い波線が表示されます。
 * ②ランタイムエラー：作成したJavaプログラムをコンパイルし、実行するときに起きるエラーです。Eclipse上では何も表示されません。
 *
 * バグやランタイムエラーが発生した場合に デバッグを用いて原因究明を行うことが多いです。
 * 実際に、デバッグを行いながら問題を解いていきましょう。
 *
 * 下記の例では、2つの文字列を比較し、trueをコンソールに表示しようとしています。
 * ところが実行すると異なる結果になります。正しく動作するように修正しましょう。
 */

public class Answer14_01 {

	public static void main(String[] args) {
		String str1 = "Harmonize";
		String str2 = "Harmo";
		String str3 = str2 + "nize";

		boolean result = stringComparison(str1, str3);
		System.out.println(result);
	}

	public static boolean stringComparison(String str1, String str2) {
		return str1.equals(str2);
	}

}

/*
デバッグで
	public static boolean stringComparison(String str1, String str2) {
に落ちるところまではただしそう、同じ文字列を比較してるなあ　というところまで見れれば、じゃああきらかに演算子が悪いのでは？
というところにたどり着けるという寸法っぽい？


String型などの参照型の場合に”==”演算子で比較すると参照先が同じかどうかを比較することになります。
参照先の値を比較する訳ではありません。

なんか参考になりそうなサイト：
https://www.sejuku.net/blog/21395

	String型は宣言、初期化時には擬似プリミティブ型として扱われますが、
	文字列を追加したときに参照型として扱われるようになります。

	したがって、値が同じであっても参照先が違うので”==”で比較した場合は”false”を返します。
	equalsメソッドで比較した場合は値が同じですので、”true”を返しています。


★以下【プログラミング言語基礎】振り返りテスト②の内容★

【参照型】
参照型にはNULLを代入することができます。
	String
	File
	Integer
	Long

【プリミティブ型】
プリミティブ型はNULLを代入できません。
	boolean
	int
	float
	char
	long


●等価演算子（==）によるプリミティブ型の比較では、オブジェクト内の値を比較します。(例：int == int)
●等価演算子（==）による参照型の比較では、オブジェクトの値ではなく参照先のインスタンスを比較します。(例：(integer == integer))
●equalsメソッドによる参照型の比較では、オブジェクトの参照先のインスタンスが持つ値を比較します。(例：integerA.equals(integerB))
●等価演算子（==）によるString型の比較では、オブジェクトの値ではなく参照先のインスタンスを比較します。
　String型は参照型ですが、別々の変数に同じ値を代入した場合、内部で自動的に同じ参照先として扱うという挙動になります。(例：stringA == stringB)　←AにもBにも　同じ値が入っている
●equalsメソッドによる参照型の比較では、オブジェクトの参照先のインスタンスが持つ値を比較します。(例：string.equals(string))
●等価演算子（==）によるString型の比較では、オブジェクトの値ではなく参照先のインスタンスを比較します。
　String型は参照型ですが、別々の変数に同じ値を代入した場合、内部で自動的に同じ参照先として扱うという挙動になります。
　ただし、newを用いて明示的にStringのインスタンスを生成した場合は、別の参照先として扱われます。
　例：
	String stringA = "文字列";
	String stringB = new String(stringA);
	System.out.println(stringA == stringB);

●等価演算子（==）によるString型の比較では、オブジェクトの値ではなく参照先のインスタンスを比較します。
　インスタンスに別のインスタンスを代入した場合は、同じ参照先となります。
　例：
	String stringA = "文字列";
	String stringB = stringA;
	System.out.println(stringA == stringB);

*/