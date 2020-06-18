package s0616;

public class Person
{
	String name;
	String address;
	int age;

	void run(String name, int age)
	{
		System.out.println(name + "이 달립니다.");
		if (age > 30)
		{
			System.out.println(age + "가 되니까 지치는구나..");
		} else
		{
			System.out.println("쌩쌩하구만!!");
		}
	}

	public static void main(String[] args)
	{
		Person[] people = new Person[5];

		people[0] = new Person();

		Person p = new Person();
	
		p.run("신송희",30);
	
		

	}
}