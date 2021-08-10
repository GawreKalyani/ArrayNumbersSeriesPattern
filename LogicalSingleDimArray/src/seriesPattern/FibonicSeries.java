package seriesPattern;

public class FibonicSeries {
	public static void main(String[] args) {
		// first two no 0 1
		int a, b, c;
		a = 0;
		b = 1;
		System.out.print(a + " " + b + " ");
		for (int i = 3; i <= 11; i++) 
		{
			c = a + b;                     //c=0+1=1 ie a=0,b=1
			System.out.print(c + " ");
			a = b;                         //a=1
			b = c;                         //b=1
		}
	}
}
// 0 1 1 2 3 5 8 13 Output
