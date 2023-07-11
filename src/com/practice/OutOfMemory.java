package com.practice;

public class OutOfMemory {
public static void main(String[] args) {
	String orig = "may I";
	for (double i = 0; i < 100000000000000000d; i++) {
		String s1 = new String("hi");
		String s2 = new String("look at me");
		orig.concat(s2);
		orig.concat(s1);
	}
	System.out.println("done");
}
}
