package com.kodnest.Strings.level004;

import java.util.Scanner;

public class RevWordMain {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    System.out.println("enter a line");
    RevWord revWord=new RevWord();
    revWord.rev(scanner.nextLine());
}
}
