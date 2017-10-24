package example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Введи выражение");
	String str = in.nextLine();
	char stroka[] = str.toCharArray();
	for (int i = stroka.length - 1; i >=0; i--) {
		System.out.print(stroka[i]);
	}
	System.out.println();
	String[] strokanew = str.split(" ");
	for (int j = 0; j < strokanew.length; j++)
		System.out.println(strokanew[j]);
	System.out.println(str.replace(' ', '*'));
	System.out.println((str.toUpperCase()));
	if (stroka.length < 9) {
		System.out.println("Строка слишком короткая для отображения подстроки с 5 по 10ый символ");
	}
	else {
		for (int k = 4; k < 9; k++)
			System.out.print(stroka[k]);
	}




    }
}
