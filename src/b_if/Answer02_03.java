package b_if;

/**
 * 【条件分岐】
 * 下記の例では、自販機で130円のジュースを購入するのに500円を投入した際のおつりを計算して、
 * どの硬貨が何枚になるかを判定し、コンソールに表示しています。
 * 同様に140円の商品を購入するのに1,000円を投入した場合のおつりを計算して、
 * どの硬貨が何枚になるかを判定し、コンソールに表示してみましょう。
 */

public class Answer02_03 {

	public static void main(String[] args) {
		int money = 1000;
		int product = 140;
		int change = money - product;  //お釣りの全額

		System.out.println(product + "円の商品を" + money + "円で購入した場合のおつりは・・・");

		if(change / 500 >= 1) {
			System.out.println("500円玉は" + (change / 500) + "枚");
			change = change % 500;
		}

		if(change / 100 >= 1) {
			System.out.println("100円玉は" + (change / 100) + "枚");
			change = change % 100;
		}

		if(change / 50 >= 1) {
			System.out.println("50円玉は" + (change / 50) + "枚");
			change = change % 50;
		}

		if(change / 10 >= 1) {
			System.out.println("10円玉は" + (change / 10) + "枚");
			change = change % 10;
		}
	}

}


/*
 * 500円玉が既存処理に無いなというひらめきと、変数に何が入っているか、変数の意味が理解できているかがカギぽい？
 * money＝投入額　　product＝商品代金　change＝おつり　になるので
 * if(change / 500 >= 1) {　　←if（お釣り÷500 が　1以上だったら）{
 * 	System.out.println("500円玉は" + (change / 500) + "枚");　　←println（500円玉は（おつり/500円）枚）
 * 	change = change % 500;　←次の100円玉に向けて余りを出してる。デバックすると360が入ってるのが見れるよ
 * 	}
 *
 *
 * あと　500→10円にするところも鍵かもしれない。
 * お釣りをもらうときはおっきいお金から纏めてもらいたい（小さい小銭じゃらじゃら要らないでしょ？）ってところ。
 * だから最初が(change / 500)になっている。
 * 500円1枚で済むならそっちの方が計算処理としてもスマートだからね。
*/