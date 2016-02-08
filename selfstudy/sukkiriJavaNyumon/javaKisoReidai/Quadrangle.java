/**
 *
 */
package javaKisoReidai;

/**
 * @author prant
 *
 */
public class Quadrangle{
	public Quadrangle(int b, int h) {
		this.base = b;
		this.height = h;
	}
	public void show() {
		System.out.println("四角形のデータ");
		Figure.show();
		System.out.println("面積：");
	}
}
