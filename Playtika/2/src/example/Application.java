package example;

public class Application {

    public static void main(String[] args) {
        int[] results = new int[5];
        for (int i = 0; i < 5; i ++) {
            results[i] = (int) (1 + (Math.random()*5));
        }
        int lenght = results.length;
        double average = (double) (results[0] + results[1] +results[2] + results[3] + results[4]) / lenght;
        System.out.println("Average grade - " + average);
    }

}
