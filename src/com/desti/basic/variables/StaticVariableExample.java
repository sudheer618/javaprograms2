package com.desti.basic.variables;


class Sample{
	int a,b,c;//static variables
	static int p,q,r;//non static variables

	//stack block
	static {
		System.out.println("inside static block");
		System.out.println();
		p = 100 ;
		q = 200 ;
		r = 300;
		
		//a = 1000;
		//b = 2000;
		//c = 3000;
	}
	//non static block
	{
		a = 1000;
		b = 2000;
		c = 3000;
		
		p = 10000;
		q = 20000;
		r = 30000;
	}
	//static method
	static void displaystatic() {
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
		
//		System.out.println(a);
	//	System.out.println(b);
		//System.out.println(c);
	}
	//non static method
	void displaynonstatic() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
	}
}
public class StaticVariableExample {

	public static void main(String[] args) {
		System.out.println("inside main");
		Sample.displaystatic();
		Sample s = new Sample();
		s.displaynonstatic();
	}

}

