// SUV class
public class SUV extends Car {
    private boolean hasOffRoadCapability;

    // Constructor
    public SUV(String brand, String model, double price, boolean hasOffRoadCapability) {
        super(brand, model, price);
        this.hasOffRoadCapability = hasOffRoadCapability;
    }

    // Getter method for hasOffRoadCapability
    public boolean hasOffRoadCapability() {
        return hasOffRoadCapability;
    }

    // Display SUV information
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: SUV");
        System.out.println("Has Off-Road Capability: " + hasOffRoadCapability);
    }
}
