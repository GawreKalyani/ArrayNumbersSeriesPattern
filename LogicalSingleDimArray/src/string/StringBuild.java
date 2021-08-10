package string;
//Version 1.5,Mutable,Not synchronized method,append
public class StringBuild {
public static void main(String[] args) {
	StringBuilder sb=new StringBuilder("Farida");
	StringBuilder sb1=new StringBuilder("Farida");
	sb.append(sb1);
	System.out.println(sb);
	
	//hashcodes are different for same containt "Farida"
	System.out.println(sb.hashCode());//366712642
	System.out.println(sb1.hashCode()); //1829164700
	System.out.println(sb==sb1);
}
}
