package stringoperations;

public class Alternateword {
	public static void main(String args[])
	{
		String str="java";
		char[] na=str.toCharArray();
		int len=str.length();
		System.out.println(len);
		for(int i=0;i<len;i++)
		{
          if(i%2==1)
          {
        	  na[i]='*';
          }
		}
		System.out.println(String.valueOf(na));
	}
	
}