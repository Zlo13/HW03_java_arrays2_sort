package ru.htp.multidimensional.array.main;

import java.util.Random;
import java.util.Scanner;

public class Main8 {

//  8. Дан двухмерный массив n×m элементов. Определить, сколько раз встречается число 7 среди элементов массива. 

	public static void main(String[] args) {
		int n;
		int m;
		
		n = enterNum("Укажите количество строк в массиве");
		m = enterNum("Укажите количество столбцов в массиве");
		
		int[][] mas = new int[n][m];

		randomNum(mas);
		printMas(mas);

		findeSeven(mas);

	}

	public static void findeSeven(int[][] mas) {
		int a = 0;
		int b = 0;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				a = mas[i][j];
				if (a == 7) {
					b++;
				}
			}

		}
		System.out.println("   -------------------------------------------");
		System.out.println("   В массиве число 7 встречается " + b + " раз");
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

	public static void printMas(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("%4d", mas[i][j]);
			}
			System.out.println();
		}
	}

}
