package ru.htp.multidimensional.array.main;

public class Main21 {

//  21. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): 

	public static void main(String[] args) {
		int a;
		a = 8;

		int[][] mas = new int[a][a];

		printMasNull(mas);

	}

	public static void printMasNull(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j <= i; j++) {
				mas[i][j] = (mas[i].length - i)+j;
				if (mas[i][j] == mas.length/2) {
					mas[i][j]=mas.length/2;
				}
			}
		}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("%3d", mas[i][j]);
			}
			System.out.println();
		}
	}
}
