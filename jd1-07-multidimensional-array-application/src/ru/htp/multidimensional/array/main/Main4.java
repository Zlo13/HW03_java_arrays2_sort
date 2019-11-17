package ru.htp.multidimensional.array.main;

import java.util.Random;

public class Main4 {

//  4. Дана матрица. Вывести на экран первую и последнюю строки. 

	public static void main(String[] args) {

		int[][] mas = new int[5][6];

		randomNum(mas);
		printMas(mas);

		printFirstLine(mas);
		printLastLine(mas);

	}

	public static void printFirstLine(int[][] mas) {

		System.out.println();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == 0) {
					System.out.printf("%4d", mas[i][j]);
				}

			}

		}

	}

	public static void printLastLine(int[][] mas) {

		System.out.println();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == (mas[i].length - 2)) {
					System.out.printf("%4d", mas[i][j]);
				}

			}

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
