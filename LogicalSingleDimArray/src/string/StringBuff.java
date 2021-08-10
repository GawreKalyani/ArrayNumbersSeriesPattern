package string;
//StringBuffer has synchronized methods,version 1.0,Mutable
//hashcodes are different for same containt "hello"
public class StringBuff {
	

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("hello");
		StringBuffer sb1=new StringBuffer("hello");
		sb.append(sb1);	//Mutable
		System.out.println(sb);//hellohello
		
		//hashcodes are different for same containt "hello"
		System.out.println(sb.hashCode());//366712642
		System.out.println(sb1.hashCode());//1829164700
		
		System.out.println(sb==sb1); //false
	
	}
}
