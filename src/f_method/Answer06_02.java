package f_method;

/**
 * 【メソッド】
 * 引数あり・戻り値なし
 * 下記の例では、カウントダウンするメソッドに引数として、カウントダウンを開始する値を渡しています。
 * 同様にカウントアップするメソッドに「引数として、カウントアップを終了する値」を渡してみましょう。
 */

public class Answer06_02 {

	public static void main(String[] args) {
		int start = 10;
		int end = 10;
		countDown(start);
		countUp(end);
	}

	private static void countDown(int start) {
		System.out.println("カウントダウン");

		for(int i = start; i >= 0; i--) {
			System.out.println(i);
		}
	}

	private static void countUp(int end) {
		System.out.println("カウントアップ");

		for(int i = 1; i <= end; i++) {
			System.out.println(i);
		}
	}
}


/*
Qメソッドの説明の時に　引数と戻り値がないケースの説明があったと思うが、
　引数と戻り値がない場合のメソッドっでどういうとき？使うんですかね？
A.
　もし引数がなかったらって考えてほしいんですよ
 勝手に　10からカウントダウンするプログラム
 とすると、10からカウントダウンしかしないプログラム　になっちゃうんですよね。
 でも　いや～　10じゃない数からカウントダウンしたい　って時に、引数にすると便利なんですよね。
 こっちで指定した値を引数にわたして、　それをもとに処理しますっていう。　これがそもそもの引数のメリットですね。
 そういうところがあって、追加してるって感じですね。
 */