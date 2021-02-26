import java.util.Scanner;

public class FoodOrder {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Please enter the number of burgers: ");
        double burgers = read.nextDouble();

        System.out.println("Please enter the number of fries: ");
        double fries = read.nextDouble();

        System.out.println("Please enter the number of sodas you would like: ");
        double sodas = read.nextDouble();


        System.out.println("Please choose a tip amount: 0, .10, .15, .20");
        double tip = read.nextDouble();


        double burgerAmt = burgers * 1.69;
        double friesAmt = fries * 1.09;
        double sodaAmt = sodas * 0.99;

        double subtotal = burgerAmt + friesAmt + sodaAmt;
        double tipAmt = subtotal * tip;
        double tax = subtotal * .7;
        double total = subtotal + tipAmt + tax;
        System.out.println("Your total is: $" + Math.round(total*100)/100);
    }
}
