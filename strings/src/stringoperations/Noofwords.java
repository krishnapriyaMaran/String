package stringoperations;
 
import java.util.Scanner;

public class Noofwords {
	public static void main(String args[])
	{    int count=0;
		System.out.println("enter the string:");
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		int len=str.length();
		System.out.println(len);
		for(int i=0;i<len-1;i++)
		{
            //char ch=str.charAt(i);
			if(str.charAt(i)==' ' &&  str.charAt(i+1)!=' ')
			{
			    count=count+1;	
			}
			
		}
		count=count+1;
		System.out.println("the number of words are:" +count);
		in.close();
	}

}
