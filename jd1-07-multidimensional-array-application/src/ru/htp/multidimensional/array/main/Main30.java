package ru.htp.multidimensional.array.main;

import java.util.Random;
import java.util.Stack;

public class Main30 {

//  30. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу 
//	и номера строк, в которых число 5 встречается три и более раз. 

	public static void main(String[] args) {
		int n;
		int m;
		int count;

		n = 10;
		m = 20;
		count = 0;

		int[][] mas = new int[n][m];

		randomNum(mas);
		printMas(mas);

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {

				if (mas[j][i] == 5)
					count++;
			}
			if (count >= 5)
				stack.push(i);
			count = 0;
		}
		System.out.println("--------------------------------------------");
		System.out.println("Строки в которых число 5 встречается более 3-х раз " + stack);

	}

	public static void randomNum(int[][] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(15);
			}
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
