package com.kodnest.Strings.level006;

import java.util.Arrays;

public class AnagramChecking {
 boolean anag(char[] str1,char[] str2){
	 Arrays.sort(str1);
	 Arrays.sort(str2);
	 for(int i=0;i<=str1.length-1;i++) {
		 if(str1[i]!=str2[i]) {
			 return false;
		 }
	 }
	return true;
}
}
