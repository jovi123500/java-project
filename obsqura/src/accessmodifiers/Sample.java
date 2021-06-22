package accessmodifiers;

public class Sample
{

	public int a_public;
	private int b_private;
	protected int c_protected;
	int d; //default
	
	public void publica()
	{
		System.out.println("public");
	}
	private void privateb()
	{
		System.out.println("private");
	}
	protected void protectedc()
	{
		System.out.println("protected");
	}
	 void defd()
	{
		System.out.println("default");
	}
	/*public static void main(String[] args) 
	{
     Sample ob=new Sample();
     ob.publica();
     ob.privateb();
     ob.protectedc();
     ob.defd();
     
     System.out.println(ob.a_public);
     System.out.println(ob.b_private);
     System.out.println(ob.c_protected);
     System.out.println(ob.d);
	}*/

}
