package s0624;

import java.util.Random;
import java.util.Scanner;


public class NumBaseBall

//int와 문자열의 비교!!!

{

	public static void main(String[] args)
	{
		Random r = new Random();
		int rNum = r.nextInt(10);
		Scanner s = new Scanner(System.in);
		
		System.out.println("맞춰보세여~~~~ : ");
		String numStr = s.nextLine();
		
		while(!numStr.equals(rNum+""))
		{
			System.out.print("틀렸어 다시! : ");
			numStr = s.nextLine();
		}
			
		System.out.printf("rNum=%d, 너의대답=%s",rNum,numStr);
		
	}

}
