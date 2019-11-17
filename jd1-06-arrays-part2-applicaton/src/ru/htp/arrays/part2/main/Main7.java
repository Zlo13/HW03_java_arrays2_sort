package ru.htp.arrays.part2.main;

public class Main7 {

// 7. Пусть даны две неубывающие последовательности действительных чисел. Требуется указать те места, 
//	на которые нужно вставлять элементы последовательности в первую последовательность 
//	так, чтобы новая последовательность оставалась возрастающей*/

	public static void main(String[] args) {

		int[] a = new int[] { 1, 3, 5, 7, 9 };
		int[] b = new int[] { 2, 4, 6, 8, 10 };
		int[] c = new int[a.length + b.length];

		for (int i = 0; i < a.length; ++i) {
			c[i] = a[i];
		}

		for (int i = 0, j = a.length; i < b.length; ++i, j++) {
			c[j] = b[i];
		}

		printMas(c);

		for (int i = c.length - 1; i > 0; --i) {
			for (int j = 0; j < i; ++j) {
				if (c[j] > c[j + 1]) {
					int buf = c[j];
					c[j] = c[j + 1];
					c[j + 1] = buf;
				}
			}
		}

		printMas(c);

		System.out.print("Positions: ");

		for (int i = 0; i < c.length; ++i) {
			for (int j = 0; j < b.length; ++j) {
				if (c[i] == b[j])
					System.out.print(i + " ");
			}
		}
	}

	public static void printMas(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("%4d", mas[i]);
		}
		System.out.println();
		System.out.println("  --------------------------------------");
	}

}
