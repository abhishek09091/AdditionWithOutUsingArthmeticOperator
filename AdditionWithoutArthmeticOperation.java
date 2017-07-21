package bitmanipulation;

public class AdditionWithoutArthmeticOperation {

	public static int addition(int x,int y)
	{

		while(y!=0)
		{
			int carry = x & y;
			
			x = x ^ y;
			
			y = carry << 1 ;
		}
		
		return x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Result of following operation "+ addition(-15, 17));
		
	}

}
