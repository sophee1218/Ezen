package s0624;

/*
 * ArrayList
 * LinkedList
*/

import java.util.ArrayList;
import java.util.List;

public class ListTest2
{
	public static void main(String[] args)
	{
		List<String> strList = new ArrayList<>();
		strList.add("박선생님");
		strList.add("안녕하신가요");
		strList.add("까꿍");
		int idx = strList.indexOf("까꿍");
		System.out.println(idx);
		
		
	}
}
