package stringoperations;
import java.util.Scanner;
public class Mirrorimage {
	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		String str=in.nextLine();
		System.out.println("enter the String");
		int len=str.length();
		char[] ch=str.toCharArray();
		for(int i=0;i<len;i++)
		{
			System.out.print(ch[i]);
		}
		System.out.print("|");
		for(int i=len-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		in.close();
	}

}
