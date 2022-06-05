package oops;

public class MethodOverloadingdemo {
	int add(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
	float add(float a, float b)
	{
		return a+b;
	}
	float add(int a,float b,int c)
	{
		return a+b+c;
	}
	float add(float a,int b,int c)
	{
		return a+b+c;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingdemo obj= new MethodOverloadingdemo();
		System.out.println(obj.add(10, 10));
		System.out.println(obj.add(3.45f,5.64f));
		System.out.println(obj.add(10, 22.23f,34));
		System.out.println(obj.add(13.56f,39,47));
		
		

	}

}
