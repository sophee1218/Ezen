package s0624;

import java.util.ArrayList;
import java.util.List;

public class ListTest
{
	public static void main(String[] args)
	{
		List<Integer> numList = new ArrayList<>();
		for (int i = 0; i < 10; i++)
		{
			int num = (int) (Math.random() * 10) + 1;
			if (numList.indexOf(num) != -1)
			{
				i--;

			} else
			{
				numList.add(num);
			}

		}
		for (int i = 0; i < 10; i++)
		{
			System.out.println(i + "공간:" + numList.get(i));
		}

//		
//		List<String> strList = new ArrayList<>();
//		strList.add("경훈");
//		strList.add("민서");
//		strList.add("송희");
//		System.out.println(strList.indexOf("경훈"));
//		

	}

}
