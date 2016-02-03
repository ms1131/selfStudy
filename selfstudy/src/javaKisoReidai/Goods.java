/**
 *
 */
package javaKisoReidai;

/**
 * @author prant
 *
 */
public class Goods {
	//フィールド概要
	String name; //商品名を格納する
	int cost; //消費税抜きの価格を格納する
	static double rate; //消費税率を格納する

	//コンストラクタ概要
	Goods(String n){
		this.name = n; //引数nの値をnameフィールドに格納する
		this.cost = 0; //costフィールドに0を格納する
	}

	Goods(String n, int c){
		this.name = n; //引数nの値をnameフィールドに格納する
		this.cost = c; //引数cの値をcostフィールドに格納する
	}

	//メソッド概要
	//nameフィールドの値を返す
	public String getName() {
		return name;
	}

	//rateフィールドの値を返す
	public static double getRare() {
		return rate;
	}

	//costフィールドの値を返す
	public int getCost() {
		return cost;
	}

	//消費税込の価格を計算して返す（少数点以下は切り捨て）
	public int getPrice() {
		return (int)(cost+cost*rate);
	}

	//引数nの値をnameフィールドに格納する
	public void setName(String n) {
		this.name = n;
	}

	//引数cの値をcostフィールドに格納する
	public void setCost(int cost) {
		this.cost = cost;
	}

	//引数rの値をrateフィールドに格納する
	public static void setRate(double rate) {
		Goods.rate = rate;
	}

	public void show() {
		System.out.println("商品名："+name);
		System.out.println("税抜価格："+cost);
		System.out.println("消費税率："+rate);
		System.out.println("税込価格："+getPrice());
	}
}
