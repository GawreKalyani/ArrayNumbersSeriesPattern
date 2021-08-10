package difficult;

public class ReverseElementsOfArray {
public static void main(String[] args) {
	int a[]={55,4,11,2,3,99,48,41,3};
	int b[]=new int[a.length];
	int j=a.length-1;
	for (int i = 0; i < a.length; i++,j--) {
		b[j]=a[i];
	}
	for (int i = 0; i < a.length; i++) {
		a[i]=b[i];
	}
	System.out.println("Reverse element of array..");
	for (int i = 0; i < a.length; i++) {
		System.out.print(b[i]+" ");
	}
}
}
