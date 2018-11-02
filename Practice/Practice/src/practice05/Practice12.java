package practice05;

public class Practice12 {
	public static void main(String[] args) {
		int[] scores = {1,2,5,8,9};

		for (int score : scores) {

			if(score % 2 ==0) {
				System.out.println(score);
			}
		}
	}
}
