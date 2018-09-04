package stringoperations;
import java.util.Scanner;

public class Uppercasealternate {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		int len=str.length();
		for(int i=0;i<len;i++)
		{char ch=str.charAt(i);	
		     if(i%2==0)
		     {
			  System.out.println(Character.toUpperCase(ch));
	       	}
		else{
			System.out.println(Character.toLowerCase(ch));
		}
		}
		in.close();
	}

}
