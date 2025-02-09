package l_try_catch;

/**
 * 【例外処理】
 * 「配列の要素数を超えるインデックスにアクセスした時」に発生する
 * 「ArrayIndexOutOfBoundsException」を発生させてキャッチし、
 * 例外発生時のメッセージをコンソールに表示してみましょう。
 */

public class Answer12_03 {

	public static void main(String[] args) {
		String[] whatDayOfWeeks = {"月", "火", "水", "木", "金", "土", "日"};
		int index = 100;

		try {
			System.out.println(whatDayOfWeeks[index]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("配列の要素数を超えるインデックスにはアクセスできません。");
			System.out.println(e);
		}
	}

}



/*
配列の作り方を覚えていればあまり困ることはなさそう。
資料としては2.例外オブジェクトの種類による場合分け、3.例外のクラス階層 あたりに記述がある。

例外オブジェクトのまとめ
●	プログラム実行時にトラブルが起こると、例外オブジェクトが投げられます。
●	例外オブジェクトとは、例外の内容に対応したExceptionクラスのサブクラスのオブジェクトです。
　　このオブジェクトがcatchブロックの引数に渡されます。
●	catchブロックを並べて、例外の内容に応じた処理の場合分けを行えます。



自分の回答例も念のため。

public static void main(String[] args) {
	String[] whatDayOfWeeks = {"月", "火", "水"};

	try {
		String TodayWeak;
		TodayWeak = whatDayOfWeeks[3];
	} catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("配列の要素数を超えるインデックスを指定しています。");
		System.out.println(e);
	}
}

}

*/