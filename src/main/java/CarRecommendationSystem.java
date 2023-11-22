import java.util.List;
import java.util.Scanner;

public class CarRecommendationSystem {
    private static CarDatabase carDatabase = new CarDatabase();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select car type: ");
        System.out.println("1. Sedan");
        System.out.println("2. SUV");
        System.out.println("3. HatchBack");

        int carTypeChoice = scanner.nextInt();

        // Consume the newline character
        scanner.nextLine();

        System.out.println("Enter preferred brand: ");
        String preferredBrand = scanner.nextLine();

        System.out.println("Enter preferred price range (minimum and maximum): ");
        double minPrice = scanner.nextDouble();
        double maxPrice = scanner.nextDouble();

        findAndDisplayRecommendedCars(carTypeChoice, preferredBrand, minPrice, maxPrice);

        scanner.close();
    }

    private static void findAndDisplayRecommendedCars(int carTypeChoice, String preferredBrand, double minPrice, double maxPrice) {
        List<Car> recommendedCars = findRecommendedCars(carTypeChoice, preferredBrand, minPrice, maxPrice);

        if (!recommendedCars.isEmpty()) {
            System.out.println("Suggested cars:");
            for (Car car : recommendedCars) {
                car.displayInfo();
                System.out.println();
            }
        } else {
            System.out.println("No matching cars found.");
        }
    }

    private static List<Car> findRecommendedCars(int carTypeChoice, String preferredBrand, double minPrice, double maxPrice) {
        List<Car> recommendedCars = carDatabase.findRecommendedCars(carTypeChoice, preferredBrand, minPrice, maxPrice);
        return recommendedCars;
    }

}
