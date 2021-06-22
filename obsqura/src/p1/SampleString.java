package p1;

public class SampleString {

	public static void main(String[] args) {
	String s1="welcome";
	String s2=new String("goodnight");
	int a=10;
	String s=String.valueOf(a);
	String x="java";
	String y="java";
	String z="JAVA";
	String t="selenium";
	String b="";
	String c="javat";
	
	System.out.println("length="+s1.length());
	System.out.println("character="+s2.charAt(1));
	System.out.println("value="+s);
	System.out.println(x.equals(y));
	System.out.println("equals="+y.equals(z));
	System.out.println(z.equals(t));
	System.out.println(b.isEmpty());
	System.out.println(c.isEmpty());
	System.out.println(y.equalsIgnoreCase(z));
	}

}
