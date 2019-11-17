package ru.htp.multidimensional.array.main;

public class Main17 {

//  17. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): 

	public static void main(String[] args) {
		int a;
		a = 6;

		int[][] mas = new int[a][a];

		printMasNull(mas);

	}

	public static void printMasNull(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == 0 || i == mas.length - 1) {
					mas[i][j] = 1;
				} else if (j == 0 || j == mas.length - 1) {
					mas[i][j] = 1;
				}
				System.out.printf("%3d", mas[i][j]);
			}
			System.out.println();
		}
	}

}
