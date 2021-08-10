package Pattern18march;

public class RN {
public static void main(String[] args) {
	for(int i=5;i>0;i--){
		for(int j=1;j<=i;j++)
		{
			
			System.out.print(i);
			
		}
		System.out.println();
	}
}
}
//	j=0 1 2 3 4  jstart jend
//i=0 5	5 5 5 5  0       4
//i=1 4 4 4 4	 0       3
//i=2 3 3 3      0       2
//i=3 2 2        0       1
//i=4 1          0       0