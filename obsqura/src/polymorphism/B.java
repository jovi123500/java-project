package polymorphism;

public class B extends A
{
public void test()
{
	super.test();
	System.out.println("child class");
}
	public static void main(String[] args)
	{
		
    B ob=new B();
    ob.test();
	}

}
