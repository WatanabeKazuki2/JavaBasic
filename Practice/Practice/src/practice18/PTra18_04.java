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

		 Player player = new Player();
	        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
	            while (scanner.hasNext()) {
	            	array.add(player);
	                String line = scanner.nextLine();
	                String[]str = line.split(",");
	                player.setPosition(str[0]);
	                player.setName(str[1]);
	                player.setCountry(str[2]);
	                player.setTeam(str[3]);
	            }
	        } catch (FileNotFoundException e) {
	        	System.out.println("ファイルが見つかりません");
	        }

	        Collections.shuffle(array);


	        String s = player.toString();
	        for(int i = 0; i<1; i++) {
	        	while(true) {
	        		if(player.getPosition().equals("GK")) {
	        			System.out.println(s);
	        			break;
	        		}
	        	}
	        }

	        for(int j = 0; j<4; j++) {
	        	while(true) {
	        		if(player.getPosition().equals("DF")) {
	        			System.out.println(s);
	        			break;
	        		}
	        	}
	        }

	        for(int k = 0; k<4; k++) {
	        	while(true) {
	        		if(player.getPosition().equals("MF")) {
	        			System.out.println(s);
	        			break;
	        		}
	        	}
	        }

	        for(int l = 0; l<2; l++) {
	        	while(true) {
	        		if(player.getPosition().equals("FW")) {

	        			System.out.println(s);
	        			break;
	        		}
	        	}
	        }
	}
	// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください

}