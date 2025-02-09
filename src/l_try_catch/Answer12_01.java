package l_try_catch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * 【例外処理】
 * 下記の例では、「存在しないファイルを開こうとした時」に発生する「FileNotFoundException」をキャッチし、
 * 例外発生時のメッセージをコンソールに表示しています。
 * 同様に「数字に変換できない時」に発生する「NumberFormatException」を発生させてキャッチし、
 * 例外発生時のメッセージをコンソールに表示してみましょう。
 */

public class Answer12_01 {

	public static void main(String[] args) {
		File file = new File("sample.txt");

		try {
			FileReader fr = new FileReader(file);
		} catch(FileNotFoundException e) {
			System.out.println("ファイルが存在しません。");
			System.out.println(e);
		}

		String notNumber = "1185-KaMaKuRa";
		int num;

		try {
			num = Integer.parseInt(notNumber);
		} catch(NumberFormatException e) {
			System.out.println("数字に変換できませんでした。");
			System.out.println(e);
		}
	}

}

/*
例外の発生する状況
ゼロによる割り算以外にも、例外が投げられる原因はさまざまです。
基本的には、「想定外のことが起きて、そのまま処理を継続できない」という状況が発生したときに例外が投げられます。

基本構文
	try {
		//tryブロック
		//本来実行したい処理を記述する
		//例外が発生する（投げられる）可能性がある
	}catch(例外の型 変数名) {
		//catchブロック
		//例外が投げられたときの処理を記述する
	}finally {
		//finallyブロック
		//最後に必ず行う処理を記述する
	}

1.	tryブロックには、本来実行したい処理を記述します。ただし、実行中に例外が投げられる可能性があります。
　　「途中でトラブルが発生するかもしれないけれどトライしてみる」というわけです。

2.	tryブロックの中でトラブルが発生して例外が投げられた場合、それ以降の処理をスキップしてcatchブロックの中に処理が移ります
　　(ループ処理の中でbreak文が実行されるのに似ています)。catchブロックの引数には、投げられた例外の種類を表す例外オブジェクトが渡されます。
　　そのため、catchブロックの引数には、変数の宣言と同じように型と変数名を指定します。

3.	例外が投げられても投げられなくても、finallyブロックに記述した処理は、try-catch文の最後に必ず実行されます。
　　finallyブロックは省略することができます。


例外が投げられなかった通常の処理では、catchブロックの中にある命令文は実行されません。
tryブロックの中でトラブルが発生し例外が投げられると、その時点で処理がcatchブロックヘジャンプし、その中にある命令文が実行されます。

まとめ
●	プログラム実行中に、そのままでは処理を継続できないトラブルが発生したときには例外が投げられます。
●	例外の発生する可能性のある処理をtryブロックに記述すると、例外が投げられたときにcatchブロックで処理できます。
●	finallyブロックは、例外の発生の有無にかかわらず実行されます。
●	例外が発生した場所にcatchブロックがない場合、メソッドの呼び出し元に戻ってcatchブロックが検索されます。


*/