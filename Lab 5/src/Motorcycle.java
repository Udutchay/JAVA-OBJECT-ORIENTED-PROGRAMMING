public class Motorcycle extends Vehicle{
    private boolean hasSidecar;

    public Motorcycle(String brand, String model, boolean hasSidecar){
        super(brand, model);
        this.hasSidecar = hasSidecar;
    }
    @Override
    public String describe() {
        return super.describe() + ", Sidecar: " + hasSidecar + " (Motorcycle)";
    }

}
