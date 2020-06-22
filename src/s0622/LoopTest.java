package s0622;

public class LoopTest
{

	public static void main(String[] args)
	{
		// 1 - 1000까지 더한 후 결과값을 출력

		int n1 = 0;
		int n2 = 0;

		for (int i = 1; i <= 1000; i++)
		{
			if (i % 2 == 0)
			{
				n1 += i;
			} else
			{
				n2 += i;
			}
		}
		System.out.println("짝수의 값 : " + n1);
		System.out.println("홀수의 값 : " + n2);
	}

}
