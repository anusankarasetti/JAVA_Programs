package Array;
class Student
{
	public int roll_no;
	public String name;
	Student(int roll_no,String name)
	{
        this.roll_no=roll_no;
        this.name=name;
	}
	
@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", name=" + name + "]";
	}
}

public class vignan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] arr=new Student[5];
		arr[0]=new Student(101,"Anu sri");
		arr[1]=new Student(102,"Sireesha");
		arr[2]=new Student(103,"Nikhila");
		arr[3]=new Student(104,"Kiran");
		arr[4]=new Student(105,"Madhu");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
