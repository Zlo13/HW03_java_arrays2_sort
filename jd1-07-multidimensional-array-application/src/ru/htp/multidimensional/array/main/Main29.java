package ru.htp.multidimensional.array.main;

import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class Main29 {

// 29. Найти положительные элементы главной диагонали квадратной матрицы. 

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();

		int n;

		n = enterNum("Укажите размер квадратной матрицы:");

		int[][] mas = new int[n][n];

		randomNum(mas);
		printMas(mas);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j && mas[i][j] > 0)

					stack.push(mas[i][j]);
			}
		}
		System.out.println("--------------------------------------------");
		System.out.println("Положительные элементы диагонали = " + stack);
	}

	public static int enterNum(String mesage) {
		int value;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(mesage);

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(mesage);
		}

		value = sc.nextInt();
		return value;

	}

	public static void randomNum(int[][] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = -10 + rand.nextInt(20);
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
