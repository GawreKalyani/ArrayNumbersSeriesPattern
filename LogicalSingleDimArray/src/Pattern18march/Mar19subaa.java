package Pattern18march;

public class Mar19subaa {
public static void main(String[] args) {
	int sumH=0,sumA=0,k=0;
	for (int i = 0; i < 5; i++) {
		for (int j = 0; j < 5; j++) {
			k++;
			if(i==0||j==0||i==4||j==4)
			{
				System.out.print(k+" ");
				sumH+=k;
			}
			else{
				System.out.print(k+" ");
				sumA+=k;
			}
		}
		System.out.println();
	}
	System.out.println();
	System.out.println("sumH:  "+sumH);
	System.out.println("sumA:  "+sumA);
}
}

