package exception;

public class Sample 
{
	int b;
	int ar[]={1,3,5};
	
	public void sam()
	{
		int a=10;
		try
		{
			b=a/0;
			System.out.println(b);
		}
		catch(Exception e)
		{
			System.out.println("arithmetic statement");
		}
		try
		{
			ar[4]=7;
		}
		
		catch(Exception e)
		{
			System.out.println("array statement");
		}
		
		finally
		{
			System.out.println("statement should execute");
		}
			
		
		
		
		
		
	}
	public static void main(String[] args) 
	{
		
		Sample ob=new Sample();
		ob.sam();
		System.out.println("end of the statement");
		
	}

}
