public class DiceRoller {
    public static void main(String[] args) {
        System.out.println("-Dice Roller-");
        double a = Math.round(Math.random() * (6 - 1 +1) + 1);
        double b = Math.round(Math.random() * (6 - 1 +1) + 1);
        double c = a+b;
        System.out.println("The first die is " + a);
        System.out.println("The second die is " + b);
        System.out.println("Total Roll: " + c);


    }
}
