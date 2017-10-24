package example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] names = new String[]{ "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };
        int[] time = new int[] { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 };
        int k;
        String l;
        for (int i = 0; i < time.length; i++) {
            for (int j = i + 1; j < time.length; j++)
                if (time[j] < time[i]) {
                    k = time[i];
                    time[i] = time[j];
                    time[j] = k;
                    l = names[i];
                    names[i] = names[j];
                    names[j] = l;
                }
            System.out.println(names[i] + " " + time[i]);
        }
        System.out.println("Vvedi mesto beguna:");
        Scanner place = new Scanner(System.in);
        int num = place.nextInt() - 1;
        System.out.println(names[num] + " " + time[num]);
        System.out.println("Vtoroe mesto-" + names[1] + time[1]);
        System.out.println("Pervoe mesto-" + names[0] + time[0]);

    }
}
