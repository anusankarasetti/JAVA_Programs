package oops;

class Bank
{
	float getRateofInterest() {
		return 6.7f;
	}
}
class SBI extends Bank
{
	float getRateofInterest() {
		return 7.0f;
	}
}
class HDFC extends Bank
{
	float getRateofInterest() {
		return 6.8f;
	}
}
class ICIC extends Bank
{
	float getRateofInterest() {
		return 6.9f;
	}
}
public class MethodOverridingdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI obj=new SBI();
		System.out.println(obj.getRateofInterest());
		Bank obj1=new ICIC();
		System.out.println(obj1.getRateofInterest());
		Bank obj2=new HDFC();
		System.out.println(obj2.getRateofInterest());
	}

}
