package e_if_for;

/**
 * 【条件分岐と繰り返し】
 * 1～100までの偶数だけを足し算し、その結果をコンソールに表示してみましょう。
 * ※ for文とif文を1回ずつ使用してください。
 */

public class Answer05_01 {

	public static void main(String[] args) {
		int sum = 0;

		for(int i = 1; i <= 100; i++) {
			if((i % 2) == 0) {
				sum = sum + i;
			}
		}

		System.out.println("結果：" + sum);
	}

}

/*
私のダメダメな1打目でも見てくれ。
int sum = 0;
for(int i = 0;i < 100; i++) {
	if(i / 2 == 0) {
		sum = i;
	}
}
System.out.println("1～100までの偶数だけを足し算した結果：" + sum);
}
*/