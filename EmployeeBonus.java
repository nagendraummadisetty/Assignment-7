import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the current year: ");
        int currentYear = input.nextInt();
        System.out.print("Enter the year the employee joined: ");
        int joinYear = input.nextInt();
        int serviceYears = currentYear - joinYear;
        if (serviceYears > 5) {
            System.out.println("Bonus of Rs. 5000/- awarded.");
        } else if (serviceYears >= 3 && serviceYears <= 5) {
            System.out.println("Bonus of Rs. 3000/- awarded.");
        } else {
            System.out.println("No bonus awarded.");
        }
    }
}