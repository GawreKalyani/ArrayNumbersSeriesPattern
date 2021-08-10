package Pattern18march;

public class Rn2 {
public static void main(String[] args) {
	for(int i=5;i>0;i--){
		
			for(int j=i;j>0;j--)
				System.out.print(j);
			
		System.out.println();
	}
}
}
//	j=0 1 2 3 4   jstart jend
//i=0 5	4 3 2 1  0       4
//i=1 4 3 2 1	 0       3
//i=2 3 2 1      0       2
//i=3 2 1        0       1
//i=4 1          0       0