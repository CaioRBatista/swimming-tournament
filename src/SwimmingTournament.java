import java.util.Scanner;

public class SwimmingTournament {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your name: ");
        String name = sc.next();
        System.out.println("Write your age: ");
        int age = sc.nextInt();
        if (age <= 10) {
            System.out.println((name) + " Will participate in the Children's category. ");
        } else if (age >= 11 && age <= 15) {
            System.out.println((name) + " Will participate in the Juvenile category. ");
        } else if (age >= 16 && age <= 19) {
            System.out.println((name) + " Will participate in the Pre-Adult category. ");
        } else {
            System.out.println((name) + " Will participate in the Adult category. ");
        }
    }
}
