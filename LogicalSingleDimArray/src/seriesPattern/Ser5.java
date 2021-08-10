package seriesPattern;

public class Ser5 {
public static void main(String[] args) {
	int a, b, c,d;
	a = 0;
	b = 1;
	c=1;
	System.out.print(a + " " + b + " "+c + " ");
	for (int i = 4; i <= 8; i++) 
	{
		d = a + b + c;
		System.out.print(d + " ");
		a = b;
		b = c;
		c = d;
	}	
}
}
