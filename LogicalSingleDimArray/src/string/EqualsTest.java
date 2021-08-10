package string;

public class EqualsTest {
	
public static void main(String[]Args){
		   A a = new A("kiran"); 
		   A a1 = new A("jbk");
		   A a2 = new A("kiran"); 
		    String x = "javabykiran"; 
		    String y = "jbk";
		    String z = new String("javabykiran");
		  //guess true or false without seeing output
		    System.out.println(x==z);
		    System.out.println(y==z);
		    System.out.println(x.equals(y)); 
		    System.out.println(x==y); 
		    System.out.println(x.equals(z)); 
		  //  System.out.println(a==a); 
		    System.out.println(a==a1); 
		    System.out.println(a1==a2);//class ka objects
		    System.out.println(a.equals(a2)); //hascode of obj differs
		    System.out.println(a1.equals(y));//hascode of obj differs
		    
		   
		        String s1 = "Hello"; // String literal 
		        String s2 = "Hello"; // String literal 
		        String s3 = s1; // same reference
		        String s4 = new String("Hello"); // String object 
		        String s5 = new String("Hello"); // String object
		    //  System.out.println(s1 == s1); // true,same pointer
		      System.out.println(s1 == s2); // true,s1 and s2 share          
		                                    //storage in pool
		      System.out.println(s1 == s3); //true, s3 is assigned same 
		                                    //pointer as s1
		      System.out.println(s1.equals(s3)); // true, same contents
		      System.out.println(s1 == s4); //false, different pointers 
		        s1.equals(s4); // true, same contents
		      System.out.println(s4 == s5); // false, different pointers in 
		                                    //heap
		      System.out.println(s4.equals(s5)); // true, same contents
		   
		   }
}
