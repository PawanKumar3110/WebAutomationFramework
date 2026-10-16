
public class JavaPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "This is a 'test' string";
		String[] splittedString = s.split(" ");
		String[] splittedString2 = s.split("a");
		
		
		System.out.println(">>Splitted string1: ");
		for (String splitString: splittedString)
		{
			System.out.println(splitString);
		}
		System.out.println("");
		
		System.out.println(">>Splitted string2: ");
		for (String splitString: splittedString2)
		{
			System.out.println(splitString.trim());
		}
		System.out.println("");
		
		System.out.println(">>Characters in the string: ");
		for (int i=0; i<s.length(); i++)
		{
		System.out.print(s.charAt(i));
		System.out.print(" ");
		}
		System.out.println("");
		
		System.out.println(">>Reverse Characters in the string: ");
		for (int i=s.length()-1; i>=0; i--)
		{
		System.out.print(s.charAt(i));
		System.out.print(" ");
		}
				

	}

}
