package j_list;

import java.util.ArrayList;

/**
 * 【リスト】
 * 下記の例では、リストを作成した後にaddメソッドを使用して数字を追加し、コンソールに表示しています。
 * 同様に「リストを作成してA~Eのアルファベットを追加」し、コンソールに表示してみましょう。
 */

public class Answer10_01 {

	public static void main(String[] args) {
		ArrayList<Integer> values = new ArrayList<Integer>();

		values.add(50);
		values.add(55);
		values.add(70);
		values.add(65);
		values.add(80);

		for(int i = 0; i < values.size(); i++) {
			System.out.println(values.get(i));
		}

		ArrayList<String> alphabets = new ArrayList<String>();

		alphabets.add("A");
		alphabets.add("B");
		alphabets.add("C");
		alphabets.add("D");
		alphabets.add("E");

		for(int i = 0; i < alphabets.size(); i++) {
			System.out.println(alphabets.get(i));
		}
	}
}



/*
★コレクションについて★
複数のオブジェクトを管理するためのクラスの集まりを「コレクションフレームワーク」といいます。
ここに含まれるクラスは、オブジェクトの管理方法にそれぞれ特徴があります。

要素の数が事前に分からない場合…ArrayListクラスが便利


Javaプログラムでこれらを扱うときには、情報を格納するためのクラスを定義し、情報1つ1つをインスタンスに持たせます。
プログラムの目的によっては、数千、数万という数のインスタンスを生成し、プログラムの中で管理しなければなりません。

配列と何が違うの？
配列は、”最初に要素数を決めなくちゃいけない”けど、ArrayListクラス(java.util)ならあらかじめ要素の数を指定しておく必要がないよ！
	// 要素数が100の配列を作ります
	MyObject[] objects = new MyObject[100];


	//ArrayListクラスの使い方(複数の文字列をArrayListオブジェクトに格納する例です。)
	import java.util.ArrayList;

	public class ArrayListExample {

		public static void main(String[] args) {
			ArrayList months = new ArrayList();
			months.add("January");
			System.out.println("要素数　" + months.size());

			months.add("Februaly");
			System.out.println("要素数　" + months.size());

			months.add("March");
			System.out.println("要素数　" + months.size());

			System.out.println("== 一覧の出力 ==");
			System.out.println( months.get(0));
			System.out.println( months.get(1));
			System.out.println( months.get(2));
		}

	}

ArrayListクラスに用意されているメソッド
■void add(Objectobj)
引数で渡されたオブジェクトを要素として格納（追加）します。格納するオブジェクトの型(クラス)は問いません。
※正確には、オブジェクトの参照が代入されます

■Object get(intindex)
引数で指定された場所に格納されているオブジェクトを返し（取得し）ます。引数は、要素を追加した順にゼロから始まる番号(インデックス)です。

■Object remove(intindex)
引数(インデックス)で指定された場所に格納されているオブジェクトをArrayListオブジェクトから削除します。戻り値は削除したオブジェクトの参照です。

■int size()
持っている要素の数を返します。




逆に、要素の数があらかじめ決まっていて、以降もその数が変わらない場合には配列を使うとよいでしょう。
配列には次のように宣言と初期化を同時に行えるという利点もあります。



*/