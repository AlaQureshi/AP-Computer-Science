public class Pizza {
    String size;
    String sauceType;
    int howMany;
    String meatType;
    String veggieType;
    public Pizza(String sz, String st, int hm, String mt, String vt){
        size = sz;
        sauceType = st;
        howMany = hm;
        meatType = mt;
        veggieType = vt;
    }
    public void mmm(){
        System.out.println("That pizza looks great!");
    }
    public static void main(String[] args) {
        Pizza AlaPizza = new Pizza("Large", "Red Sauce", 3, "chicken", "jalapenos");
        AlaPizza.mmm();
    }
}
