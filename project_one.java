import java.util.Scanner;
public class project_one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();
        sc.close();
        // compares two Integer values numerically
        int Result = Integer.compare(number1, number2);
        if (Result > 0) {
            System.out.println("number1 is greater than number2");
        } else if (Result < 0) {
            System.out.println("number1 is less than number2");
        } else {
            System.out.println("number1 is equal to number2");
        }
    }
}
