package com.chs.OopsPrograms;

class Plane4{
	void takeOff() {
		System.out.println("plane is taking off");
	}
	void fly() {
		System.out.println("plane is flying");
	}
	void land() {
		System.out.println("plane is landing");
	}
}
class CargoPlane extends Plane4{
	@Override
	void fly() {
		System.out.println("CargoPlane is flying");
	}
	void carryGoods() {
		System.out.println("CargoPlane carry goods");
	}
}
class PassengerPlane extends Plane4{
	@Override
	void fly() {
		System.out.println("PassengerPlane is flying");
	}
	void carryHumans() {
		System.out.println("PassengerPlane carry humans");
	}
}
class FighterPlane extends Plane4{
	@Override
	void fly() {
		System.out.println("FighterPlane is flying");
	}
	void carryWeapons() {
		System.out.println("FighterPlane carry weapons");
	}
}
public class InheritanceUmlDiagramCode {

	public static void main(String[] args) {
		
		CargoPlane cp = new CargoPlane();
		cp.takeOff();
		cp.fly();
		cp.land();
		cp.carryGoods();
		System.out.println("-------------------------");
		PassengerPlane pp= new PassengerPlane();
		pp.takeOff();
		pp.fly();
		pp.land();
		pp.carryHumans();
		System.out.println("-------------------------");
		FighterPlane fp= new FighterPlane();
		fp.takeOff();
		fp.fly();
		fp.land();
		fp.carryWeapons();
	}

}
