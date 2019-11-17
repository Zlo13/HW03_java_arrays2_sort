package ru.htp.multidimensional.array.main;

import java.util.Random;

public class Main5 {

//  5. Дана матрица. Вывести на экран все четные строки, то есть с четными номерами.

	public static void main(String[] args) {

		int[][] mas = new int[6][5];

		randomNum(mas);
		printMas(mas);

		printEvenLine(mas);

	}

	public static void printEvenLine(int[][] mas) {

		System.out.println();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i % 2 != 0) {
					System.out.printf("%4d", mas[i][j]);
				}
			}
			System.out.print("\n");
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
