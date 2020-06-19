package s0619.sub;

import s0619.sub.SubTest;

public class AccessTest
{
	public static void main(String[] args)
	{
		/*패키지가 다르면 public만 가능
		 * 
		 */
		SubTest st = new SubTest();
		st.num1 = 10;
		st.num2 = 10;
		st.num3 = 11;
		
		
	}

}
