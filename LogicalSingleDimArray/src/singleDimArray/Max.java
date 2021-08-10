package singleDimArray;

public class Max {
public static void main(String[] args) {
	int a[]=new int[5]; //or int a[]={8,6,3,7,9}
	a[0]=10;
	a[1]=5;
	a[2]=17;
	a[3]=19;
	a[4]=20;
	
	//Minimum value in the Array say a[1]=5;
	int max=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(max<a[i])
		{
			max=a[i];	
		}
	}
	System.out.println(max); //20
}
}

