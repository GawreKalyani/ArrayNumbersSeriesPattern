package March24;

public class C {
/*	
	4      4*1
	30		3*10
	200		2*100
	1000     1*1000
*/
	public static void main(String[] args) {
		int n=1234,r,k=1;
		
		while(n>0)
		{
			r=n%10;
			n=n/10;
			
			System.out.println(r*k);
			k=k*10;
		}
	}
}
