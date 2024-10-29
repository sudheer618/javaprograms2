package com.chs.stringPrograms;

public class MutableStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("sudheer");
		String s2 = new String("ammulu");
		s1.concat(s2);//direct changes are not reflected
		s1 = s1.concat(s2);//extenal push gets them merged
		System.out.println(s1);

		StringBuffer sb1 = new StringBuffer("sita"); 
		StringBuffer sb2 = new StringBuffer("rama");
		sb1.append(sb2);
		System.out.println(sb1);

		StringBuilder sbl1 = new StringBuilder("sita");
		StringBuilder sbl2 = new StringBuilder("rama");
		sbl1.append(sbl2);
		System.out.println(sbl1);
	}

}
