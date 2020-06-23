package s0623;

public class Execute
{
	public static void main(String[] args)
	{
		Computer c;
		c = new Computer("intel i7", 16, "msi");
		c.upgrade("intel super");
		c.printInfo();
		
	}

}
