package java_prog;
import java.util.Scanner;

public class fabonacci {
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=n;i>2;i--)
		{
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			
		}
	}

}
