// Sedan class
public class Sedan extends Car {
    private int numSeats;

    // Constructor
    public Sedan(String brand, String model, double price, int numSeats) {
        super(brand, model, price);
        this.numSeats = numSeats;
    }

    // Getter method for numSeats
    public int getNumSeats() {
        return numSeats;
    }

    // Display sedan information
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Sedan");
        System.out.println("Number of Seats: " + numSeats);
    }
}
