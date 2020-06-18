package s0618_2;


public class Animal implements Action
{

	@Override
	public void hug()
	{
		System.out.println("동물이 안겨와용");
	}

	@Override
	public void cry()
	{
		System.out.println("동물이 울어용");
	}
	
}
