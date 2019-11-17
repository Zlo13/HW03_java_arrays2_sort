package ru.htp.arrays.part2.main;

import java.util.Random;

public class Main11 {

//	11. «Хитрая» сортировка. 

	public static void main(String[] args) {

		Random random = new Random();

		int n = 15;

		int[] a = new int[n];

		int[] exit = new int[n];

		for (int i = 0; i < a.length; ++i) {

			a[i] = random.nextInt(20);

			System.out.printf("%4d", a[i]);

		}

		System.out.println();
		System.out.println("  ----------------------------------------------------------");
		sort(a, exit);

		for (int i = 0; i < exit.length; ++i) {

			System.out.printf("%4d", a[i]);

		}
	}

	static void sort(int[] a, int[] exit) {

		int amax, imax, t = 0;
		amax = a[0];
		exit[0] = amax;

		for (int i = 0; i < a.length; ++i) {
			imax = i;

			for (int j = i + 1; j < a.length; ++j) {
				if (a[j] > amax) {
					++t;
					exit[t] = a[j];
					a[imax] = -1;
					amax = a[j];
					imax = j;
					a[imax] = -1;
				}
			}
		}

		for (int i = 0; i < a.length; ++i) {

			if (a[i] != -1) {
				++t;
				exit[t] = a[i];
				a[i] = -1;
			}
		}
		for (int i = 0; i < a.length - t; ++i) {
			for (t = i + t; t > 0; --t) {

				if (exit[t] < exit[t - 1]) {
					int buf = exit[t];
					exit[t] = exit[t - 1];
					exit[t - 1] = buf;
				}
			}
		}
	}
}
