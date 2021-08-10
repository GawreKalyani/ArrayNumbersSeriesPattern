package pattern;

public class P1main {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{int k=0;
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
