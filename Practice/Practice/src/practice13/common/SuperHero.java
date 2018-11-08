package practice13.common;
import practice13.common.Item;



public class SuperHero extends Hero{
	Item equipment;
	public SuperHero(){
		super(25,10,17);

	}

	public int attack() {
		return super.power + this.equipment;
	}

	public Item getEqipment() {
		return this.equipment;
	}

	public void setEqipment(Item eqipment) {
		this.equipment = eqipment;
	}
}
