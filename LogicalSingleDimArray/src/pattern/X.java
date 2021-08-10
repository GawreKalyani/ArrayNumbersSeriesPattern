package pattern;

public class X {
	public static void main(String[] args) {
		for(int i=1;i<=9;i++){		//row=9
			for(int j=1;j<=3;j++){	//column=3
				
				//rows getting changed
				
				if(i>=1 && i<=3)	//row 1 2 3   # # # ,# # # ,# # #
				System.out.print("#"+"\t");
				
				if(i>=4 && i<=6)	//row 4  5 6  @ @ @,@ @ @,@ @ @
				System.out.print("@"+"\t");
				
				if(i>=7 && i<=9)	//rows 7 8 9 ***,***,***
				System.out.print("*"+"\t");
			}
			System.out.println();
		}
	}

}
