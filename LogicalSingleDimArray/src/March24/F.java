package March24;

public class F {
/*	
	16 17 18 19 20 
	1  2   3  4 5 
	6  7   8  9 10 
	11 12 13 14 15 
	21 22 23 24 25 
*/
public static void main(String[] args) {
	int k=16;
	for(int i=0;i<5;i++){
		for(int j=0;j<5;j++){
			System.out.print(k++ +" ");
			if(k==21)
			{
				k=1;
			}
			if(k==16){
				k=21;
			}
		}
		System.out.println();
	}
}
}
