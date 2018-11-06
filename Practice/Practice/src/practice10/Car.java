package practice10;

public class Car {
	int serialNo;
	String color;
	int gasoline;


	int run() {
		int num = new java.util.Random().nextInt(15);
		int k = 0;

		int result = this.gasoline - 1;
			if( result < 0) {
				k= -1;
			}else {
				k = num + 1;
			}
		return k;
	}
}