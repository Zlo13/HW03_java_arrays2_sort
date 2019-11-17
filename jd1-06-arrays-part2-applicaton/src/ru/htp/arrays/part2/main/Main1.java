package ru.htp.arrays.part2.main;

public class Main1 {

// 1. Заданы два одномерных массива с различным количеством элементов и натуральное 
//	число k. Объединить их в один массив, включив второй массив между k-м и (k+1) - м 
//	элементами первого, при этом не используя дополнительный массив. 

	public static void main(String[] args) {

		int[] mas1 = { 5, 3, 9, 11, 2, 10 };
		int[] mas2 = { 1, 2, 6, 6, 8 };

		int mas1_new_length = mas1.length + mas2.length;
		int[] mas3 = new int[mas1_new_length];

		int j = 0;

		for (int i = 0; i < mas3.length; i++) {
			int k = 3;

			if (i < k) {
				mas3[i] = mas1[i];
			} else {
				while (j < mas2.length) {
					mas3[i] = mas2[j];
					j++;
					i++;

				}
				mas3[i] = mas1[i - mas2.length];
			}

		}
		for (int i = 0; i < mas3.length; i++) {

			System.out.printf("%4d", mas3[i]);
		}
	}
}
