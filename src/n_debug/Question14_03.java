package n_debug;

/**
 * 【デバッグ】
 * 下記の例では、1から10までの数字を足した数（55）をコンソールに表示しようとしています。
 * ところが実行すると異なる結果になります。正しく動作するように修正しましょう。
 */

public class Question14_03 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			int result = 0;
			result += i;
			System.out.println(result);
		}
	}

}