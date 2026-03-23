import java.util.*;
class Distence
{
	int feet, inches;
	Distence(int feet,int inches)
	{
	this.feet=feet;
	this.inches=inches;
	void sum(Distence D1,Distence D2)
	{
	if(D1.inches<12&&D2.inches<12)
	{
	inches=D1.inches+D2.inches;
	feet=D1.feet+D2.feet+(inches/12);
	{
	inches=inches%12;
	System.out.println("total distence is \n=\n feet" +feet "\t inches:" +inches);
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
			Scanner sc= new Scanner(system.in);
			System.out.println("enter distence");
			feet1 = sc.nextInt();
			System.out.println("enter feet1");
			System.out.println(" enter inches1");
			inches1=sc.nextInt();
			System.out.println("enter feet 2");
			feet2=sc.nextInt();
			system.out.println("enter inches 2");
			inches 2=sc.nextInt();
			Distence D1=new Distence(feet1,feet2);
			Distence D2=new distence(feet2 ,inches2);
			D1.sum(D1,D2);
		}
}
			


