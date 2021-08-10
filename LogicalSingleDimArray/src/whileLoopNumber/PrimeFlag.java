package whileLoopNumber;

public class PrimeFlag {
public static void main(String[] args) {
	int n=14;
	int i;
	int flag=0;
	for ( i = 2; i <= (n - 1); i++) {
		if (n % i == 0) 
		{	flag=1;
			break;
		}
	}
	if (flag==0) 
	{
		System.out.println("Prime No " + n);
	} 
	else 
	{
		System.out.println("Not a Prime No " + n);
	}
}
}
