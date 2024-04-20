package com.kodnest.Strings.level005;

public class CountingSimilarChar {
	void count(String str) {
		char[] str1=str.toCharArray();
		for(int i=0;i<=str1.length-1;i++) {
			if(str1[i]!=' ') {
                int count=1;
                for(int j=i+1;j<=str1.length-1;j++) {
                	if(str1[j]==str1[i]) {
                		count++;
                		str1[j]=' ';
                	}
                }
                System.out.println(str1[i]+" =====>"+count);
			}
		}
	}
}