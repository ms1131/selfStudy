package sukkiriJavaNyumon_list02;
public class List0215 {
	public static void main(String[] args) {
		System.out.println("あなたの名前を入力して下さい。");
		@SuppressWarnings("resource")
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力して下さい。");
		@SuppressWarnings("resource")
		int age = new java.util.Scanner(System.in).nextInt();
		System.out.println("ようこそ、"+ age +"歳の"+ name +"さん");

	}

}
