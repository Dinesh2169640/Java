package TheSecretMessageDecoder;

import java.util.Scanner;

public class MessageDecoder {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a charcter");
		char ch = scan.next().charAt(0);
		MessageDecode decoder = new MessageDecode();
		System.out.println(decoder.decodeCharacter(ch));
	}

}
