package by.playtika;

import java.util.Scanner;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введи выражение, например '2+2'");
            String expression = scanner.nextLine();

        Double result = 0.0;
        Input i = new Input();
        Calculations calc = new Calculations();
        Matcher matcher = i.get(expression);

        if (matcher.find()) {
            String one = matcher.group(1);
            String two = matcher.group(3);
            char operator = matcher.group(2).charAt(0);
            result = calc.action(Double.parseDouble(one), Double.parseDouble(two), operator);
            System.out.println(result);
        }
        else {
            System.out.println("Неверно введен пример");
        }
        } while (true);
    }
}
