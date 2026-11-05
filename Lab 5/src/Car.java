public class Car extends Vehicle {
        private int numberOfDoors;

        public Car(String brand, String model, int numberOfDoors) {
            super(brand, model); // Call parent constructor first
            this.numberOfDoors = numberOfDoors;
        }

        @Override
        public String describe() {
            // Reuse parent description and append car-specific details
            return super.describe() + ", Doors: " + numberOfDoors + " (Car)";
        }
    }

