package s0624;

//짝수만 출력하기

public class StringArray3
{
	public static void main(String[] args)
	{
		String str = "1,32,43,51,23,55,66,77,88,99";
		String[] strs = str.split(",");
		int[] nums = new int[strs.length];

		for (int i = 0; i < strs.length; i++)
		{

			nums[i] = Integer.parseInt(strs[i]);

		}
		for (int num : nums)
		{
			if (num % 2 == 0)
			{
				System.out.println(num);
			}
		}
	}
}
