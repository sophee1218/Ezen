package s0624;


//중요!!!

import java.util.ArrayList;
import java.util.List;

public class ListTest4
{
	public static void main(String[] args)
	{
		List<Person> pList = new ArrayList<>();
		Person p = new Person();
		pList.add(p);
		p.setName("조민서");
		System.out.println(p);
		p = new Person();
		System.out.println(p);
		System.out.println(pList.get(0));
	}

}
