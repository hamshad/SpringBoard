class Calculator {

	// Implement your code here
	public int num;

	public int sumOfDigits() {
		int sum = 0;
		char[] digits = String.valueOf(num).toCharArray();
		for (char i : digits)
			sum += Integer.valueOf(String.valueOf(i));
		return sum;
	}

}

class Tester {

	public static void main(String args[]) {

		Calculator calculator = new Calculator();

		// Assign a value to the member variable num of Calculator class
		calculator.num = 123;

		// Invoke the method sumOfDigits of Calculator class and display the output
		int sum = calculator.sumOfDigits();
		System.out.println(sum);

	}
}
