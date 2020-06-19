package s0619;

import s0619.sub.SubTest;

public class AccessTest extends SubTest

{
	public static void main(String[] args)
	{
		/*패키지가 다르면 public만 가능
		 * 
		 */
		SubTest st = new SubTest();
		st.num1 = 10;
		
		
		
	}

}
