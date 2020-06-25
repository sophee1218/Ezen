package s0625;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Point3
{
	public static void main(String[] args)
	{
		List<Student> stList = new ArrayList<>();
		Random r = new Random();
		for (int i = 0; i < 5; i++)
		{
			Student s = new Student();
			s.setName("이름" + i);
			s.setPoint(r.nextInt(101));
			stList.add(s);

		}
		int max = 0;
		int min = 0;
		String maxName = "";
		String minName = "";
		
		for (int i = 0; i < stList.size(); i++)
		{
			Student st = stList.get(i);
			if (i == 0)
			{
				min = st.getPoint();
				max = st.getPoint();
				minName = st.getName();
				minName = st.getName();
			}
			if (min > st.getPoint())
			{
				min = st.getPoint();
				minName = st.getName();
			}
			if (max < st.getPoint())
			{
				max = st.getPoint();
				maxName = st.getName();
			}
		}

		System.out.println("1등:" + maxName + " , 점수 : " + max);
		System.out.println("5등:" + minName + " , 점수 : " + min);
	}

}
