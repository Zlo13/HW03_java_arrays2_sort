package ru.htp.multidimensional.array.main;

public class Main15 {

//  16. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): 

	public static void main(String[] args) {
		int a;
		a = 7;

		int[][] mas = new int[a][a];

		printMasNull(mas);

	}

	public static void printMasNull(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == j) {
					mas[i][j] = (j + 1) * (j + 2);
				}
				System.out.printf("%3d", mas[i][j]);
			}
			System.out.println();
		}
	}

}
