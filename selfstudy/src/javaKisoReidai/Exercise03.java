/**
 *
 */
package javaKisoReidai;

/**
 * @author prant
 *
 */
public class Exercise03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Goods.setRate(0.05);
		Goods s = new Goods("千葉県産　スイカ(M)", 980);
		s.show();

		Goods b = new Goods("フィリピン産　バナナ", 400);
		b.show();

	}

}
