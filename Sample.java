import java.util.*;
public class Sample
{
	public static void main(String[] args)
	{
	Vector<Integer> v=new Vector<>(3);
	v.addElement(10);
	v.addElement(20);
	v.addElement(30);
	v.addElement(40);
	System.out.println("vector elements:"+v);
	System.out.println("size:"+v.size());
	System.out.println("capacity:"+v.capacity());
	System.out.println("removed elements:"+v.remove(2));
	System.out.println("element at first index:"+v.elementAt(1));
	v.clear();
	System.out.println("vector elments:"+v);
	}
}