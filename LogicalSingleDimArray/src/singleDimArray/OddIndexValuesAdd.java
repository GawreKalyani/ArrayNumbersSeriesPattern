package singleDimArray;

public class OddIndexValuesAdd {
public static void main(String[] args) {
	int a[]=new int[5];
	a[0]=10;
	a[1]=5;
	a[2]=3;
	a[3]=1;
	a[4]=7;
	
	//Addition of values OF ODD ARRAY INDEX say a[1]=5;	a[3]=1;
	int sum=0;
	for(int i=0;i<a.length;i++){
		if(i%2!=0){
			sum=sum+a[i];
		}
	}
	System.out.println(sum);
}
}
