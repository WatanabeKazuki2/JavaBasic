package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		Car[] car =new Car[3];
		//3つの車作成
		Car car1 = new Car();
		car1.color = "Red";
		car1.gasoline = 30;

		Car car2 = new Car();
		car2.color = "Blue";
		car2.gasoline = 40;

		Car car3 = new Car();
		car3.color = "green";
		car3.gasoline = 50;
		//3つの車の情報作成


		final int distance = 300; //走行距離

		car[0] = car1;
		car[1] = car2;
		car[2] = car3;




		for (int i = 0; i < car.length; i++) {
			int over = car[i].run() ;
			int progress = 0;
			int n = 0;


			 while(distance > progress) {
				 n += 1;
				 progress = progress + over;
				 if(car[i].run() == -1) {

					 break;

				 }
			 }


			 if(car[i].run() == -1) {
				 System.out.println(car[i].color + "は目的地まで到達できませんでした");
			 }else {
				 System.out.println(car[i].color + "は目的地まで" + n +"時間かかりました。残りのガソリンは" + car[i].gasoline + "です");
			 }

		}
	}
}
