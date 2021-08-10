package Pattern18march;

public class Hw1 {
public static void main(String[] args) {
int endp=0,endm=2;
for(int i=0;i<5;i++)
{
	if(i<=2)			
	{
		endp++;			
		for (int j = 0; j < endp; j++) {	
			System.out.print("*");
		}
	}
	else{
		endm--;
		for (int j = 0; j <=endm; j++) {
			System.out.print("*");
		}
	}
	System.out.println();
}
}
}


//		j=0  1  2  	jstart     jend
//i=0	*				0       0			
//i=1	*	*			0       1						
//i=2	*	*	*		0		2	
//i=3	*	*			0		1	
//i=4	*				0		0