package list03;

public class List03e5 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.print("[メニュー] 1:検索 2:登録 3:削除 4:変更＞"); //①
			int selected = new java.util.Scanner(System.in).nextInt();
			switch (selected) {
			case 1:
				System.out.println("検索します");
				break;

			case 2:
				System.out.println("登録します");
				break;

			case 3:
				System.out.println("削除します");
				break;

			case 4:
				System.out.println("変更します");
				break;

			default:
				break;
			}

	}

}
