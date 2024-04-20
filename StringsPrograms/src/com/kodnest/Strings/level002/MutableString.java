package com.kodnest.Strings.level002;

public class MutableString {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("ajith");
		System.out.println(sb);
		sb.append("ranjith");
		System.out.println(sb);
		
		StringBuffer stb=new StringBuffer("annamalai");
        System.out.println(stb);
        stb.append("sundaraj");
        System.out.println(stb);
	}
}
