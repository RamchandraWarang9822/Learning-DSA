import java.util.Scanner;

public class Main {

	public void print(int[] arr) {

		System.out.println("Sorted Array: ");
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");

		}

	}

	public static void main(String[] args) {

		int[] arr;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter no. of elements: ");
		int size = sc.nextInt();

		arr = new int[size];

		System.out.print("Enter elements with spaces in between: ");
		for (int i = 0; i < size; i++) {

			arr[i] = sc.nextInt();

		}

		bubbleSort b = new bubbleSort(arr);
		sc.close();

	}
}
