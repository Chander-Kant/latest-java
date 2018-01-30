package Demo;

import java.util.Scanner;

public class Vowe {
	public static void main(String[] args)
	{
		System.out.println("Enter a character");
		Scanner sc= new Scanner(System.in);
	char	a= sc.next().charAt(0);
	switch(a) {
		
	case 'a':
		System.out.println("VOWEL");
		break;
	case 'e':
		System.out.println("VOWEL");
		break;
	case 'i':
		System.out.println("VOWEL");
		break;
	case 'o':
		System.out.println("VOWEL");
		break;
	case'u':
		System.out.println("VOWEL");
		break;

	default:
		System.out.println("CONSONANT");
		break;
	}
	
	}

}
