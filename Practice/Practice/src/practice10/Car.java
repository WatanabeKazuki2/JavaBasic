package practice10;

public class Car {
	int serialNo;
	String color;
	int gasoline;


	int run() {
		int k = 0;
		int num = new java.util.Random().nextInt(15);

		this.gasoline = this.gasoline - 1;
			if( this.gasoline < 0) {
				k= -1;
			}else {
				k = num + 1;
			}
		return k;
	}
}