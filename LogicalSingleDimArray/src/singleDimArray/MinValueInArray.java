package singleDimArray;

public class MinValueInArray {
public static void main(String[] args) {
	int a[]=new int[5];
	a[0]=10;
	a[1]=5;
	a[2]=17;
	a[3]=19;
	a[4]=20;
	
	//Minimum value in the Array say a[1]=5;
	int min=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(min>a[i])
		{
			min=a[i];	
		}
	}
	System.out.println(min);
}
	
}

