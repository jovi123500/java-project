package p1;

public class Sample_buffer {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("hello");
		System.out.println(sb);

		sb.append(" world");
		System.out.println(sb);
		
		sb.insert(1,"good");
		System.out.println(sb);
		
		sb.replace(4,6,"java");
		System.out.println(sb);
		
		sb.delete(4,6);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);

	}

}
