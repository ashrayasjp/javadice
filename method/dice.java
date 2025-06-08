import java.util.Random;
import java.util.Scanner;

public class dice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter the number of dice");
        int n = scan.nextInt();
        int roll;
        int c = 1;
        int sum = 0;
        scan.close();

        if (n > 0) {

            for (int i = 0; i < n; i++) {

                roll = random.nextInt(1, 7);
                art(roll);
                System.out.println("Roll Result " + c + ": " + roll);
                c++;
                sum += roll;

            }
            System.out.println("The total count is " + sum);
        } else {
            System.out.println("Invalid number");
        }
    }

    static void art(int roll) {
        String dice1 = """
                       _______________
                      |               |
                      |               |
                      |               |
                      |       .       |
                      |               |
                      |               |
                      |_______________|
                """;
        String dice2 = """
                       _______________
                      |               |
                      |               |
                      |               |
                      |      ..       |
                      |               |
                      |               |
                      |_______________|
                """;
        String dice3 = """
                       _______________
                      |               |
                      |               |
                      |               |
                      |      ...      |
                      |               |
                      |               |
                      |_______________|
                """;
        String dice4 = """
                       _______________
                      |               |
                      |               |
                      |               |
                      |      . .      |
                      |      . .      |
                      |               |
                      |_______________|
                """;
        String dice5 = """
                       _______________
                      |               |
                      |               |
                      |      . .      |
                      |       .       |
                      |      . .      |
                      |               |
                      |_______________|
                """;

        String dice6 = """
                       _______________
                      |               |
                      |               |
                      |               |
                      |     . . .     |
                      |     . . .     |
                      |               |
                      |_______________|
                """;
        switch (roll) {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid");
        }
    }
}
