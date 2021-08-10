package string;

public class StringHowManyTimesRep {
	public static void main(String[] args)
	{
		String str="JAVA";
		char ch[]=str.toCharArray();
		int freq[]=new int[ch.length];
	
	for(int i=0;i<ch.length;i++)
	{
		freq[i]=1;
		for (int j = i+1; j < freq.length; j++)
		{
			if(ch[i]==ch[j])
			{
				freq[i]++;
				ch[j]=0;
			}
		}
	}
	System.out.println("Array ..frequency");
	for (int i = 0; i < freq.length; i++)
	{
		if(ch[i]!=0)
		{
			System.out.println(ch[i]+"           "+freq[i]);
		}
	}
  }
}
