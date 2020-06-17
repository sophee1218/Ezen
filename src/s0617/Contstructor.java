package s0617;

public class Contstructor //생성자
{
	/* 생상자는 데이터 타입이 없다.
	 * 대소문자까지 class명과 동일하다.
	 * */
	 
	int a=1;
	
	Contstructor(){
		System.out.println("나 쉬운 클래스 아니다");
	}
	public static void main(String[] args)
	{
		Contstructor c = new Contstructor();
		System.out.println(c);
	}

}
