package ru.htp.multidimensional.array.main;

public class Main25 {

// 25. Получить квадратную матрицу порядка n: 

	public static void main(String[] args) {
		int a;
		a = 6;

		int[][] mas = new int[a][a];

		printMasNull(mas);

	}

	public static void printMasNull(int[][] mas) {
		int k = 1;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[0].length; j++) {
				mas[i][j] = k;
				k++;
			}
		}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[0].length; j++) {
				System.out.printf("%4d", mas[i][j]);
			}
			System.out.println();
		}
	}
}
