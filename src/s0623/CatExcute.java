package s0623;

public class CatExcute
{

	public static void main(String[] args)
	{
		Cat[] cats = new Cat[10];
		for (int i = 0; i < cats.length; i++)
		{
			cats[i] = new Cat();
			cats[i].setName("야옹이" + i);
			cats[i].setAge(i);
		}
		
		//향상된 for문
		
		for (Cat cat:cats)
		{
			System.out.println(cat);
		}
	}

}
