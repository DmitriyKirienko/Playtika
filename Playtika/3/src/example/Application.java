package example;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        boolean isTrue = true;
        while (isTrue) {
            Scanner str = new Scanner(System.in);
            String chislo1;
            System.out.println("Vvedi pervoe chislo");
            chislo1 = str.nextLine();
            if (chislo1.equals("quit"))
                break;
            else if (!chislo1.matches("^\\d*$")) {
                System.out.println("Ne verno vvedeno chislo");
                continue;
            }
            String chislo2;
            System.out.println("Vvedi vtoroe chislo");
            chislo2 = str.nextLine();
            if (chislo2.equals("quit"))
                break;
            else if (!chislo2.matches("^\\d*$")) {
                System.out.println("Ne verno vvedeno chislo. Nachnite zanovo");
                continue;
            }
            String znak;
            System.out.println("Vvedi znak");
            znak = str.nextLine();
            if (znak.equals("quit"))
                break;
            else if (!znak.matches("[+\\-/*]")) {
                System.out.println("Znak vveden neverno. Nachnite zanovo");
                continue;
            }
            double result = 0;
            switch (znak) {
                case "-":
                    result = Double.parseDouble(chislo1) - Double.parseDouble(chislo2);
                    break;
                case "+":
                    result = Double.parseDouble(chislo1) + Double.parseDouble(chislo2);
                    break;
                case "*":
                    result = Double.parseDouble(chislo1) * Double.parseDouble(chislo2);
                    break;
                case "/":
                    result = Double.parseDouble(chislo1) / Double.parseDouble(chislo2);
                    break;
            }
            System.out.println("Otvet raven :" + result);
        }
    }
}