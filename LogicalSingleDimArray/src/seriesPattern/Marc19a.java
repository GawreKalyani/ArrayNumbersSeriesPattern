package seriesPattern;

public class Marc19a {
public static void main(String[] args) {
	int p=11;
	System.out.println(p);
	for(int i=0;i<3;i++){
		int result=p*p;
		System.out.println(result);
		p=(p*10)+1;		
	}
}
}
// 	11			11			11
//	121			11*11		11*11
//	12321		111*111		(11*10+1)*(11*10+1)
//	1234321		1111*1111	(111*10+1)*(111*10+1)
