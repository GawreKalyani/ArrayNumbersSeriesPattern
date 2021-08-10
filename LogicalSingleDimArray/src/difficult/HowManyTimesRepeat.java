package difficult;

public class HowManyTimesRepeat {
public static void main(String[] args) {
	int a[]={2,5,7,2,9,2,7};
	int freq[]=new int[a.length];
	
	for(int i=0;i<a.length;i++){
		freq[i]=1;
		for (int j = i+1; j < freq.length; j++)
		{
			if(a[i]==a[j]){
			freq[i]++;
			a[j]=0;
			}
		}
	}
	System.out.println("Array ..frequency");
	for (int i = 0; i < freq.length; i++) {
		if(a[i]!=0){
			System.out.println(a[i]+"           "+freq[i]);
		}
	}
	
	
	
	
	
}
}
