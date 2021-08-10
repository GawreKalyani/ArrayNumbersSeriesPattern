package Pattern18march;

public class P {
public static void main(String[] args) {
	int start=2,end=2,i,j;
	for(i=0;i<=2;i++,start--,end++)
	{
		for ( j = 0; j <=4; j++)
		{
			if((j>=start)&&(j<=end))
			System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
}
}


//		j=0  1  2   3   4		jstart     jend
//i=0			*				2			2
//i=1		*	*	*			1			3
//i=2	*	*	*	*	*		0			4
//							 start--      end++