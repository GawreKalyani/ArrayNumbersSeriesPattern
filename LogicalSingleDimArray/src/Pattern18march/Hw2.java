package Pattern18march;

public class Hw2 {
public static void main(String[] args) {
	int endp=1,endm=4;
	for(int i=1;i<=5;i++)
	{
		if(i<=3)			
		{
			endp++;			
			for (int j = 1; j < endp; j++) {	
				System.out.print(j+" ");
			}
		}
		else{
			endm--;
			for (int j = 1; j <endm; j++) {
				System.out.print(j+" ");
			}
		}
		System.out.println();
	}
}
}
//		j=1  2  3  	jstart     jend
//i=1	1				1       1			
//i=2	1	2			1       2						
//i=3	1	2	3		1		3	
//i=4	1	2			1		2	
//i=5	1				1		1
