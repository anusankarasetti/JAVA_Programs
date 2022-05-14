package datattypes;

import java.util.Scanner;

public class Box {
        double dblwidth;
        double dblheight;
        double dbldepth;
     static int boxid;
  public Box(double dblwidth,double dblheight,double dbldepth) {
	      this.dblwidth=dblwidth;
          this.dblheight=dblheight;
          this.dbldepth=dbldepth;
	  }
     public Box()
     {
    	 
     }
    public double calcvolume()
    
     {
    	double dbltemp;
    	dbltemp=dblwidth*dblheight*dbldepth;
    	return dbltemp;
     }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the width of the box");
		double w=sc.nextDouble();
		System.out.println("enter the height of the box");
		double h=sc.nextDouble();
		System.out.println("enter the depth of the box");
		double v=sc.nextDouble();
		Box b1=new Box(w,h,v);
		System.out.println("volume of the box is"+b1.calcvolume());
		
		}

}
