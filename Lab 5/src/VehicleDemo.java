public class VehicleDemo {
    public static void main(String[] args) {
        Car myCar = new Car( "Toyota", "Corolla", 4);
        Motorcycle myBike = new Motorcycle("Yamaha", "MT-07", false);

        System.out.println(myCar.describe());
        System.out.println(myBike.describe());
    }
}