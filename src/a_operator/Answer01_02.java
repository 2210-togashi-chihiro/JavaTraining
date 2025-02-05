package a_operator;

/**
 * 【演算子】
 * 下記の例の①②を下の仕様に基づいて記述してみましょう。
 * 02_Java言語の基本（出力と変数のくだり）　の記述もここに記載しています。
 */

public class Answer01_02 {

	public static void main(String[] args) {
		int num = 3;
		int incrementResult = 0;
		int decrementResult = 0;

		//① インクリメント演算子を用いてnumを1加算してください。
		incrementResult = ++num;  //インクリメント…++のこと。左辺の変数の値を1増やします。前置パターン(i++;)と後置パターン(++i;)があります。
		System.out.println("3を1加算した数は" + incrementResult);
		num = 3;

		//② デクリメント演算子を用いてnumを1減算してください。
		decrementResult = --num;
		System.out.println("3を1減算した数は" + decrementResult);
		//文字列をコンソールに出力するには、出力する文字列をダブルクォーテーション (")で囲みます。
		//「＋」を使うと、文字列と変数に格納されている値を表す数字を連結できる。
	}

}


/*
 ！出力について！
	文字列とは、「A」や「あ」のような文字が1 つ以上連なってできる文字の列のことです。例えば、「ABCDEFG」や「あいうえお」や「a」は文字列です。
	また出力とは、文字列などのデータをコンピュータから標準出力などに送り出すことをいいます。ここでは「画面に表示する文字列を送り出す先」と思ってください。

	Eclipse 上で標準出力へ文字列を出力する命令を含むプログラムを実行すると、コンソールビューにその文字列が表示される仕組みになっています。
	※以降では、コンソールビューのことを単にコンソールと呼びます 。

	2. 複数の出力命令

	プログラムコードには、複数の命令文を記述できます。試しに、文字列をコンソールヘ出力する命令文を続けて2つ書いてみます
	class PrintExample2 {
		public static void main(String[] args) {
			System.out.println("こんにちは");
			System.out.println("今日も良い天気です");
		}
	}
	実行すると、コンソールには改行された文字列が表示されます。
	また、2つの命令文が、プログラムコードの上から下に向かって順番に実行されたことを確認できます。
	System.out.printlnを用いた命令文では、文字列の後ろで自動的に改行され、後に続く出力は次の行から開始されます。
	System.out.printを使用すると( System.out.printlnに似ていますが、”ln”がありません）、改行なしで文字列が出力されます。

	KEYWORD
	文字列：「A」や「あ」などの文字が連れなった列
	出力：文字列などのデータをコンピュータから送り出すこと。 コンソールに文字列を表示することも出力の一つ
	コンソール：文字列（コマンド）でコンピュータに命令し、その結果を文字列で表示することができるプログラムの総称です。Windows の「コマンドプロンプト」やMacOSX の「ターミナル」などはコンソールで、これらも標準出力になっています。


	3. まとめ
	System. out. printlnによって、文字列をコンソール出力することができます。
	プログラムコードに記述された命令文は上から下に向かって順番に実行されます。プログラムコードには複数の命令文を記述できます。

！変数について！
変数の宣言について
	例：
	public class VariableExample {

		public static void main(String[] args) {
			int i; //iという変数を作成します（変数の宣言）
			i = 5; //iに5を入れます（値の代入）
			System.out.println(i); //iの中身をコンソールに出力します（値の参照）
		}

	}
	3行目では、次のように変数を宣言していました。
	int i;
	この宣言は、次の構文（ルール）に沿って書かれています。
	型名 変数名;

値の代入について
	変数に値を代入する構文はこのようになります。
	変数名 = 値;
	VariableExample.javaでは、この構文に沿って次のように値（整数の5)を代入しました。
	i = 5;
	Java言語では左辺の変数に右辺の値を 「代入する」ことを意味します。
	「i ← 5 」とイメージするとよいでしょう。
	値の代入は、基本的に何度でも行えます。複数回行った場合は、最後に代入した値が有効になります。

変数の初期化について
	変数の宜言と値の代入、実はこれら2つの処理をまとめて、一度に行うことができます。
	int i = 5;
	変数に初期値を代入することを変数の初期化といいます。

値の参照
	値が代入されていない変数（初期化されていない変数）を参照することはできません。

変数の型
	プログラムで扱う値の種類のことを型といいます。
	Java言語で使用できる型はさまざまです。主要なものを下表に記載します
	※割愛

	●	整数を表すのはint型だけではありません。byte 型、short 型、long 型もあります。違いは、それぞれの型で扱える数値の範囲です。変数に代入する数値がどの範囲に収まるかを判断して使い分けます。一般的にはint型を使うことが多いです。
	●	0.99や-1.5のような小数点を含む値を代入する変数には、float型あるいはdouble型を使用します。これは代入する数値の精度によって使い分けますが、一般的にはdouble型を使うことが多いです。
	●	char型の変数には、文字を1 つだけ代入できます。文字列(複数の文字)を代入することはできないので注意しましょう。
	●	boolean 型は真偽値を扱います。プログラムの中では、ある条件を満たしているときにはこちらの処理を行い、満たしていない場合にはあちらの処理を行う、といった場面がよく出てきます。真偽値は、こうした条件を満たしているときにtrue(真) 、満たしていないときにfalse(偽) になる値です。

	プログラミングでは、これらの型を適切に使い分ける必要がありますが、最初からすべての型を覚えるのは大変です。まずは、よく使う次の3つを覚えましょう。

	●	整数を入れるint型
	●	小数点を含む値を入れるdouble型
	●	真偽値を入れるboolean型

KEYWORD
●	変数：値を入れておく入れ物のこと
●	型：値の種類のこと
●	代入：変数に値を人れること
●	参照：変数に人っている中身を見ること
●	構文：プログラムコードの書き方のルール
●	初期化：変数に最初の値（初期値）を入れること

8. まとめ
●	変数とは値を格納する入れ物のことです
●	変数を使うためには、「名前」と「型」を決める必要があります
●	変数を使用するには、まず宜言を行う必要があります
●	値を格納することを代入といい、等号（＝）を使用して左辺の変数に右辺の値を入れます
●	主な型には、整数を扱うint型、小数点を含む値を扱うdouble型、真偽値を扱うboolean型がありま


インクリメント演算子について：
	ちなみに、
	j = i++; //（3）
	と
	j = ++i; // (4)
	のように、インクリメント演算子を代入演算と組み合わせた場合には、前置と後置で結果が異なるので注意が必要です。

	(3) では、変数 j に変数 i の値が代入された後に、iの値が1だけ増えます。
	つまり
	j = i ;
	i = i + 1;
	と同じ結果になります。

	一方で、(4) ではiの値が1増えた後で、その結果がjに代入されます。つまり、
	i = i + 1;
	j = i ;
	と同じ結果になります。
	この違いを知らずに、インクリメント演算と代入演算を組み合わせたプログラムコードを筈くと、意図し ない結果になることがあります。慣れるまでは、2 つの命令文に分けるのがよいでしょう。
	なお、デクリメント演算子(- -)でも同様です。

8. まとめ
●	コンピュータに加減乗除などの演算を行わせることができます。
●	掛け算は＊、割り算は／の記号で表します。
●	算術演算子には優先順位があり、加算と減算(+と—)より乗算と除算（＊と／）が優先されます。
●	変数の値を算術演算で変更する場合には、短縮表現を使って短く書くことができます。
●	変数の値を1だけ増やすときにはインクリメント演算子(++)、1だけ減らすときにはデクリメント演算 子(--)が使えます。

KEYWORD
●	演算子：＋や—など、演算を行うための記号
●	オペランド：演算子による演算の対象となるもの
●	式：演算子とオペランドの組み合わせで表現される、値を持つもの
●	算術演算子：加減乗除などの演算を行う記号
●	インクリメント：値を1増やすこと
●	デクリメント：値を1減らすこと

*/
