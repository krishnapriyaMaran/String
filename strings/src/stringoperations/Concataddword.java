package stringoperations;

public class Concataddword {
	public static void main(String args[])
	{
		String s1="good";
		String s2="morning";
		s1=s1.concat(s2);
		int len=s1.length();
		StringBuffer str=new StringBuffer(s1);
		System.out.println(s1);
		str.insert(len, "$jack");
		System.out.println(str.toString());
		
	}

}
