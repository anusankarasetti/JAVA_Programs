package oops;

abstract class Bank1
{
	abstract float getRateofInterest();
	void display()
	{
		System.out.println("Abstract class");
	}
}
class SBI1 extends Bank1
{
     @Override
	float getRateofInterest() {
		return 7.0f;
	}
}
class HDFC1 extends Bank1
{
     @Override
	float getRateofInterest() {
		return 6.8f;
	}
}
class ICICI1 extends Bank1
{
     @Override
	float getRateofInterest() {
		return 6.9f;
	}
}
public class Abstractdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC1 h=new HDFC1();
		System.out.println("Rate of Interest of HDFC is"+h.getRateofInterest());
		h.display();
		
		Bank1 s=new ICICI1();
		System.out.println("Rate of Interest of ICICI is"+s.getRateofInterest());
		s.display();
	}
}
