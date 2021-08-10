package seriesPattern;

public class Ser2 {
public static void main(String[] args) {
	int k=0;//start of series
	for(int i=0;i<=8;i++)
	{
		 k=k+i;			//can write k+=i;
		System.out.print(k+" "); //0 1 3 6 10 15 21 28 36 
	}
}
}
//series 0 1 3 6 10 15 21
//i=0    i=1   i=2   i=3   i=4    i=5		i=6   i=7      i=8
//0+0=0,0+1=1,1+2=3,3+3=6,6+4=10,10+5=15,15+6=21,21+7=28,28+8=36