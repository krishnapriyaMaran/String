package stringoperations;

import java.util.Scanner;

public class Palindrome {
	public static void main(String args[])
	{    System.out.println("enter the string:");
		Scanner in=new Scanner(System.in);
		  String str=in.nextLine();
		  String[] word=str.split(" ");
		  //String strrev=" ";
		  int len=word.length;
		  //System.out.println(len);
		  int count=0;
		  for(int i=0;i<len;i++)
		  {
			  String words=word[i];
			 // System.out.println(words);
			 
			  int l=words.length();
			 
			  String revword="";
		  
		  for(int j=l-1;j>=0;j--)
		      {
			  revword=revword + words.charAt(j);
			  }
		  //System.out.println("1"+st);
		  //System.out.println("2"+revword);
		  
		  if(words.equals(revword))
		       {
			
			  count= count+1; 
		       }
		  
	   }	  
		  System.out.println("number of palindrome words:"+count);
	   in.close();
	}

}
