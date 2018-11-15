/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import practice18.entity.Player;
public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		 ArrayList<Player> array = new ArrayList<>();


// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください


		 try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
			 while (scanner.hasNext()) {
				 Player player = new Player();
				 String line = scanner.nextLine();
				 String[]str = line.split(",");
				 player.setPosition(str[0]);
				 player.setName(str[1]);
				 player.setCountry(str[2]);
				 player.setTeam(str[3]);

				 array.add(player);
			 }
		 } catch (FileNotFoundException e) {
			 System.out.println("ファイルが見つかりません");
		 }
		 Collections.shuffle(array);

		 int gkCount = 0;
		 int dfCount = 0;
		 int mfCount = 0;
		 int fwCount = 0;
		 for(Player p : array) {
			 String s = p.toString();

				 if(p.getPosition().equals("GK") && gkCount<1) {
					 System.out.println(s);
					 gkCount++;
				 }

				 if(p.getPosition().equals("DF") && dfCount<4) {
					 System.out.println(s);
					 dfCount++;
				 }

				 if(p.getPosition().equals("MF") && mfCount<4) {
					 System.out.println(s);
					 mfCount++;
				 }

				 if(p.getPosition().equals("FW") && fwCount<2) {
					 System.out.println(s);
					 fwCount++;
				 }

		 }
	}
}
