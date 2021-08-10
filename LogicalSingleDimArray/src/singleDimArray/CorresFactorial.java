package singleDimArray;

public class CorresFactorial {
public static void main(String[] args) {
	int a[]={1,3,2,6,7,9,5};
	int b[]=new int[a.length];
	
	for(int i=0;i<a.length;i++)   //for array
	{
		int fact=1;
		for(int k=1;k<=a[i];k++) //for factorial
		{
			fact=fact*k;
		}
		b[i]=fact;
	}
	for(int i=0;i<b.length;i++)
	{
		System.out.print(b[i]+"   ");
	}
}
}
