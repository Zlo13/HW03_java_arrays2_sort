package ru.htp.arrays.part2.main;

import java.util.Random;

public class Main8 {

//	8. Составить программу, которая приводит эти дроби к общему
//	знаменателю и упорядочивает их в порядке возрастания

	public static void main(String[] args) {

		Random random = new Random(10);

		int masLenght = 15;
		int[] p = new int[masLenght];
		int[] q = new int[masLenght];

		for (int i = 0; i < p.length; ++i) {

			p[i] = random.nextInt(20);
			q[i] = random.nextInt(20);

		}

		printMas(p);
		printMas(q);

		System.out.println();

		for (int i = p.length - 1; i > 0; i--)
			for (int j = 0; j < i; j++) {

				if ((p[j] * q[j + 1] - p[j + 1] * q[j]) > 0) {
					int tmpP = p[j];
					int tmpQ = q[j];

					p[j] = p[j + 1];
					p[j + 1] = tmpP;
					q[j] = q[j + 1];
					q[j + 1] = tmpQ;
				}
			}

		printMas(p);
		printMas(q);

		int x = q[0], y = q[1];

		while (x != y) {
			if (x > y) {
				x = x - y;
			} else {
				y = y - x;
			}

		}
		int nd = x;
		int nk = (q[0] / nd) * q[1];

		for (int i = 2; i < masLenght; ++i) {
			x = q[i];
			y = nk;
			while (x != y) {
				if (x > y) {
					x = x - y;
				} else {
					y = y - x;
				}
			}

			nd = x;
			nk = (q[i] / nd) * nk;

		}

		for (int i = 0; i < masLenght; ++i) {
			int d = nk / q[i];
			p[i] = p[i] * d;
			q[i] = nk;

		}

		System.out.println();

		printMas(p);
		printMas(q);

	}

	public static void printMas(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("%4d", mas[i]);
		}
		System.out.println();
		System.out.println("  ----------------------------------------------------------");
	}
}
