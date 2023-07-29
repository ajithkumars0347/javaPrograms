package secretMessageDecoder;

import java.util.Scanner;

public class SecretMessageDecoderApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan=new Scanner(System.in);
    System.out.println("enter character");
    char ch=scan.next().charAt(0);
    MessageDecoder messageDecoder = new MessageDecoder();
    System.out.println(messageDecoder.decodeCharacter(ch));
	}
    
}