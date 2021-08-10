package singleDimArray;

public class IterateArray {
public static void main(String[] args) {
	int a[]=new int[5];
	a[0]=10;
	a[1]=5;
	a[2]=17;
	a[3]=19;
	a[4]=20;
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+"\t");
	}
	
	System.out.println("Iterating using forEach loop");
	
	for(int ele:a)
	{
		System.out.println(ele);
	}
}
}
