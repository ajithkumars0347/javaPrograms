package com.kodnest.Strings.level003;

public class UnicodePrinting {
void unicode(String str) {
	char []str1=str.toCharArray();
	for(int c=0;c<=str1.length-1;c++) {
		System.out.println(str1[c]+" unicode number is "+(int)str1[c]);
	}
}
}
