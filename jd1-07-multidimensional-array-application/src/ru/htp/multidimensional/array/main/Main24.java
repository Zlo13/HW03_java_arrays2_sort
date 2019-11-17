package ru.htp.multidimensional.array.main;

import java.util.Random;

public class Main24 {

// 24. Дан линейный массив x1, x2,..., xn−1, xn. Получить действительную квадратную матрицу порядка n: 

	public static void main(String[] args) {

		double[] mas = new double[5];
		
		randomNum(mas);

		double[][] mas1 = new double[mas.length][mas.length];

		int k = 1;

		for (int i = 0; i < mas1.length; i++) {
			for (int j = 0; j < mas1[i].length; j++) {
				mas1[i][j] = Math.pow(mas[j], k);
			}
			k++;
		}

		for (int i = 0; i < mas1.length; i++) {
			for (int j = 0; j < mas1[i].length; j++) {
				System.out.printf("%8.1f", mas1[i][j]);
			}
			System.out.println();

		}

	}

	public static void randomNum(double [] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(10);

		}

	}

}
