package whileLoopNumber;

public class SumOfDigit {
public static void main(String[] args) {
	int n=1234;
	int sum=0;
	while(n>0)
	{
		int r=n%10;
		n=n/10;
		sum=sum+r;
	}
	System.out.println("Sum of Digits Of no= "+sum);
}
}
