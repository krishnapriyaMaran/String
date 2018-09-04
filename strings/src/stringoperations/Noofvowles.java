package stringoperations;
import  java.util.Scanner;

public class Noofvowles {
	public static void main(String args[])
	{   int vowels=0;
		System.out.println("enter the string");
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		int s1=str.length();
		for(int i=0;i<s1;i++)
		{    char ch=str.charAt(i);
		     if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{ 
				vowels=vowels+1;
			}
		     
		}
		System.out.println("no of vowels:" +vowels);
		in.close();
	}

}
