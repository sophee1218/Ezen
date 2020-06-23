package s0623;

public class Computer
{
	private String cpu;
	private int ram;
	private String board;
	Computer(String cpu, int ram, String board)
	{
		this.cpu = cpu;
		this.ram = ram;
		this.board = board;
	}
	
	void upgrade(String cpu)
	{
		this.cpu = cpu;
	
	}
	void upgrade(int ram)
	{
		this.ram = ram;
	}
	void upgrade(String cpu, int ram)
	{
		this.cpu = cpu;
		this.ram = ram;
	}
	void printInfo()
	{
		System.out.println("CPU :" + this.cpu);
		System.out.println("RAM :" + this.ram + "G");
		System.out.println("Main Board :" + this.board);
	}

}

