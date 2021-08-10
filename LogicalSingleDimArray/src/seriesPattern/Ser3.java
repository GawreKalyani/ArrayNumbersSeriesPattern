package seriesPattern;

public class Ser3 {
public static void main(String[] args) {
	int k=0;
	for(int i=0;i<=8;i++)
	{
		k=k+(i*i);
		System.out.print(k+" ");  //0 1 5 14 30 55 91 140 204 
	}
}
}
//0 1 5 14 30 55 91 140 204 
//0+0*0=0, 0+1*1=1, 1+2*2=5 ,5+3*3=14
//k=0      k=0      k=1      k=5