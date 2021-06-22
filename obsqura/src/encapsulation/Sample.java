package encapsulation;

public class Sample 
{
private int age;
private String name;

public void set(int a,String b)
{
	age=a;
	name=b;
}

public void get()
{
	age=age*10;
	System.out.println("age is"+age);
	System.out.println("name is"+name);
}
}
