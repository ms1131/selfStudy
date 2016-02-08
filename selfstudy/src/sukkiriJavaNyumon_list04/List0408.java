package sukkiriJavaNyumon_list04;

public class List0408 {

	public static void main(String[] args) {
		int[] score = {
				20, 30, 40, 50, 80
		};
		int sum =  score[0] + score[1] + score[2] + score[3] + score[4];
		int avg = sum / score.length;
		System.out.println("合計点：" + sum);
		System.out.println("平均点：" + avg);

	}

}

