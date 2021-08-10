package March24;

public class E {
/*	4 4 4 4 
	7 7 7 7 7 7 7 
	5 5 5 5 5 
	1 
*/
public static void main(String[] args) {
	int n=1574,r;
	
	while(n>0)
	{
		r=n%10;
		n=n/10;
		for(int i=1;i<=r;i++){
			System.out.print(r+" ");
		}
		System.out.println();
	}
}
}
