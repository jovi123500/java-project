package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main
{

	public static void main(String[] args)
	{
		Set<Integer> numbers = new HashSet<>();
	    numbers.add(1);
	    numbers.add(3);
	    numbers.add(2);
	    System.out.println("Set: " + numbers);

	    // Creating an instance of Iterator
	    Iterator<Integer> iterate = numbers.iterator();
	    System.out.println("Iterating over Set:");
	    while(iterate.hasNext()) {
	      System.out.print(iterate.next() + ", ");
	    }

	}

}
