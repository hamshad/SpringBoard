class Tester {

	public static int[] findNumbers(int num1, int num2) {
		int[] numbers = new int[6];

		if (num1 >= num2) return numbers;
		// Implement your code here
		for (int i = 0; i < numbers.length && num1 <= num2; num1++) {
			if (num1 > 9 && num1 < 100 && num1 % 5 == 0) {
				int a = num1;
				int sum = 0;
				while (a > 0) {
					sum += a % 10;
					a /= 10;
				}
				if (sum % 3 == 0) {
					numbers[i] = num1;
					i++;
				}
			}
		}

		return numbers;
	}

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 30;

		int[] numbers = findNumbers(num1, num2);
		if (numbers[0] == 0) {
			System.out.println("There is no such number!");
		} else {
			for (int index = 0; index <= numbers.length - 1; index++) {
				if (numbers[index] == 0) {
					break;
				}
				System.out.println(numbers[index]);
			}
		}

	}
}
