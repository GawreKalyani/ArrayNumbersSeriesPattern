package March24;

public class D {
/*	
	4             
	43            
	432
	4321
*/
	public static void main(String[] args) {
		int n=1234,r,sum=0;
		
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum=(sum*10)+r;
			System.out.println(sum+" ");
		}
		
	}
}
