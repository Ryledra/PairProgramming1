
public class Runner {
	public static void main(String[] args)	{
		int[] facts = {1,3628800,479001600,6,18};
		
		Factorial factorial = new Factorial();
		
		for (int i : facts)	{
			System.out.println(factorial.reverseFactorial(i));
		}
	}
}
