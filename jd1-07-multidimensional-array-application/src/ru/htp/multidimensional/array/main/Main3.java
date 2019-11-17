package ru.htp.multidimensional.array.main;

import java.util.Random;

public class Main3 {

// 3. Дана матрица. Вывести на экран первый и последний столбцы.

	public static void main(String[] args) {
		int[][] mas = new int[5][5];

		randomNum(mas);
		printMas(mas);
		
		System.out.println();

		printFirstLastColumn(mas);

	}

	public static void printFirstLastColumn(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				
				if (j == 0)  {
					System.out.printf("%4d", mas[i][j]);
				}
				if (j == (mas[i].length - 1)) {
					System.out.printf("%16d", mas[i][j]);
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
