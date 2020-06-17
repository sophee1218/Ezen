package s0617;

public class MethodTest
{	/*overloading : 
	1 같은 영역 내에 있어야 함
	2 메소드명이 같아야함
	3 파라메터의 갯수가 달라야함
	4 파라메터의 갯수가 같더라도 데이터 타입이 달라야 함
	5 파라메터의 갯수. 데이터타입이 같아야함
		위치가 달라야함
	*/
	
	static int add(int num1, int num2) {
		return num1+num2;
	}
	
	static String add(String str1, String str2) {
		return str1+str2;
		
	}
	
	
	public static void main(String[] args)
	{/*
		int a = add();
		a = add();
		System.out.println("123".length());  			 // length : 값을 넣으면 안됨
		System.out.println("123".indexOf("1"));			 // indexOf : 한번에 한가지만
		System.out.println("123".replace("1","일"));		 // replace : 두가지를 넣어야함
	*/
		
		
		System.out.println(add(1,2));
		System.out.println(add("오늘은", " 피곤하다"));

	}
}
