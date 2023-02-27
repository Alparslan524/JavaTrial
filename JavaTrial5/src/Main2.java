
public class Main2 {

	public static void main(String[] args) {
		int number = 2;
		boolean isItPrime = true;

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isItPrime = false;
			}
		}

		if (isItPrime == true) {
			System.out.println(number + " is a Prime number");
		} else {
			System.out.println(number + " is a not Prime number");
		}

	}

}
