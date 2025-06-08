import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your  age:");
        int age = scanner.nextInt();
        ageCheck(age);
        scanner.close();
    }

    static void ageCheck(int a) {
        if (a > 18) {
            System.out.println("Vote");
        } else {
            System.out.println("Cant vote");
        }
    }
}
