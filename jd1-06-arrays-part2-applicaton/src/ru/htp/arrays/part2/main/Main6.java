package ru.htp.arrays.part2.main;

import java.util.Random;

public class Main6 {

//  6. Сортировка Шелла.

	public static void main(String[] args) {
		Random random = new Random();

		int masLenght = 10;
		int[] mas = new int[masLenght];

		for (int i = 0; i < mas.length; ++i) {
			mas[i] = random.nextInt(20);
			System.out.printf("%4d", mas[i]);
		}

		System.out.println();
		System.out.println();

		int k = 0;

		for (int j = masLenght / 2; j > 0; j = j / 2)
			for (int i = j; i < masLenght; i++) {

				int tmp = mas[i];

				for (k = i; k >= j; k -= j) {
					if (tmp < mas[k - j]) {
						mas[k] = mas[k - j];
					} else {
						break;
					}
				}
				mas[k] = tmp;
			}
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("%4d", mas[i]);
		}
	}

}
