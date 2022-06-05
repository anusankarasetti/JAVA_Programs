package java_prog;
import java.util.Scanner;

public class Primenum {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number:");
		int a=sc.nextInt();
		int n=0;
		for(int i=2;i<a/2;i++)
		{
			if(a%i==0)
			{
				n=1;
				break;
			}
		}
		if(n==0)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println(" not prime number");
		}

	}

}
