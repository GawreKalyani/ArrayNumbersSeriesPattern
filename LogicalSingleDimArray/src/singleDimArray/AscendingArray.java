package singleDimArray;


public class AscendingArray {                       //replace
	public static void main(String[] args) {
		int i;
		int a[]={67,89,90,21,11};
		for( i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];    
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for( i=0;i<a.length;i++)
		System.out.println(a[i]);
	}
}
