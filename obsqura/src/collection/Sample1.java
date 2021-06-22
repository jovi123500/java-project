package collection;

import java.util.ArrayList;
import java.util.List;

public class Sample1 
{

	public static void main(String[] args)
	{
		
		ArrayList<String> list1=new ArrayList<String>();  
		
		list1.add("jovi");  
		list1.add("mango");  
		list1.add("pen");  
		list1.add("ram");  
		System.out.println(list1);  
		
		List<String> list2=new ArrayList<String>();  
		
		list2.add("jovi");  
		list2.add("mango");  
		list2.add("pen");  
		list2.add("ram");  
		System.out.println(list2);  
		
		boolean result = list1.equals(list2); 
		System.out.println(result);  
		
		list2.add("cat");  
		
		boolean result2 = list1.equals(list2); 
		System.out.println(result2);  
	}

}
