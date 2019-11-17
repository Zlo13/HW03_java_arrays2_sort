package ru.htp.multidimensional.array.main;

public class Main13 {

//  13. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): 

	public static void main(String[] args) {
		int a;
		a = 6;

		int[][] mas = new int[a][a];

		printMasNull(mas);

	}

	public static void printMasNull(int[][] mas) {
		int a = 1;
		int b = 1;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i % 2 == 0) {
					a = j + 1;
					System.out.printf("%3d", a);
				} else {
					b = mas.length - j;
					System.out.printf("%3d", b);
				}

			}
			System.out.println();
		}
	}

}
