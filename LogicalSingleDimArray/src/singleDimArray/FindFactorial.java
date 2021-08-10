package singleDimArray;

public class FindFactorial {
	public static void main(String[] args) {
		int a[] = { 1, 4, 5, 3 };
		int b[] = { 1, 6, 8, 120,23 };
		
		for (int i = 0; i <a.length; i++)
		{	int fact=1;
			for(int k=1;k<=a[i];k++) //for factorial
			{
				fact=fact*k;
			}
			
			for (int j = 0; j < b.length; j++) 
			{
				if (fact==b[j])
				{
					System.out.println(a[i]);
				}
			}
		
	}
}
}