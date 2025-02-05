package d_array_for;

/**
 * 【配列と繰り返し】
 * 自然数（正の整数）を 10 回入力し、最大値を求めるプログラムを作成しなさい。
 */

public class Answer04_02 {

	public static void main(String[] args) {
		//自然数（正の整数）(任意)
		int[] num = { 1, 9, 93, 19, 11, 76, 9, 66, 44, 33 };
		int maxValue = 0;

		//繰り返し処理
		for (int i = 0; i < 10; i++) {  //変数iを初期化します;iが10以下の場合;　iに1足しながらfor文回します。
			int value = num[i]; //比べるための変数value
			if (value > maxValue) {
				maxValue = value;
			}
		}
		System.out.println("最大値=" + maxValue);
	}

}

/*
//繰り返し処理
for(int i = 0; i < 10; i++) {
	if (num[i] > maxValue) {
		maxValue = num[i];
	}
}
なんかこれでも行けるよね？
*/