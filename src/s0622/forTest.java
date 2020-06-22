package s0622;

public class forTest
{

	public static void main(String[] args)
	{
		String[] strs = {"배가","많이","고파"};
		
		
		for(int i=0; i<strs.length; i++)
		{	String str = strs[i];
			System.out.println(strs[i]);
		}
		
		
		
		//향상된 포문
		
		for(String str:strs)
		{
			System.out.println(str);
		}
	}

}
