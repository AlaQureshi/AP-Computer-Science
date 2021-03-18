public class MyCar {
    String carName;
    String carType;
    String color;
    public MyCar(String cn,String ct, String cr){
        carName = cn;
        carType = ct;
        color = cr;
    }
    public void NewCar(){
        System.out.println("That is my new car!!");
    }

    public static void main(String[] args) {
        MyCar nissan = new MyCar("Nissan Versa", "Hatchback", "White");
        nissan.NewCar();
    }
}
