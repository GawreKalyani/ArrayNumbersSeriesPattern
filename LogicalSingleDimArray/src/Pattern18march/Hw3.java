package Pattern18march;

public class Hw3 {
public static void main(String[] args) {
	int endp=0,endm=2;
	for(int i=1;i<=5;i++)
	{
		if(i<=3)			
		{
			endp++;			
			for (int j = 0; j < endp; j++) {	
				System.out.print(i+" ");
			}
		}
		else{
			endm--;
			for (int j = 0; j <=endm; j++) {
				System.out.print(endm+1 +" ");
			}
		}
		System.out.println();
	}
}
}
/*       	j=1		j=2    j=3      jstart    jend
	i=1		1 							1      1
	i=2		2 		2                   1      2
	i=3		3 		3 		3 			1      3
	i=4		4 		4                   1      2
	i=5		3 							1       1
				*/