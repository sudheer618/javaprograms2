package com.chs.OopsPrograms;

class Plane1{
	public void takeOff() {
		System.out.println("plane is taking off");
	}
	 void fly() {
		System.out.println("plane is flying");
	}
	public void land() {
		System.out.println("plane is landing");
	}
}
class CargoPlane1 extends Plane1{
	@Override
	public void fly() {
		System.out.println("cargo plane is flying");
	}
	void CarryGoods() {
		System.out.println("cargoplane carry goods");
	}
}
class PassengerPlane1 extends Plane1{
	@Override
	public void fly() {
		System.out.println("passenger plane is flying");
	}
	void CarryHumans() {
		System.out.println("passenger plane carry humans");
	}
}
class FighterPlane1 extends Plane1{
	@Override
	public void fly() {
		System.out.println("fighter plane is flying");
	}
	void CarryWeapons() {
		System.out.println("fighter plane carry weapons");
	}
}
public class PolymorphismCode {

	public static void main(String[] args) {
		Plane1 ref = null;
		CargoPlane1 cp = new CargoPlane1();
		ref=cp;
		ref.takeOff();
		ref.fly();
		ref.land();
		cp.CarryGoods();
		System.out.println("-------------------");
		PassengerPlane1 pp = new PassengerPlane1();
		ref = pp;
		ref.takeOff();
		ref.fly();
		ref.land();
		pp.CarryHumans();
		System.out.println("--------------------");
		FighterPlane1 fp = new FighterPlane1();
		ref = fp;
		ref.takeOff();
		ref.fly();
		ref.land();
		fp.CarryWeapons();
	}

}

