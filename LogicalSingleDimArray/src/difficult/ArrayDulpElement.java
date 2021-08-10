package difficult;

public class ArrayDulpElement {
public static void main(String[] args) {
	int a[]={20,34,15,20,80};
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if(a[i]==a[j]){
				System.out.println(a[i]);
				break;
			}
		}
	}
}
}
