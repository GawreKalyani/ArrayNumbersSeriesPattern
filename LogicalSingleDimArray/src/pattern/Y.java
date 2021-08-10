package pattern;

public class Y {
	public static void main(String[] args) {
		for(int i=1;i<=3;i++){		//row=3
			for(int j=1;j<=9;j++){	//column=9
				
				//columns getting changed
				
				if(j>=1 && j<=3)	//column 1 2 3  
				System.out.print("#"+"\t");
				
				if(j>=4 && j<=6)	//column 4  5 6  
				System.out.print("@"+"\t");
				
				if(j>=7 && j<=9)	//column 7 8 9 
				System.out.print("*"+"\t");
			}
			System.out.println();
		}
	}
}
