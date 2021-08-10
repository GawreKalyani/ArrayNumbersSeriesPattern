package whileLoopNumber;

public class Pallindrome {
	public static void main(String[] args) {
		int n=121;
		int temp;
		temp=n;
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			n=n/10;
			sum=(sum*10)+r;
		}
		if(sum==temp)
		System.out.println(" Pallindrome no " +temp);
		else
			System.out.println("Not a pallindrome no"+temp);
	}
}
