package difficult;

public class Triplet {
	public static void main(String[] args) {
		int a[]={1,2,3,4,5};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) 
			{
				for (int k = 0; k < a.length; k++)
				{if( j>i && k>j){
					System.out.println(a[i]+" , "+a[j]+" , "+a[k]);
				}
				}
			}
		}
	}
}
