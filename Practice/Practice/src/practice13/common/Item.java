package practice13.common;

public class Item {
	String name;
	int additionalDamage;

	//getter
	public String getName() {
		return this.name ;
	}

	public int getAdditionalDamage() {
		return this.additionalDamage;
	}

	//setter
	public void setName(String name) {
		this.name = name;
	}

	public void setAdditionalDamage(int additionalDamage) {
		this.additionalDamage = additionalDamage;
	}

	//コンストラクタ
	Item(String name,int additionalDamage){
		this.name = name;
		this.additionalDamage = additionalDamage;
	}

}
