/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import practice18.entity.Player;
public class PTra18_03 {

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
        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
            while (scanner.hasNext()) {
            	Player player = new Player();
                String line = scanner.nextLine();
                String[]str = line.split(",");
                player.setPosition(str[0]);
                player.setName(str[1]);
                player.setCountry(str[2]);
                player.setTeam(str[3]);
                if(player.getTeam().equals("レアル・マドリード")) {
                	continue;
                }else if(player.getTeam().equals( "バルセロナ")) {
                	continue;
                }
                array.add(player);
            }
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }

        for(Player a : array) {
        	String s = a.toString();
        	System.out.println(s);
        }
		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください


		// ★ 削除後のArrayListの中身を全件出力してください


	}
}
