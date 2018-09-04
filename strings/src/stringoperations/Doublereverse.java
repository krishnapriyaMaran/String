package stringoperations;
import java.util.Scanner;
public class Doublereverse {
	public static void main(String args[])
	{
		System.out.println("enter the string:");
	Scanner in=new Scanner(System.in);
	String str=in.nextLine();
	int len=str.length();
	String reverse="";
	for(int i=len-1;i>=0;i--)
	{
		reverse=reverse+str.charAt(i);
	}
	System.out.println(reverse);
	in.close();
	}
}
