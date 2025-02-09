package h_string_method;

/**
 * 【Stringのメソッド】
 * 下記の例では、matchesメソッドで「正規表現」を使用して文字列が
 * 「数字だけ構成されているか」を判定し、結果をコンソールに表示しています。
 * 同様に「数字と数字以外で構成されている文字列」の判定結果をコンソールに表示してみましょう。
 */

public class Answer08_04 {

	public static void main(String[] args) {
		String numberOnly = "0231445145113123";
		String regex = "^[0-9]+$";

		if(numberOnly.matches(regex)) {
			System.out.println("「" + numberOnly + "」は数字だけで構成されています。");
		}

		String numberNotOnly = "今日は私の32歳の誕生日です。";
		if(!numberNotOnly.matches(regex)) {
			System.out.println("「" + numberNotOnly + "」は数字だけで構成されていません。");
		}
	}
}


/*
regex…正規表現

コツ….matchesで新たに「数字と数字以外で構成されている文字列」の正規表現を考えなきゃいけないように感じるかもしれないが、
既存のregex変数　＝数字だけで構成されている　は　else ＝　数字以外の文字列も含んでいる　を判定できるため正規表現の新規作成不要。

あとはif文の先頭に!をつけられるかどうかになる。
*/