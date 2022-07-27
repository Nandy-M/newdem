package longsubsequence;
import java.util.Scanner;
public class MaxSub {
	public static void main(String[] args) {
		int i, j, max = 0;
		int list[] = new int[100];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter array size:");
		int n = s.nextInt();
		int a[] = new int[100];
		System.out.println("Enter the array elements:");
		for (i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		System.out.println("Array elements are:");
		for (i = 0; i < n; i++) {
			System.out.print(a[i] + "\t");
		}
		for (i = 0; i < n; i++) {
			list[i] = 1;
		}
		for (i = 1; i < n; i++) {
			for (j = 0; j < i; j++) {
				if (a[i] > a[j] && list[i] < list[j] + 1) {
					list[i] = list[j] + 1;
				}
			}
		}
		for (i = 0; i < n; i++)
			if (max < list[i])
				max = list[i];
		System.out.println();
		System.out.println("The longest subsequence in array is " + max);
	}

}
