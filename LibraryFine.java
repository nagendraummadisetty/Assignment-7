import java.util.Scanner;

public class LibraryFine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of days the member is late: ");
        int daysLate = input.nextInt();
        if (daysLate <= 7) {
            System.out.println("Your fine is 50 paise.");
        } else if (daysLate <= 14) {
            System.out.println("Your fine is one rupee.");
        } else if (daysLate <= 21) {
            System.out.println("Your fine is five rupees.");
        } else {
            System.out.println("Your membership has been cancelled.");
        }
    }
}
