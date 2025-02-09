package g_class;

/**
 * 【クラス】
 * 立方体クラス（Cubeクラス）を使用し、1面あたりの面積・立方体の体積を求めて、コンソールに表示してください。
 * ・1辺の長さは整数とする
 * ・結果はmainメソッドで表示すること
 */

public class Answer07_03 {

	public static void main(String[] args) {
		Cube cube = new Cube();
		cube.length = 10;

		System.out.println("1辺が" + cube.length + "cmの立方体の1面あたりの面積は" + cube.getArea() + "平方センチメートル");
		System.out.println("1辺が" + cube.length + "cmの立方体の体積は" + cube.getVolume() + "立方センチメートル");
	}
}

/*
まずキューブクラスにはこんなインスタンスが用意されている。
	//1辺の長さ
	int length;

	//面積
	public int getArea() {
		return this.length * this.length;
	}

	//体積
	public int getVolume() {
		return this.length * this.length * this.length;

ので、自分で”あれ・・・面積ってどうやって出すんだっけ、立方体って…”て考える必要がまずない。やったね
レングスにさえ値を入れてあげれば、



 * ・結果はmainメソッドで表示すること　＝Cubeクラスに書いちゃだめよってことかな？
*/