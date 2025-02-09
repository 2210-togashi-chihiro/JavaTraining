package l_try_catch;

/**
 * 【例外処理】
 * 下記の例では、「FileNotFoundException」が発生しないように「FileReader」でファイルを開く前に
 * if文を使って「ファイルが存在するかどうか」の判定をしています。
 * 同様に「数字に変換できない時」に発生する「NumberFormatException」が発生しないように
 * if文を使用し、判定をしてみましょう。
 */

public class Answer12_04 {

	public static void main(String[] args) {
		String notNumber = "1185-KaMaKuRa";
		int num;

		if(!notNumber.matches("^[0-9]+$")) {
			System.out.println("「" + notNumber + "」が数字ではないため、returnで処理を終了します。");
			return;
		}

		try {
			num = Integer.parseInt(notNumber);
		} catch(NumberFormatException e) {
			System.out.println("数字に変換できませんでした。");
			System.out.println(e);
		}
	}

}


/*

12-1でtryとcatchはやったなというところをまず思い出して、if以降は書き出せそう。
ではifの中身はどうやれば書けるのか。
ifは

以下自分の回答例
	4. return文の注意点
	return文は値を戻すだけでなく、メソッドの終了も行います。
	そのため、return文の後に処理を書いても実行ができません(コンパイルエラーになります)。　　ので、コメントアウトで対応

//		File file = new File("sample.txt");
//
//if(!file.exists() ) {
//	System.out.println("ファイルの存在が確認できなかったので、returnで処理を終了します。");
//	return;
//}
//
//try {
//	FileReader fr = new FileReader(file);
//} catch(FileNotFoundException e) {
//	System.out.println("ファイルが存在しません。");
//	System.out.println(e);
//}

String changeCharacter = "aierjgai123";
if(!changeCharacter.matches("^[0-9]+$")) {
	System.out.println("数字に変換できません。処理を終了します。");
	return;
}

int num;

try {
	num = Integer.parseInt(changeCharacter);
} catch(NumberFormatException e) {
	System.out.println("数字に変換できませんでした。");
	System.out.println(e);
}

}

*/