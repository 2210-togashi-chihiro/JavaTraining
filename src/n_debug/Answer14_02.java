package n_debug;

/**
 * 【デバッグ】
 * 下記の例では、0から9までの数字をコンソールに表示しようとしています。
 * ところが実行すると異なる結果になります。正しく動作するように修正しましょう。
 */

public class Answer14_02 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}

}


/*
まず1回目のforで、すでに i に 1　が入っていることがわかる。
→ということはコンソールに0は出ず、1から出力されるのがわかる。

あと10も表示されている。
9で止まらない。　ということは”いつまで回すか”の条件の書き方が悪いことがわかる。
*/