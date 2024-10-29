package com.chs.OopsPrograms;

class Animal{
	void eat() {
		System.out.println("animal is eating");
	}
	void run() {
		System.out.println("animal is runnig");
	}
	void  bark() {
		System.out.println("animal is barking");
	}
}
class Pig extends Animal{
	@Override
	void eat() {
		System.out.println("Dog is eating");
	}
	void jump() {
		System.out.println("Dog is jummping");
	}
}
class Tiger extends Animal{
	@Override
	void eat() {
		System.out.println("tiger is eating");
	}
	void hunting() {
		System.out.println("tiger is hunting");
	}
}
class Cat extends Animal{
	@Override
	void eat() {
		System.out.println("cat is eating");
	}
	void sleep() {
		System.out.println("Fcat is sleeping");
	}
}
public class InheritanceUmlCode1 {
	public static void main(String[] args) {
		Pig bd = new Pig();
		bd.eat();
		bd.bark();
		bd.run();
		bd.jump();
		System.out.println("----------------");
		Tiger t1 = new Tiger();
		t1.eat();
		t1.run();
		t1.bark();
		t1.hunting();
		System.out.println("----------------");
		Cat c = new Cat();
		c.eat();
		c.run();
		c.sleep();
	}

}
