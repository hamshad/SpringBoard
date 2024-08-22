class Calculator {

	// Implement your code here
	public double findAverage(int number1, int number2, int number3) {
		return (double) (number1 + number2 + number3) / 3;
	}
}

class Tester {

	public static void main(String args[]) {
		Calculator calculator = new Calculator();
		// Invoke the method findAverage of the Calculator class and display the average
		double average = calculator.findAverage(12, 8, 15);
		System.out.println(Math.round(average * 100.0) / 100.0);
	}
}
