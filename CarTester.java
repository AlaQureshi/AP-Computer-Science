public class CarTester {
    public static void main(String[] args) {
        Car bmwCar = new Car("BMW", "Vroom", 456, 45000);
        System.out.println(bmwCar.make  + ", " + bmwCar.miles + ", $" + bmwCar.price);
        System.out.println(bmwCar.sound);
    }
}
