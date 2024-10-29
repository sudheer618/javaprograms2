package com.chs.methodoverloading;

class Calculator{
	int add(int a, int b) {
		return a+b ;
	}
	int add(int a, int b, int c) {
		return a+b+c ;
	}
	float add(float a , float b) {
		return a+b;
	}
	float add(float a , float b , float c) {
		return a+b+c;
	}
    double add(double a, double b) {
    	return a+b ;
    }
    double add(double a, double b,double c) {
    	return a+b+c;
    }
    float add(int a ,float b) {
    	return a+b ;
    }
    float add(float b, int a) {
    	return a+b ;
    }
    double add(int a, float b , double c) {
    	return a+b+c ;
    }
}
public class MethodOverLoading {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.add(10, 10));
		System.out.println(c.add(10.7f, 10.9f));
		System.out.println(c.add(1255.5472, 2886.885879));
		System.out.println(c.add(12.54f, 100));
		System.out.println(c.add(580, 125.540f));
		System.out.println(c.add(10222.4869988, 6452.696879410, 4425.956897840));
		System.out.println(c.add(50, 142.240f, 55982.7485962580));
		System.out.println(c.add(30, 40, 70));
		System.out.println(c.add(124.257f, 222.5470f, 428.57250f));
	}

}
