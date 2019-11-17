package ru.htp.multidimensional.array.main;

public class Main23 {

//  23. Сформировать квадратную матрицу порядка N по правилу: A[i,j]=sin(i^2-j^2/N)
//	и подсчитать количество положительных элементов в ней. 

	public static void main(String[] args) {
		int a;
		a = 6;

		double[][] mas = new double[a][a];

		printMasNull(mas, a);

	}

	public static void printMasNull(double[][] mas, int a) {
		int count = 0;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {

				mas[i][j] = Math.sin((i * i - j * j) / a);
				if (mas[i][j] > 0) {
					count++;
				}

				System.out.printf("%5.1f", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println("Колличество положительных элементов в матрице = " + count);
	}

}
