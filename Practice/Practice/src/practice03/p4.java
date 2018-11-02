package practice03;

public class p4 {
	public static void main(String[] args) {
		int age = 20;

		//①否定をつけないで実行した場合
		if (age>= 18) {
			System.out.println("①の処理");
		}

		//②否定をつけて実行した場合
		if (!(age >= 18)) {
			System.out.println("②の処理");
		}
	}

}
