public class DiceRoller {
    public static void main(String[] args) {
        System.out.println("-Dice Roller-");
        System.out.println("The first die is " + Math.round(Math.random() * (6 - 1 +1) + 1));
        System.out.println("The second die is " + Math.round(Math.random() * (6 - 1 +1) + 1));
    }
}
