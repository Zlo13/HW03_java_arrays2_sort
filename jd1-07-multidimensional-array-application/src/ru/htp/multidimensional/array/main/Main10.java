package ru.htp.multidimensional.array.main;

import java.util.Random;
import java.util.Scanner;

public class Main10 {

//  10. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

	public static void main(String[] args) {
		int k;
		int p;
		
		k = enterNum("Укажите номер строки");
		p = enterNum("Укажите номер столбца");

		int[][] mas = new int[4][5];

		randomNum(mas);
		printMas(mas);
		
		lineMas(mas, k);
		columMas(mas, p);

	}

	public static void lineMas(int[][] mas, int k) {
		System.out.println();
		int a;
		for (int i = 0; i < mas.length+1; i++) {
			a=mas[k-1][i];
		System.out.printf("%4d", a);
		}
		System.out.println();

	}

	public static void columMas(int[][] mas, int p) {
		System.out.println();
		int a;
		for (int i = 0; i < mas.length; i++) {
			a=mas[i][p-1];
		System.out.printf("%4d", a);
		System.out.println();
		}
		

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
				mas[i][j] = rand.nextInt(10);
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
