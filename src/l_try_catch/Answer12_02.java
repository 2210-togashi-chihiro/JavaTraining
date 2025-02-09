package l_try_catch;

/**
 * 【例外処理】
 * 「Nullの変数は参照している時」に発生する「NullPointerException」を発生させてキャッチし、
 * 例外発生時のメッセージをコンソールに表示してみましょう。
 */

public class Answer12_02 {

	public static void main(String[] args) {
		String nullCharacter = null;
		int nullCharacterLength;

		try {
			nullCharacterLength = nullCharacter.length();
		} catch(NullPointerException e) {
			System.out.println("Nullの変数は参照できません。");
			System.out.println(e);
		}
	}

}

/*
どうやってヌルぽを起こそうか？　というところで結構手が止まるかもしれない。
あとnullってなんだっけは地味に詰まるかもしれない。
とりあえずやりたい構文（catch）から埋めてみる、前の問題からいったんとってきてみる　とかも良いかもしれない。

どのサイトを見てもlengthをつかってエラー起こしている場合が多そうだった。
実際使うときはtryしたい内容に対して発生し得るエラーを検討するから考えたことなかったけど、ぬるぽの発生パターンは要調査。
*/