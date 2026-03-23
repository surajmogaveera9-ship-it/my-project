                 import java.util.*;
class Distence
{
	int feet, inches;
	Distence(int feet, int inches)
	{
	this.feet=feet;
	this.inches=inches;
	}
	void sum(Distence d1,Distence d2)
	{
	if(d1.inches<12&&d2.inches<12)
	{
	inches=d1.inches+d2.inches;
	feet=d1.feet+d2.feet+(inches/12);
	inches=inches%12;
	System.out.println("total distence is :\n feet  "+feet + "\t inches:" +inches);
	}
		else
		System.out.println("inche should be less than 12");
	}
	}
		class A5
		{
		public static void main(String args[])
		{
			int feet1,feet2,inches1,inches2;
			Scanner sc= new Scanner(System.in);
			System.out.println("enter distence 1");
			System.out.println("enter feet1");
			feet1 = sc.nextInt();
			System.out.println(" enter inches1");
			inches1=sc.nextInt();
			System.out.println("enter feet 2");
			feet2=sc.nextInt();
			System.out.println("enter inches 2");
			inches2=sc.nextInt();
			Distence d1=new Distence(feet1,feet1);
			Distence d2=new Distence(feet2 ,inches2);
			d1.sum(d1,d2);
		}
}
			


