package ru.htp.multidimensional.array.main;

public class Main18 {

//  18. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): 

	public static void main(String[] args) {
		int a;
		a = 6;

		int[][] mas = new int[a][a];

		printMasNull(mas);

	}

	public static void printMasNull(int[][] mas) {
		int a = 0;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == a && j < mas.length - a) {
					mas[i][j] = 1 + a;
				}
				System.out.printf("%3d", mas[i][j]);
			}
			a = a + 1;
			System.out.println();
		}
	}

}
