package h_string_method;

/**
 * 【Stringのメソッド】
 * 下記の例では、splitメソッドで文字列を指定した文字で分割し、結果をコンソールに表示しています。
 * 同様に「2020-12-31」をいう文字列を分割し、コンソールに「2020年12月31日」という文字列を表示してみましょう。
 */

public class Answer08_03 {

	public static void main(String[] args) {
		String department = "CEH,MTL,AMU,ROU,GAU,FAU";
		String[] departments = department.split(",");

		for(int i = 0; i < departments.length; i++) {
			System.out.println(departments[i]);
		}

		String sampleDate = "2020-12-31";
		String[] splitDate = sampleDate.split("-");

		System.out.println(splitDate[0] + "年" + splitDate[1] + "月" + splitDate[2] + "日");
	}
}



/*
 *
 * departments…部門　をスプリッドで複数に切り分けたので複数形になってるよ

split() は String 値のメソッドで、パターンを受け取り、
この文字列をパターン検索によって部分文字列の順序付きリストに分割し、
これらの部分文字列を配列に入れ、その配列を返します。

構文
split(separator)　separator…セパレーター
split(separator, limit)


separator
各分割がどこで行われるかを表すパターンです。
undefined、文字列、または Symbol.split メソッドを持つオブジェクトを指定することができます。
典型的な例は正規表現です。separator を省略したり undefined を渡したりすると、split() は呼び出し元の文字列を 1 つの要素とする配列を返します。
undefined でない値、または [Symbol.split]() メソッドを持つオブジェクトはすべて文字列に変換されます。

limit ※省略可※
配列に含める部分文字列の数の制限を指定する非負の整数。指定した場合は、指定した separator が出現するたびに文字列を分割しますが、
limit 個の項目が配列に格納された時点で分割を終了します。残った文字列は配列に格納されません。

制限数に達する以前に文字列の末尾に達した場合は、配列の要素が limit よりも少なくなることがあります。
limit が 0 の場合は、[] が返されます。

★スプリッドされた文字を取り出すとき★
String[]変数の中に入っているので、配列指定で取り出せばOK。
*/