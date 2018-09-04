package stringoperations;

import java.util.Scanner;

//import java.util.Scanner;

//import java.util.Scanner;

public class Reverseword {
   public static void main(String args[])
   {
	  Scanner in=new Scanner(System.in);
	  String str=in.nextLine();
	  String[] word=str.split(" ");
	  String strrev=" ";
	  int len=word.length;
	  System.out.println(len);
	  
	  for(int i=0;i<len;i++)
	  {
		  String words=word[i];
		  System.out.println(words);
		  String revword=" ";
	  
	  for(int j=words.length()-1;j>=0;j--)
	  {
		  revword=revword + words.charAt(j);
		  //System.out.println(revword);
	  }strrev=strrev+revword+" ";
   }System.out.println(strrev);
   
   
 
  
      in.close();
	  }
}
