package ru.htp.multidimensional.array.main;

import java.util.Random;

public class Main7 {

//  7. Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных элементов. 

	public static void main(String[] args) {
		int[][] mas = new int[4][4];

		randomNum(mas);
		printMas(mas);
		
		sumNum(mas);

	}

	public static void sumNum(int[][] mas) {
		System.out.println();
		int a = 0;
		int b = 0;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				a = mas[i][j];
				a = Math.abs(a);
				if (a % 2 != 0) {
					b = b + a;
				}
			}
		}
		System.out.println("Cумму модулей отрицательных нечетных элементов = " + b);
	}

	public static void randomNum(int[][] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(10) * -1;
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
