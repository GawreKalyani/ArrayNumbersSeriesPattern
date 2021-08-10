package pattern;

public class A1 {
public static void main(String[] args) {
	int k=6;
	for(int i=1;i<=3;i++){
		int colend=k+i;
		for(int j=1;j<=9;j++){
			if(j>=1 && j<=3)
			{System.out.print(j+" ");}
			
			if(j>=4 && j<=6)
			{System.out.print("*"+" ");}
			
			

			else if(j>=7 && j<=9)
			{
				if(j<=colend)
					System.out.print("@"+" ");
				else
					System.out.print("%"+" ");
			
			}
		}
		System.out.println();
	}
	
}
}
