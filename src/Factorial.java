
public class Factorial {
	public String reverseFactorial(int factorial)	{
		
		int i = 1;
		double fact = factorial;
		
		do{
			if (factorial == 1) break;
			i++;
			fact /= i;
		} while (fact > 1);
		if (fact != 1) return (factorial + " None");
		else return (factorial + " = " + i + "!");
	}
}
