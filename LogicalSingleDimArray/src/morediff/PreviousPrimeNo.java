package morediff;

public class PreviousPrimeNo {
public static void main(String[] args) {
	int n=15,i;
	for( i=n-1;i>=i-1;i--)
	{
		int counter=0;
		int flag=0;
		for(int j=2;j<i/2;j++)
		{
			if(i%j==0)
			{
				flag=1;
				break;
			}
			if(flag==0)
			{
				counter=1;
			}
		}
		if(counter==1)
			break;
	}
	System.out.println(i);
}
}

