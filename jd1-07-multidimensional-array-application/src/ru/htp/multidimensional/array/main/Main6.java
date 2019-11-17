package ru.htp.multidimensional.array.main;

import java.util.Random;

public class Main6 {

//  6. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего. 

	public static void main(String[] args) {
		int[][] mas = new int[6][5];

		randomNum(mas);
		printMas(mas);

		printColumn(mas);

	}

	public static void printColumn(int[][] mas) {
		System.out.println();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (j % 2 == 0) {
					if (mas[0][j] > mas[mas[i].length][j]) {
						System.out.printf("%4d", mas[i][j]);
					}
				}
			}
			System.out.println();
		}
	}

	public static void randomNum(int[][] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(100);
			}
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

}
