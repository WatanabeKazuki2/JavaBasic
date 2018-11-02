package practice05;

public class Practice13_2 {

	public static void main(String[] args) {
		int[][] score = {
			{95,88,87},
			{70,81,100},
			{12,98,90},
			{100,100,100}
		};
		for (int i = 0; i < score.length; i++) {
			int sum = 0;
			for (int j = 0; j < score[i].length; j++) {

			sum += score[i][j];
			}
			System.out.println(sum);

		}
	}
}

