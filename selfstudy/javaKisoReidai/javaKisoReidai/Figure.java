/**
 *
 */
package javaKisoReidai;

/**
 * @author prant
 *
 */
class Figure {
	//フィールド
	private int base; //底辺の値を格納
	private int height; //高さの値を格納

	//コンストラクタ概要
	public Figure(int base, int height){
		setBase(base); //引数baseの値をbaseフィールドに格納する
		setHeight(height); //引数heightの値をheightフィールドに格納する
	}

	//表示メソッド概要
	//底辺と高さの値を画面に表示する
	public void show() {
		System.out.println("底辺："+base+" cm");
		System.out.println("高さ："+height+" cm");
	}

	//面積を求めるメソッド
	//面積の値をdouble型で返す
	public double getArea() {
		return 0.0;
	}

	//引数の値をbaseフィールドに設定する
	//引数baseが0より大きい値のときのみ引数baseの値をbaseフィールドに格納する
	public void setBase(int base) {
		if(base > 0){
			this.base = base;
		}
	}

	//引数の値をheightフィールドに設定する
	//引数heightが0のより大きい値のときのみ引数heightの値をheightフィールドに格納する
	public void setHeight(int height) {
		if(height > 0){
			this.height = height;
		}
	}

	//baseフィールドの値を取得する
	//baseフィールドの値を返す
	public int getBase() {
		return base;
	}

	//引数の値をheightフィールドに設定
	//heightフィールドの値を返す
	public int getHeight(){
		return height;
	}

}
