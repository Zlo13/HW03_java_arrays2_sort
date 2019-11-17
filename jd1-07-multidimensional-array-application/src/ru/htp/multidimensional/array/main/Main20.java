package ru.htp.multidimensional.array.main;

public class Main20 {

// 20. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): 

	public static void main(String[] args) {
		int a;
		a = 6;

		int[][] mas = new int[a][a];

		printMasNull(mas);

	}

	public static void printMasNull(int[][] mas) {
		boolean a = true;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {

				a = (j >= i && j + i < mas[i].length) || (j < i && j + i >= mas[i].length - 1);

				if (a == true) {
					mas[i][j] = 0;
				} else {
					mas[i][j] = 1;
				}
				if (i == j) {
					mas[i][j] = 1;
				}
			}
		}
		for (int i = 0; i < mas[0].length; i++) {
			for (int j = 0; j < mas[0].length; j++) {
				System.out.printf("%3d", mas[i][j]);
			}
			System.out.println();
		}
	}

}
