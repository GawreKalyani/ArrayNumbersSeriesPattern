package pattern;

public class Z2 {
public static void main(String[] args) {
	for(int i=1;i<=3;i++)
	{	int z=6;
		for(int j=1;j<=9;j++)
		{
			if(j>=1 && j<=3)
			{	z=z+1;
				System.out.print(z+" ");
			}
			if(j>=4 && j<=6)
				System.out.print("*"+" ");
			if(j>=7 && j<=9)
				System.out.print(j+" ");
		}
		System.out.println();
	}
}
}
