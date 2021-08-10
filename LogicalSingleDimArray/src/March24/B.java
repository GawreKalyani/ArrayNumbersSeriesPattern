package March24;

public class B {
	/*
	40
	30
	20
	10
*/
public static void main(String[] args) {
	int n=1234,r;
	
	while(n>0)
	{
		r=n%10;
		n=n/10;
		System.out.println(r*10);
	}
}
}
