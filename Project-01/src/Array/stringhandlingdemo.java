package Array;

public class stringhandlingdemo {
	 
	public static void main(String[] args)
	{
		String s1="vignan";
		System.out.println("The length of s1 id:"+s1.length());
		System.out.println("The index of T is:"+s1.indexOf('T'));
		
		String s2="Monday";
		String s3=s2.substring(3,6);
		System.out.println(s3);
		
		String s4="     Hii       ";
		String s5=s4.trim();
		System.out.println(s5);
		 
		String sentence="Hi welcome to java class";
		char ch[]=sentence.toCharArray();
		
		for(int i=0;i<sentence.length();i++)
		{
			System.out.print(ch[i]);
		}
		System.out.println();
		System.out.println(sentence.length());
		 
		String s6="java";
		System.out.println(s6);
		String s7=s6.toUpperCase();
		System.out.println(s7);
	}
}