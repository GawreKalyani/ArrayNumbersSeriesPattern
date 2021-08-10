package string;
//String is immutable;methods:not synchronized
public class StringDiff{
public static void main(String[] args) {
	String a="jbk";
	String f="iostream";
	a.concat(f);
	System.out.println(a);//jbk
	
	String b="hello";
	String c="kalyani";
	System.out.println(b.hashCode());//99162322
	System.out.println(c.hashCode());//-940884583
	
	String o="hello";
	String p=new String("hello");
	System.out.println(o.hashCode());//99162322
	System.out.println(p.hashCode());//99162322
	
	
	String k=a.concat(f);
	System.out.println(k);//jbkiostream
}
}
