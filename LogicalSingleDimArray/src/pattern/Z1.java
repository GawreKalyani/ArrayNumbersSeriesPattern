package pattern;

public class Z1 {
public static void main(String[] args) {
	
	for(int i=1;i<=3;i++)
	{int n=0;
		for(int j=1;j<=9;j++)
		{
		 if(j>=1 && j<=3)
			if(i==2 && j==2)
				System.out.print("2"+" ");
			else
			{System.out.print("1"+" ");}
			if(j>=4 && j<=6)
				System.out.print("*"+" ");
			if(j>=7 && j<=9){
				
				n=n+1;
			System.out.print(n + " ");}
				
				
		}
		System.out.println();
	}
	
}
}
