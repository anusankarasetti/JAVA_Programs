package oops;
class student
{
	int id;
	String name;
	String course;
	String email;
	int phno;
	
	public student(int id,String name,String course,String email,int phno)
	{
		this.id=id;
		this.name=name;
		this.course=course;
		this.email=email;
		this.phno=phno;
	}
	public student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public student()
	{
		
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", course=" + course + ", email=" + email + ", phno=" + phno
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}

public class Constructordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The students of Vignan are");
		student obj1=new
				student(1,"Anu Sri","ash","afgs",12345);
		   System.out.println(obj1);
		 student obj2=new
					student(2,"siri","gsn","swnm",123457);
			   System.out.println(obj2);
		student obj3=new
						student(3,"sriram");
				   System.out.println(obj3);
				

	}

}
