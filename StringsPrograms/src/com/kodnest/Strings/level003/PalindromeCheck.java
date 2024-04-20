package com.kodnest.Strings.level003;

public class PalindromeCheck {
boolean isPalindrome(String s1,String s2)
{
	if(s1.equalsIgnoreCase(s2))//this is used to avoid case sensitive in equals()method
        return true;	
	else
		return false;
}
}
