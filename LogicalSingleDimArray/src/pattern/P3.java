package pattern;

public class P3 {
public static void main(String[] args) {
	int k=0;
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			if(k==0)
			{	
				k=1;
				System.out.print(k+" ");
			}
			else
			{	k=0;
				System.out.print(k+" ");
			}
		}
		System.out.println();
	}
}
}
