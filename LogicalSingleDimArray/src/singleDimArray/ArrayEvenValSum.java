package singleDimArray;

public class ArrayEvenValSum {
	public static void main(String[] args) {
		int a[]=new int[5];
		a[0]=10;
		a[1]=5;
		a[2]=17;
		a[3]=19;
		a[4]=20;
		
		//Addition of Even  values(10,20) a[0]=10  and a[4]=20;;
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				sum=sum+a[i];
			}
		}
		System.out.println(sum);
}
}