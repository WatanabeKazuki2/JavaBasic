package practice03;

public class p1 {
	public static void main(String[] args) {
		//車を持っている場合は「true」持っていない場合は「false」を代入する
		boolean hasCar = true;

		//車を持っているか判定する
		if (hasCar==true) {
			//持っている
			System.out.println("車で移動");
		}else{
			//持っていない
			System.out.println("電車で移動");
		}
	}
}
