public class PizzaOrder {
    public static void main(String[] args) {
        Pizza AlaPizza = new Pizza("Large", "Red Sauce", 3, "chicken", "jalapenos");
        System.out.println("You would like a " + AlaPizza.size + " pizza, " + AlaPizza.howMany + " of them, with " + AlaPizza.sauceType + ", " + AlaPizza.meatType + ", and " + AlaPizza.veggieType + ". That will be ready in 20 minutes see you then.");
    }
}
