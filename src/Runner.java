
public class Runner {
	public static void main1(String[] args) {
		int[] facts = { 1, 3628800, 479001600, 6, 18 };

		Factorial factorial = new Factorial();

		for (int i : facts) {
			System.out.println(factorial.reverseFactorial(i));
		}
	}

	public static void main(String[] args) {
		Doggo Dog = new Doggo();
		
		//System.out.println(Dog.Placings(1));
		int skip= 1;
		for (int i : Dog.Placings(skip)) {
			System.out.print(Dog.position(i));
		}
	}
}
