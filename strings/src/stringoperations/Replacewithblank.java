package stringoperations;

public class Replacewithblank {
  public static void main(String args[])
  {
	  String s1="good";
	  String s2="morning";
	  s1=s1.concat(s2);
	  int len=s1.length();
	  StringBuffer str=new StringBuffer(s1);
	  str.insert(len,"$jack");
	  System.out.println(str);
	  int len1=str.length();
	  System.out.println("blank space at $");
	  for(int i=0;i<len1;i++)
	  {
		  char ch=str.charAt(i);
		  if(ch=='$')
		  {
			  System.out.print(" ");
		  }
		  else
		  {
			  System.out.print(ch);
		  }
	  }
	  System.out.println("character at particular position");
	  System.out.println(" ");
	  System.out.println(str.charAt(9));
	  System.out.println("delete the character at particular position");
	  str.deleteCharAt(6);
	  System.out.println(str);
  }
}
