package singleDimArray;

public class SecSmallAndSmall {
	public static void main(String[] args)
	{
		int a[]={1,10,4,15,6,7};
		int small=a[0];
		int secondsmall=a[0] ;
		
		for(int i=0 ; i<a.length ; i++)
		{
			if (small>a[i])
			{
				small = a[i];
			}
		}
		
		if (small==a[0])
		{
			secondsmall=a[1];
		}
		
		for(int i=0 ; i<a.length ; i++)
		{	
			if(secondsmall > a[i] && a[i] != small)
			{
				secondsmall = a[i] ;
			}
		}
		System.out.println("Smallest no = "+ small); 
		System.out.println("Second smallest no = "+ secondsmall);
	}
}
