
public class MethodPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int a = 10;
	int b = 20;
	
	MethodPractice mp = new MethodPractice();
	System.out.println("Sum 1 is: " + mp.add(a, b));
	
	int x = 30;
	int y = 40;
	
	System.out.println("Sum 2 is: "+ add2(x, y));
	
	
	}
	
	
	public int add(int a, int b)
	{
		int c = a + b;
		return c;
	}
	
	public static int add2(int x, int y)
	{
		int z = x + y;
		return z;
	}
	
	

}
