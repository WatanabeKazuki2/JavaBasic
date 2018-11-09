package practice13.common;
public class SuperHero extends Hero{

	private Item equipment;

		//getter
	public Item getEquipment() {
		return this.equipment;
	}

	//setter
	public void setEquipment(Item equipment) {
		this.equipment = equipment;
	}

	//attackのオーバーライド


	public int attack() {
		int a = super.attack();
		return a + this.equipment.getAdditionalDamage();
	}



}
