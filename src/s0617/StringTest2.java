package s0617;

public class StringTest2
{
	static int length(String str)
	{	int cnt = 0;
		for(int i=0; i<str.length(); i++)
		{
		System.out.println(str.charAt(i));
		cnt++;
		}
		
		return cnt;
	}
	
	
	public static void main(String[] args)
	{
		String str = "123452";
		int cnt = length(str);
		System.out.println();
		//
	}

}
