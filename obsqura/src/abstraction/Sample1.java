package abstraction;

public class Sample1 extends Sample
{
public void print()
{
	System.out.println("abstract method");
}
	public static void main(String[] args) 
	{
		Sample1 ob=new Sample1();
		ob.print();
		ob.show();

	}

}
