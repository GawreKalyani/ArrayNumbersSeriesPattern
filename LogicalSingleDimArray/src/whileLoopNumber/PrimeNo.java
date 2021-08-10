package whileLoopNumber;

public class PrimeNo {
	public static void main(String[] args) {
		int n = 1;
		int i;
		for ( i = 2; i<n; i++)             //	for ( i = 2; i <= (n - 1); i++)
		{ 
			if (n % i == 0) 
			{
				break;
			}
		}
		if (i == n) 
		{
			System.out.println("Prime No " + n);
		} 
		else 
		{
			System.out.println("Not a Prime No " + n);
		}

	}
}
