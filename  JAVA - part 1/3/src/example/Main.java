package example;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Введи размер стороны ромба");
		Scanner num = new Scanner(System.in);
		int n = num.nextInt();
		int d = n + (n - 2); // Находим диагональ ромба
		int p = n - 1; // Находим половину диагонали
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= d; j++) {
				if (j == (p - i) || j == (p + i))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		for (int i = n; i <= d; i++) {
			for (int j = 0; j <= d; j++) {
				if (j == (i - p) || j == d - (i - p))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
