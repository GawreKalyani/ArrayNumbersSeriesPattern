package singleDimArray;
//Ascending
public class Sorting {
public static void main(String[] args) {
	int a[]={2,6,4,8,9,22};
	int i;
	for( i=0;i<a.length-1;i++)
	{
		for(int j=0;j<a.length-1;j++)
		{	if(a[j]>a[j+1])		//Descending if(a[j]<a[j+1])	
			{
			//swaping
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	for(i=0;i<a.length;i++){
		System.out.println(a[i]);//2 4 6 8 9 22
	}
}
}
