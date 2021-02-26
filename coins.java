import java.util.Scanner;
public class coins {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter amount in cents: ");
        int cents = read.nextInt();

        int quarters = cents/25;
        int dimes = cents%25/10;
        int nickels = dimes%25%10/5;
        int nickelsLeft = cents%5;

        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + nickelsLeft);
    }
}
