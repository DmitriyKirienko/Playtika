package example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введи номер дня недели");
        while (true) {
            Scanner num = new Scanner(System.in);
            String n = num.nextLine();
            if ((!n.matches("^\\d*$"))) {
                System.out.println("Введи число от 1 до 7");
                continue;
            }
            else if (Integer.parseInt(n) >= 1 && Integer.parseInt(n) < 8) {
                switch (n) {
                    case "1":
                        System.out.println("Понедельник");
                        break;
                    case "2":
                        System.out.println("Вторник");
                        break;
                    case "3":
                        System.out.println("Среда");
                        break;
                    case "4":
                        System.out.println("Четверг");
                        break;
                    case "5":
                        System.out.println("Пятница");
                        break;
                    case "6":
                        System.out.println("Суббота");
                        break;
                    case "7":
                        System.out.println("Воскресенье");
                        break;
                }
                break;
            }
            else {
                System.out.println("Введи число от 1 до 7");
                continue;
            }
        }
    }
}






    /**while (true) {
        switch (num.nextInt()) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Введи номер от 1 до 7");
        }
    }*/
