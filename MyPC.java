public class MyPC {
    int cost;
    String GPU;
    String CPU;
    public MyPC(int ct, String g, String c){
        cost = ct;
        GPU = g;
        CPU = c;
    }
    public void setup(){
        System.out.println("My PC is amazing!");
    }

    public static void main(String[] args) {
        MyPC aorus = new MyPC(1000, "RTX 2060", "Ryzen 2600");
        aorus.setup();
    }
}
