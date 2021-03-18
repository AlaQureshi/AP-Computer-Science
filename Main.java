public class Main {
    public static void main(String[] args) {
        class Car {
            private String color;
            private String make;
            private String model;
            private int year;
            private double price;
            private boolean isElectric;
            private int miles;
            public Car(String mk, int mi, double pr) {
                make = mk;
                miles = mi;
                price = pr;
            }
            public void sound(){
                System.out.println("Vroom");
            }
            class CarTester{
                public void main(String[] args){
                    Car bmwCar = new Car( "BMW", 456, 45000);
                    bmwCar.sound();
                    System.out.println();
                }
            }
        }
    }
}





