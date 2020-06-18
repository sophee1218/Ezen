package s0618;

public class Dog extends Animal
{/*오버라이딩
*/
	public void speak()
	{
		System.out.println("강아지가 짖습니다.");

	}

	public static void main(String[] args)
	{
		Animal d = new Dog();
		d.speak();

	}

}
