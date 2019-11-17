package ru.htp.arrays.part2.main;

import java.util.Random;

public class Main9 {

// 9. Алгоритм фон Неймана.

	public static void main(String[] args) {

		Random random = new Random();

		int masLenght = 15;
		int[] a = new int[masLenght];

		for (int i = 0; i < a.length; ++i) {
			a[i] = random.nextInt(20);
			System.out.printf("%4d", a[i]);

		}

		System.out.println();
		System.out.println("  ----------------------------------------------------------");

		sortMas(a, 0, a.length - 1);

		for (int i = 0; i < a.length; ++i) {
			System.out.printf("%4d", a[i]);

		}
	}

	public static void sortMas(int mas[], int l, int r) {

		if (l < r) {
			int m = (l + r) / 2;

			sortMas(mas, l, m);
			sortMas(mas, m + 1, r);

			merge(mas, l, m, r);
		}
	}

	public static void merge(int arr[], int l, int m, int r) {

		int n1 = m - l + 1;
		int n2 = r - m;

		int L[] = new int[n1];
		int R[] = new int[n2];

		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];

		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		int i = 0, j = 0;
		int k = l;

		while (i < n1 && j < n2) {

			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {

				arr[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}
}
