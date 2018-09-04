package stringoperations;

import java.util.Scanner;

public class Stringlength {
	public static void main(String args[])
	{    
		Scanner in =new Scanner(System.in);
		System.out.println("enter the string");
		String s1=in.nextLine();
		String s2="Indian Cricket Board";
		System.out.println(s1.length());
		
		System.out.println("length of string s2 is:");
		System.out.println(s2.length());
		in.close();
	}

}
