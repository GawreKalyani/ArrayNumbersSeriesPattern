package singleDimArray;

public class SearchCube {
	public static void main(String[] args) {
		int a[] = { 1, 4, 5, 2 };
		int b[] = { -1, 2, 8, 125, 22, 55, 98 };

		for (int i = 0; i < a.length; i++)
		{
			int cube = a[i] * a[i] * a[i];
			
			for (int j = 0; j < b.length; j++) 
			{
				if (cube==b[j])
				{
					System.out.println(a[i]);
				}
			}
		}

	}
	
}
