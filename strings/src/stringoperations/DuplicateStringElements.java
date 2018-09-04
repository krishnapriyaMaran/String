package stringoperations;
  import java.util.Scanner;
public class DuplicateStringElements {
	public static void main(String args[])
	{    System.out.println("enter the string:");
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		int len=str.length();
        String dup=new String();
        String revdup=new String();
        for(int i=0;i<len;i++)
        {   for(int j=0;j<len;j++)
          {
        	if(str.charAt(i)!=dup.charAt(j))
        	{
        		revdup=revdup+str.charAt(i);
        		j=0;
        	}
          }
        }System.out.println("removed duplicate from string:"+revdup);
	in.close();
		
	}

}
