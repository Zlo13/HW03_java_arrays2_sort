package ru.htp.multidimensional.array.main;

import java.util.Random;
import java.util.Scanner;

public class Main28 {

//  28. Задана матрица неотрицательных чисел. Посчитать сумму элементов в 
//	каждом столбце. Определить, какой столбец содержит максимальную сумму.

	public static void main(String[] args) {

		int m;
		int n;

		n = enterNum("Укажите количество столбцов в массиве");
		m = enterNum("Укажите количество строк в массиве");

		int[][] mas = new int[m][n];

		randomNum(mas);
		printMas(mas);

		int[] mas1 = columnsSum(mas, n, m);
		// printMas1(mas1);

		maxColumns(mas1);

	}

	public static void maxColumns(int[] mas) {

		System.out.println();

		int max = 0;
		int b = 0;

		for (int i = 0; i < mas.length; i++) {
			if (max < mas[i]) {
				max = mas[i];
				b = i + 1;
			}
		}
		System.out.println();
		System.out.println("  " + b + "Cтолбец содержит максимальную сумму.");
	}

	public static int[] columnsSum(int[][] mas, int n, int m) {

		System.out.println();

		int[] mas1 = new int[n];
		int sum = 0;

		for (int j = 0; j < n; j++) {
			for (int i = 0; i < m; i++) {

				sum = sum + mas[i][j];

			}
			mas1[j] = sum;
			System.out.printf("%4d", sum);
			sum = 0;
		}
		return mas1;
	}

	public static int enterNum(String mesage) {
		int value;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(mesage);

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(mesage);
		}

		value = sc.nextInt();
		return value;

	}

	public static void randomNum(int[][] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(10);
			}
		}

	}

	public static void randomNum1(int[] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {

			mas[i] = rand.nextInt(10);

		}

	}

	public static void printMas(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("%4d", mas[i][j]);
			}
			System.out.println();
		}
	}

	public static void printMas1(int[] mas) {
		for (int i = 0; i < mas.length; i++) {

			System.out.printf("%4d", mas[i]);

			System.out.println();
		}
	}

}
