public class Vehicle {
   protected String brand;
   protected String model;

   public Vehicle(String brand, String model){
       this.brand = brand;
       this.model = model;
   }
   public String describe(){
       return "Brand: "+ brand + "Model: " + model;
   }
}
