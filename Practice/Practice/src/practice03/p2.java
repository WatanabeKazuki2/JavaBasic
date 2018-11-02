package practice03;

public class p2 {
	public static void main(String[] args) {
		//車を持っている場合は「true」持っていない場合は「false」を代入する
		boolean hasCar = true;
		boolean canRideTrain = false;
		//車を持っているか判定する
		if (hasCar) {
			//持っている
			System.out.println("車で移動");
		}else if(canRideTrain) {
			System.out.println("電車で移動");
		}else{
			//持っていない
			System.out.println("歩いて移動");
		}
	}
}