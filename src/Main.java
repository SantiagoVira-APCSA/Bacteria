import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many bacteria will you start with? ");
        int starting_bacteria = input.nextInt();
        System.out.print("How many hours will the bacteria sit? ");
        int hours = input.nextInt();
        long bacteria = numBacteriaAlive(hours, starting_bacteria);
        System.out.println("After " + hours + ", there will be " + bacteria + " bacteria");
    }

    public static long numBacteriaAlive(int hour, int initial) {
        // WRITE THIS METHOD to use RECURSION to find the number of bacteria!
        if (hour <= 0) return initial;
        return numBacteriaAlive(hour - 1, initial) * 3;
    }
}
