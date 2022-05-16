package Controlstat;

public class contdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<=10;i++)
		{
		  if(i==4 || i==9) {
			  continue;
		  }
			sum+=i;
		}
		System.out.println(sum);


	}

}
