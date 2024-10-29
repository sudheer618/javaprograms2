package com.desti.basic.variables;

public class LocalVariableExample {
public static void main(String[] args) {
	Calculator c = new Calculator();
	c.add();
	c.sub();
	c.mul();
	c.div();
}
}
class Calculator{
	void add() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
	void sub() {
		int a = 20;
		int b = 10;
		int c = a-b;
		System.out.println(c);
	}
	void mul() {
	int a = 5;
	int b = 5;
	int c = a*b;
	System.out.println(c);
	}
	void div() {
		int a = 200;
		int b = 20;
		int c = a/b;
		System.out.println(c);
	}
}
