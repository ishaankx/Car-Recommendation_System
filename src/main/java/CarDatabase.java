import java.util.ArrayList;
import java.util.List;

public class CarDatabase {
    private List<Car> cars;

    public CarDatabase() {
        this.cars = new ArrayList<>();
        initializeDatabase();
    }

    private void initializeDatabase() {
        // Adding Sedans
        cars.add(new Sedan("Volkswagen", "Virtus", 30000, 5));
        cars.add(new Sedan("Skoda", "Slavia", 32000, 5));

        // Adding SUVs
        cars.add(new SUV("Toyota", "Fortuner", 55000, true));
        cars.add(new SUV("Toyota", "Fortuner Legender", 60000, true));
        cars.add(new SUV("Hyundai", "Creta", 48000, false));

        // Adding Hatchbacks
        cars.add(new HatchBack("Renault", "Kwid", 500000, true));
        cars.add(new HatchBack("Maruti Suzuki", "Alto", 500000, true ));
        cars.add(new HatchBack("Maruti Suzuki", "S-Presso", 500000, true));
        cars.add(new HatchBack("Hyundai", "i20", 1000000, false ));
        // Add more cars with brand, model, and price
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public List<Car> findRecommendedCars(int carTypeChoice, String preferredBrand, double minPrice, double maxPrice) {
        List<Car> recommendedCars = new ArrayList<>();

        for (Car car : cars) {
            if ((carTypeChoice == 1 && car instanceof Sedan) ||
                (carTypeChoice == 2 && car instanceof SUV) ||
                (carTypeChoice == 3 && car instanceof HatchBack)) {

                if (car.getBrand().equalsIgnoreCase(preferredBrand) &&
                    car.getPrice() >= minPrice && car.getPrice() <= maxPrice) {

                    recommendedCars.add(car);
                }
            }
        }

        return recommendedCars;
    }


    public List<Car> getCars() {
        return cars;
    }
}
