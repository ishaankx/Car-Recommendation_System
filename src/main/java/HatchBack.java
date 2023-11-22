// HatchBack class
public class HatchBack extends Car {
    private boolean isCompact;

    // Constructor
    public HatchBack(String brand, String model, double price, boolean isCompact) {
        super(brand, model, price);
        this.isCompact = isCompact;
    }

    // Getter method for isCompact
    public boolean isCompact() {
        return isCompact;
    }

    // Display hatchback information
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Hatchback");
        System.out.println("Is Compact: " + isCompact);
    }
}
