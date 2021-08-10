package morediff;

public class SequenceMissing {
public static void main(String[] args) {
	int a[]={7,4,6,1,10,2};
	int temp;
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++){
			if(a[i]>a[j]){
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println("Arays are sorted:");
	for(int i=0;i<a.length;i++){
		System.out.println(a[i]+" ");
	}
	System.out.println("Missing are:");
	for(int i=0;i<a.length;i++){
		int t=a[i]+1;
		while(t<a[i+1]){
			if(t!=a[i]){
				System.out.println(t+" ");
			}
			t++;
		}
	}
}
}
