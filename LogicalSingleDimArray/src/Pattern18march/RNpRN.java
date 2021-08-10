package Pattern18march;

public class RNpRN {
public static void main(String[] args) {
	int end=5;
	for(int i=5;i>=1;i--)
	{
		if(i>=0)
		{	end--;
			for(int j = 0; j <=end; j++)
				System.out.print(i);
		}
		System.out.println();
	}
	
}
}
//j=0 1 2 3 4  jstart jend
//i=0 5	5 5 5 5  0       4
//i=1 4 4 4 4	 0       3
//i=2 3 3 3      0       2
//i=3 2 2        0       1
//i=4 1          0       0