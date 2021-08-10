package Pattern18march;

public class Rn2Rn2 {
public static void main(String[] args) {
	int end=6;
	for(int i=1;i<=5;i++)
	{
		if(i>=1)
		{
			end--;
			for(int j=end;j>=1;j--){
				System.out.print(j);
			}
		}
	System.out.println();	
	}
}
}
//	j=1 2 3 4 5   jstart jend
//i=1 5	4 3 2 1  0       4
//i=2 4 3 2 1	 0       3
//i=3 3 2 1      0       2
//i=4 2 1        0       1
//i=5 1          0       0