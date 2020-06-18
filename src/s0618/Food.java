package s0618;

class JokBal extends Food
{
	
}
class DonKass extends Food
{
	
}
class Duckbokki extends Food
{
	
}
public class Food
{
	public static void main(String[] args)
	{
		Food f = new DonKass(); 
		DonKass d = (DonKass)f; //강제형변환
		
	}

}
