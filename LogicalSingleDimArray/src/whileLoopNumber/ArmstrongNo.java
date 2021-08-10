package whileLoopNumber;

public class ArmstrongNo {
public static void main(String[] args) {
	int n=150;
	int temp=n;
	int sum=0;
	while(n>0)
	{
		int r=n%10;
		n=n/10;
		sum=sum+(r*r*r);
	}
	if(sum==temp)
	{
		System.out.println("Armstrong No: "+temp);
	}
	else
	{
		System.out.println("Not an Armstrong No:"+temp);
	}
}

}
//153:armstrong