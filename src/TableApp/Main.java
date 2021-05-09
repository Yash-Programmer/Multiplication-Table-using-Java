package TableApp;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter: ");
        int number = scan.nextInt();

        System.out.println("\n" + "This is the table of " + number + "\n");

        for (int i = 1; i<=10; i++) {
            System.out.println(number + " x " + i + " = " + number*i);
        }
    }
}
