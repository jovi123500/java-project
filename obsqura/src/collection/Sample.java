package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;




public class Sample
{

	public static void main(String[] args) 
	{
		
		ArrayList al=new ArrayList(); // non generic 
		al.add("jovi");
		al.add(10);
		al.add(2.8);
		System.out.println(al);
		
		ArrayList <Integer>ob=new ArrayList();
		ob.add(100);
		ob.add(200);
		ob.add(300);
		ob.add(400);
		ob.add(500);
		System.out.println(ob);
		
		ob.remove(3);
		System.out.println(ob);
		
		int s=ob.size();
		System.out.println("size="+s);
		
		ArrayList <Integer>ob1=new ArrayList();
		ob1.addAll(ob);
		System.out.println("new collection="+ob1);
		
		ob.removeAll(ob);
		System.out.println(ob);
		
		boolean t=ob1.contains(200);
		System.out.println(t);
		
		int y=ob1.get(1);
		System.out.println(y);
		
		System.out.println(ob1.get(2));
		
		Iterator itr=ob1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		itr.remove();
		System.out.println(ob1);
		
		
		//ArrayList <String>sn=new ArrayList();
		//sn.add("aaa");
		//System.out.println(sn);
		
		//List <Integer>pj=new ArrayList();
		//pj.add(88);
		//System.out.println(pj);
	}

}
