package whileLoopNumber;

public class ReverseNo {
	public static void main(String[] args) {
		int n=1234;
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			n=n/10;
			sum=(sum*10)+r;
		}
		System.out.println("Reverse the no " +sum);
	}
}
