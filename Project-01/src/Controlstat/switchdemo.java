package Controlstat;
import java.util.Scanner;

public class switchdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number:");
		int number=input.nextInt();
		switch(number) {
		case 1:
			System.out.println("number is 10");
		break;
		case 2:
			System.out.println("number is 20");
		break;
		case 3:
			System.out.println("number is 30");
		break;
		default:
			System.out.println("number is not 10,20,30 ");
		}
		
		}

}
