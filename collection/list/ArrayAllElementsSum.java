package java_codes.collection.list;

public class ArrayAllElementsSum {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };

		int sum = 0;
		for (int i : array)
			sum += i;
		System.out.println(sum);
	}
}
