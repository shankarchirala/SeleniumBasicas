package assignments;

public class FindingSecondHigh {

	public static void main(String[] args) {

		int arr[] = { 9, 6, 3, 8, 5, 3 };
		int max = Integer.MIN_VALUE;
		int secondmax = Integer.MIN_VALUE;
		System.out.println(max);
		System.out.println(secondmax);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				secondmax = max;
				max = arr[i];
			} else if (arr[i] > secondmax) {
				secondmax = arr[i];
			}
		}
		System.out.println(secondmax);
	}

}
