package seriesPattern;

public class S {
public static void main(String[] args) {
	int a[]={2,3,4,5,1};
	int b[]={2,8,4,5,1};
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<b.length;j++)
		{
			int x=a[i];
			int y=b[i];
			if(x*x*x==y)
			{
				System.out.println(a[i]);
			}
		}
	}
}
}
