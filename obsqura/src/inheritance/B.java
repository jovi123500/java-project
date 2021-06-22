package inheritance;

public class B extends A
{
	public void print()
	{
		
		System.out.println("child class");
		int c=a+b;
		System.out.println("sum="+c);
	}
	
	public static void main(String args[])
	{
	B ob=new B();
	ob.test();
	ob.print();
	A.show();
	System.out.println(d);
	System.out.println(ob.a);
	
	}

}
