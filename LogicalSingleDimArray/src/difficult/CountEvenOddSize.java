package difficult;

public class CountEvenOddSize {
public static void main(String[] args) {
	int even=0;
	int odd=0;
	int arr[]={1,2,3,4,5};
	for (int i = 0; i < arr.length; i++) 
	{
		if(arr[i]%2==0)
		{
			even++;
		}
		else
		{
			odd++;
		}
	}
	
	int b[]=new int[even];
	int c[]=new int[odd];
	System.out.println("No of evenNos: "+even+"and No of oddnos present in array :"+odd);
	
	System.out.println("Even nos present in array are:");
	for (int i = 0,j=0; ((i<arr.length)&&(j<b.length)); i++) 
	{
		if(arr[i]%2==0)
		{
			b[j]=arr[i];
			
			System.out.println(b[j]+" ");
			j++;
		}
		
	}
	System.out.println();
	System.out.println("Odd nos present in array are:");
	for (int i = 0,j=0; ((i<arr.length)&&(j<c.length)); i++) 
	{
		if(arr[i]%2!=0)
		{
			c[j]=arr[i];
			
			System.out.println(c[j]+" ");
			j++;
		}
		
		
		
		
		
	}
}
}
