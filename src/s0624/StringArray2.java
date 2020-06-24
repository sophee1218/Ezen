package s0624;


//중요!!!!!!!!!

public class StringArray2
{

	public static void main(String[] args)
	{
		String str = "91,12,18,96,07,30";
		String[] strs = str.split(",");
		int[] nums = new int[strs.length];
		for (int i = 0; i < strs.length; i++)
		{
			nums[i] = Integer.parseInt(strs[i]);
		}
		for (int num : nums)
		{
			System.out.println(num);
		}

	}

}
