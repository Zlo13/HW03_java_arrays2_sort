package ru.htp.arrays.part2.main;

import java.util.Random;

public class Main10 {

// 10. Сортировка подсчетом. 

	public static void main(String[] args) {

		Random random = new Random();

		int n = 15;
		int[] a = new int[n];

		for (int i = 0; i < a.length; ++i) {
			a[i] = random.nextInt(20);
			System.out.printf("%4d", a[i]);
		}

		System.out.println();
		System.out.println("  ----------------------------------------------------------");
		sort(a);

		for (int i = 0; i < a.length; ++i) {
			System.out.printf("%4d", a[i]);
		}
	}

	public static void sort(int mas[]) {

		int n = mas.length;
		int output[] = new int[n];
		int count[] = new int[256];

		for (int i = 0; i < 256; ++i) {
			count[i] = 0;
		}

		for (int i = 0; i < n; ++i) {
			++count[mas[i]];
		}

		for (int i = 1; i <= 255; ++i) {
			count[i] += count[i - 1];
		}

		for (int i = n - 1; i >= 0; i--) {
			output[count[mas[i]] - 1] = mas[i];
			--count[mas[i]];
		}
		for (int i = 0; i < n; ++i) {
			mas[i] = output[i];
		}
	}
}
