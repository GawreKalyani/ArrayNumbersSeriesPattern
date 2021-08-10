package string;

public class StringAllMethod {
	public static void main(String[] args) {
		
	//Concatination of two String: String concat(Object o)
String s="Saniaa";
String ss=new String("geeta");//another way to initialise string
String r=s.concat(ss);
System.out.println(r);

//Content of string is equal or not
String k="Dev";
String kk="dev";
boolean kkk=k.equals(kk);//false
System.out.println(kkk);

System.out.println(k==kk);//false Address are different

//equals ignore case:Not case sensitive
String y="Hello";
String f="hello";
boolean h=y.equalsIgnoreCase(f);//True
System.out.println(h);

// char  charAt(int index )
char e=s.charAt(3);		//Saniaa 012345 index 3:i
System.out.println(e);

// int indexOf(char c)
int a=s.indexOf('a');
System.out.println(a);
// int lastindexOf(char c)
int w=s.lastIndexOf('a');  //Saniaa 012345 index 5:last a
System.out.println(w);

// trim():Removes white spacing
String q="  kamya ";
String qq=q.trim();
System.out.println(qq);

//String replace(old char,new char)
String t=s.replace('a', 'j');
System.out.println(t);

//String substring(int startindex)
String p=s.substring(3);
System.out.println(p);
//String substring(int startindex,int endindex)
String pp=s.substring(2, 6);
System.out.println(pp);

//String toLowerCase(Object o)  //All letter small
String u=s.toLowerCase();
System.out.println(u);
// String toUpperCase(Object o)
String v=s.toUpperCase();
System.out.println(v);

String name="what do you know about me";
boolean d=name.contains("do you");
System.out.println(d);
System.out.println(name.contains("about"));  //true
System.out.println(name.contains("hello"));  //false

//length()
int dd=s.length();
System.out.println(dd);

//replaceAll(setOfcharacters,new characters)
String ee=s.replaceAll("aa","zz");
System.out.println(ee);  //Sanizz


//Example
	String po="How are you and you are the best"
			+ ""
			+ ""
			+ "";
	String gh=po.replaceAll("are", "r");
	System.out.println(gh);
	String ll=gh.replaceFirst("you","u");
	System.out.println(ll);
	System.out.println(po.replaceFirst("are","r").replaceAll("you", "u"));

}

}