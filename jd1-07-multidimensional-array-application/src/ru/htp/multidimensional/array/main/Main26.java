package ru.htp.multidimensional.array.main;

import java.util.Random;
import java.util.Scanner;

public class Main26 {

//  26. С клавиатуры вводится двумерный массив чисел размерностью nxm. 
//	Выполнить с массивом следующие действия:  
//		а) вычислить сумму отрицательных элементов в каждой строке;  
//		б) определить максимальный элемент в каждой строке;  
//		в) переставить местами максимальный и минимальный элементы матрицы. 

	public static void main(String[] args) {
		int n;
		int m;

		n = enterNum("Укажите количество строк в массиве");
		m = enterNum("Укажите количество столбцов в массиве");

		int[][] mas = new int[n][m];

		randomNum(mas);
		printMas(mas);

		findeSumNegativeNum(mas);
		findeMax(mas);
		changeMaxMin(mas);

		printMas(mas);

	}

	public static void findeMax(int[][] mas) {

		System.out.println("   -----------------------------------------------------");

		int a = 0;
		int count = 0;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {

				if (mas[i][j] > a) {
					a = mas[i][j];
				}
			}
			count++;
			System.out.println("   Максимальный элемент в строке " + count + " = " + a);
			a = 0;
		}
	}

	public static void changeMaxMin(int[][] mas) {

		System.out.println("   -----------------------------------------------------");

		int max = 0;
		int aI = 0;
		int aJ = 0;

		int min = 0;
		int bI = 0;
		int bJ = 0;

		int temp = 0;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {

				if (mas[i][j] > max) {
					max = mas[i][j];
					aI = i;
					aJ = j;

				}
				if (mas[i][j] < min) {
					min = mas[i][j];
					bI = i;
					bJ = j;
				}
			}

			temp = min;
			mas[bI][bJ] = max;
			mas[aI][aJ] = temp;

			max = 0;
			min = 0;

		}

	}

	public static void findeSumNegativeNum(int[][] mas) {
		int a = 0;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] < 0) {
					a = a + mas[i][j];
				}
			}
		}
		System.out.println("   -----------------------------------------------------");
		System.out.println("   Cуммa отрицательных элементов в каждой строке = " + a);
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
