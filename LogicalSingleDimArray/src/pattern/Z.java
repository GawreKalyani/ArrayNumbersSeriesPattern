package pattern;

public class Z {
	public static void main(String[] args) {
		for(int i=1;i<=3;i++)
		{		//row=3
			for(int j=1;j<=9;j++)
			{	//column=9
				
				//columns getting changed
				
				if(j>=1 && j<=3)	//column 1 2 3  
				System.out.print(j+" ");
				
				else if(j>=4 && j<=6)	//column 4  5 6  
				System.out.print("*"+" ");
				
				else if(j>=7 && j<=9)
				
					if(i==2 && j==8)
					System.out.print("2"+" ");
				
					else
					System.out.print("1"+" ");
					
			}
			System.out.println();
		}
		
	}
}

