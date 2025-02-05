package e_if_for;

/**
 * 【条件分岐と繰り返し】
 * 入力された数が素数かどうかを判定するプログラムを作成しなさい。
 * 素数：正の約数の個数が 2 である自然数
 */

public class Answer05_03 {

	public static void main(String[] args) {
		//指定した数字(任意)
		int value = 7;

		//処理
		for (int i = 2; i < value; i++) {
			if (value % i == 0) {
				System.out.println(value + " は素数ではありません");
				return;
			}
		}

		System.out.println(value + " は素数です");
	}

}

/*
簡単に言うと「割り切れる数が無いもの」が素数
→なので、value % i == 0　で　77÷2～77÷77になるまでずーっとまわして、余りが0になるものが無いかを調べている。
何回目で割り切れたのかはデバックしたらわかる…？

→これで全部ためして割り切れる数が最後までなかったら（最後までifに落ちなかったら）素数ということになる。
*/