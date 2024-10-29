package com.chs.OopsPrograms;

abstract class Plane{
	void takeOff() {
		System.out.println("plane is tating off");
	}
	abstract void fly();
	void land() {
		System.out.println("plane landed");
	}
}
class Cargo extends Plane{

	@Override
	void fly() {
		System.out.println("cargo plane is flying");
	}
	
}
class Passenger extends Plane{
	@Override
	void fly() {
		System.out.println("passenger plne is flying");
	}
}
class Fighter extends Plane{
	@Override
	void fly() {
		System.out.println("fighter plane is flying");
	}
}
class Airport{
	void permit(Plane ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}
public class AbstractionCode {

	public static void main(String[] args) {
		Cargo c = new Cargo();
		Passenger p = new Passenger();
		Fighter f = new Fighter();
		Airport ap = new Airport();
		ap.permit(c);
		ap.permit(p);
		ap.permit(f);
	}

}
