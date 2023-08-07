package CharacterIdentifier;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a character");
		char ch = scan.next().charAt(0);
		identifyCharacter(ch);
		scan.close();	
	}
	public static void identifyCharacter(char ch) {
		if(Character.isDigit(ch)) {
			System.out.println("entered character "+ch+" is a digit");
		}
		else if(!Character.isLetter(ch)) {
			System.out.println("entered character "+ch+" is a special character");
		}
		else {
			switch(Character.toLowerCase(ch)) {
			case'a':
			case'e':
			case'i':
			case'o':
			case'u':
				if(Character.isLowerCase(ch))
					System.out.println("entered character "+ch+ " is a lower-case vowel ");
				else
					System.out.println("entered character "+ch+ " is a upper-case vowel ");
				break;
			default:
				if(Character.isLowerCase(ch))
					System.out.println("entered character "+ch+ " is a lower-case consonant ");
				else
					System.out.println("entered character "+ch+ " is a Upper-case consonant ");
			}
		}
	}

}
