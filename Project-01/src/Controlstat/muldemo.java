package Controlstat;

import java.util.Scanner;

public class muldemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number:");
		int num=input.nextInt();
		int p;
		for(int i=1;i<=10;i++) 
		{
			p=num*i;
			System.out.println(num+"X"+i+"="+p);
		}

	}

}
