package singleDimArray;

public class SecMaxAndMax {
public static void main(String[] args) {
	int a[]={99,9,7,6,67};
	int max=a[0];
	int secMax=a[0];
	for (int i = 0; i < a.length; i++) {
		if(max<a[i])
			max=a[i];
	}
	if(max==a[0]){
		 secMax=a[1];
	}
	for (int i = 0; i < a.length; i++) {
		if(secMax<a[i]&& a[i]!=max)
			secMax=a[i];
	}
	System.out.println("Max value: "+max);
	System.out.println("Sec Max value: "+secMax);
}
}
