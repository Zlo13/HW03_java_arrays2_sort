package ru.htp.arrays.part2.main;

import java.util.Random;

public class Main4 {
	
//  4. Сортировка обменами. Дана последовательность чисел a1<=a2<=..<=an.Требуется переставить 
//	числа в порядке возрастания. Для этого сравниваются два соседних числа ai и ai+1 . Если ai > ai+1, 
//	то делается перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в 
//	порядке возрастания. Составить алгоритм сортировки, подсчитывая при этом количества перестановок.

	public static void main(String[] args) {
		int[] mas = masСreation(10);

		randomMasElement(mas, 100);
		printMas(mas);

		masSortExchange(mas);
		printMas(mas);

	}
	public static void masSortExchange(int[] mas) {

		boolean isSorted = false;
		int temp;
		int count = 0;
		
		while (!isSorted) {
			isSorted = true;

			for (int i = 0; i < mas.length - 1; i++) {
				if (mas[i] > mas[i + 1]) {
					isSorted = false;
					count++;
					temp = mas[i];
					mas[i] = mas[i + 1];
					mas[i + 1] = temp;
				}
			}
		}
		System.out.println("Количество перестановок = " + count);
		System.out.println();
	}
	public static void randomMasElement(int[] mas, int a) {
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(a);
		}
	}

	public static int[] masСreation(int i) {
		int[] mas = new int[i];
		return mas;
	}

	public static void printMas(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("%4d", mas[i]);
		}
		System.out.println();
		System.out.println("  --------------------------------------");
	}
}
