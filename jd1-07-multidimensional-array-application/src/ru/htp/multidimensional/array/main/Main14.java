package ru.htp.multidimensional.array.main;

public class Main14 {

//  14. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

	public static void main(String[] args) {
		int a;
		a = 6;

		int[][] mas = new int[a][a];

		printMasNull(mas);

	}

	public static void printMasNull(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == j) {
					mas[i][j] = mas.length - j;
				}
				System.out.printf("%3d", mas[i][j]);
			}
			System.out.println();
		}
	}
}
