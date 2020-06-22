package s0622;

public class IfTest
{

	static void test()
	{

	}

	public static void main(String[] args)
	{

//		double d = Math.random();
//		int num = (int)(d*20)+1;
//		System.out.println(num);

		System.out.println("검증시작");
		for (int i = 1; i <= 10000; i++)
		{
			double d = Math.random();
			int num = (int) (d * 20) + 1;

			if (num < 1 || num > 20)
			{
				System.out.println(num + ":뭔가이상 ");

			}
		}
		System.out.println("종료");

	}

}
