package ru.htp.multidimensional.array.main;

public class Main12 {

//  12. Получить квадратную матрицу порядка n: 

	public static void main(String[] args) {

		int[][] mas = new int[6][6];

		printMas(mas);

		System.out.println();

		printMasTask(mas);

	}

	public static void printMasTask(int[][] mas) {
		int j = 0;

		for (int i = 0; i < mas.length; i++) {
			for (j = 0; j < mas[i].length; j++) {

				if (i == j)
					mas[i][j] = i;
				System.out.printf("%4d", mas[i][j]);
			}
			System.out.println();
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
