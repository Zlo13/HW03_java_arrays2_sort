package ru.htp.multidimensional.array.main;

import java.util.Random;

public class Main2 {

// 2. Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из [0, 9].

	public static void main(String[] args) {

		int[][] mas = new int[2][3];

		randomNum(mas);
		printMas(mas);

	}

	public static void randomNum(int[][] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(10);
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
