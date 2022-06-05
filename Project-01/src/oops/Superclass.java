package oops;
class A
{
	int a;
	int b;
	public A()
	{
		System.out.println("In A class Default Constructor");
	}
	public A(int a,int b)
	{
		System.out.println("In A class parameterized Constructor");
		this.a=a;
		this.b=b;
	}
}
class B extends A
{
	int c;
	
	public B()
	{
		super();
		super.a=10;
		super.b=20;
		System.out.println("In B class Default Constructor");
	}
	public B(int c)
	{
		super();
		this.c=c;
		System.out.println("In B class parameterized Constructor");
	}
}

public class Superclass {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		 B obj=new B();
		 System.out.println(obj.a);
		 System.out.println(obj.b);

	}

}
