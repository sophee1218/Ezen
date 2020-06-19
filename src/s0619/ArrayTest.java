package s0619;

public class ArrayTest
{
	String[] strs;
	
	

	public static void main(String[] args)
	{
		ArrayTest at = new ArrayTest();
		at.strs = new String[3];
		at.strs[0] = "응급실떡볶이";
		String tmpStr = at.strs[0];
		
		at.strs = new String[4];
		
		at.strs[0] = tmpStr;
		System.out.println(at.strs[0]);
		
		

		
		
		/*swap
		 * 	 
		 */
//		int num1=4;
//		int num2=5;
//		
//
//		int tmp = num2;
//		num2 = num1;
//		num1 = tmp;
//				
//		System.out.println(num1);
//		System.out.println(num2);
	}

}
