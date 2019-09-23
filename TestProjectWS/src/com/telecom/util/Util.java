package com.telecom.util;

public class Util {
	public static void print(String s) {
		System.out.println(s);
	}
	
	public static void print(int i) {
		System.out.println(i);
	}
	
	public static boolean isEmpty(String s) {
		return (null==s || s.length()==0);
	}
	
}
