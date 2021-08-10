package singleDimArray;

public class AllValueAddition {
	public static void main(String[] args) {
		int a[]=new int[5];
		a[0]=1;
		a[1]=5;
		a[2]=1;
		a[3]=1;
		a[4]=2;
		
//All Values to be added 1+5+1+1+2=10
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];	
		}
		System.out.println(sum);		//10
}
}
