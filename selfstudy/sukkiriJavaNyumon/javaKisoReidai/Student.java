/**
 *
 */
package javaKisoReidai;

/**
 * @author prant
 *
 */
public class Student {

	//フィールドの概要
	private String name; //生徒名を格納
	private int kokugo; //国語の点数を格納
	private int sansu; //算数の点数を格納

	Student(String name){
		this(name, 0, 0);
		//引数nameの値をnameフィールドに格納する
		//kokugoフィールドに0を格納する
		//sansuフィールドに0を格納する
	}


	//コンストラクタ概要
	Student(String name, int kokugo, int sansu) {
		this.name = name; //引数nameの値をnameフィールドに格納する
		this.kokugo = kokugo; //引数kokugoの値をkokugoフィールドに格納する
		this.sansu = sansu; //引数sansuの値をsansuフィールドに格納する
	}

	void show(){
		System.out.println("氏名：" +name);
		System.out.println("国語：" +kokugo);
		System.out.println("算数：" +sansu);
	}


	//メソッド概要
	//nameのフィールドの値を返す
	public String getName() {
		return name;
	}

	//kokugoのフィールドの値を返す
	public int getKokugo() {
		return kokugo;
	}

	//sansuフィールドの値を返す
	public int getSansu() {
		return sansu;
	}

	//引数nの値をnameフィールドに格納する
	public void setName(String n) {
		name = n;
	}

	//引数kの値をkokugoフィールドに格納する
	public void setKokugo(int k) {
		kokugo = k;
	}

	//引数sの値をsansuフィールドに格納する
	public void setSansu(int s) {
		sansu = s;
	}



}
