package singleDimArray;
public class SecondMax {
	public static void main(String[] args) {
	int i;	
	
	int a[]={2,6,4,8,9,22};
	
	for(i=0;i<a.length-1;i++)
	{
		for(int j=0;j<a.length-1;j++)
		{	if(a[j]>a[j+1])			
			{
			//swaping
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
System.out.println("SECOND SMALLEST ELEMENT OF ARRAY: "+a[1]);//second smallest value
		
		for(i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{	if(a[j]<a[j+1])		//Descending 	
				{
				//swaping
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		System.out.println("SECOND LARGEST ELEMENT OF ARRAY: "+a[1]);//second largest value
		
		
		
		
		
		

}
}
