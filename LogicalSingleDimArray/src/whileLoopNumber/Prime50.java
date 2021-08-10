package whileLoopNumber;

public class Prime50 {
public static void main(String[] args) {
	int i,num;
	for(num=0;num<50;num++)
	{	
		for ( i = 2; i < num; i++) 
		{
			if (num % i == 0) 
			{
				break;
			}
		}
		if (num== i) 
		{
			System.out.println("Prime No " + i);
		} 
	}
}
}
