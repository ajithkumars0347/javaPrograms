package com.kodnest.Strings.level005;

public class RemovingRed {
void red(String str) {
     char []strCh=str.toCharArray();
     char[] ch=new char[10];
     
     int chCount=0;
     for(int i=0;i<=strCh.length-1;i++) {
    	 int help=0;
    	for(int j=0;j<=ch.length-1;j++) {
    		 if(strCh[i]==ch[j]) {
    			 help++;
    			 }
    	 }
    	if(help==0) {
    		ch[chCount]=strCh[i];
    		chCount++;
    	}
     }
     for(int i=0;i<=ch.length-1;i++) {
    	 System.out.print(ch[i]);
     }
}
}
