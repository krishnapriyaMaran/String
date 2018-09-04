package stringoperations;

import java.util.Scanner;

public class Nextcharacter {
	public static void main(String args[])
	{   System.out.println("enter the string:");
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		char[] ch=str.toCharArray();
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			if(ch[i]!='a'&& ch[i]!='e'&& ch[i]!='i'&& ch[i]!='o'&& ch[i]!='u')
			{     char ar=ch[i];
			//System.out.println(ar);
			int a= (int) ar +1;    	
			char b=(char) a;
			System.out.print(b);
			}
			else
			{
				System.out.print(ch[i]);
			}
		}

  in.close();		
	}

}
