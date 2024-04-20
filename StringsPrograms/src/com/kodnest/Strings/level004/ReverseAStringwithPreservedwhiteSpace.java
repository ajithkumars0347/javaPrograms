package com.kodnest.Strings.level004;

public class ReverseAStringwithPreservedwhiteSpace {
     String revpr(String str)
{
	char[] ch=str.toCharArray();
	int j=ch.length-1;
	char[] arr=new char[ch.length];
	for(int i=0;i<=ch.length-1;i++) {
	    if(ch[i]==' ') {
	    	arr[i]=' ';
	    }
	}
	for(int i=0;i<=ch.length-1;i++) {
		if(ch[i]!=' ' && arr[j]!=' ') {
			arr[j]=ch[i];
			j--;
		}
		else if(ch[i]!=' '&& arr[j]==' ') {
			j--;
			arr[j]=ch[i];
			j--;
		}
		else if(ch[i]==' '&&arr[j]!=' ') {
	         i++;
	         arr[j]=ch[i];
	         j--;
		}
		else if(ch[i]==' '&&arr[j]==' ') {
			j--;
		}
		}
	for(int i=0;i<=arr.length-1;i++) {
		System.out.print(arr[i]);
	}
	return null;
}
}
