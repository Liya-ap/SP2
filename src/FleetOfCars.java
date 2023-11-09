import java.util.ArrayList;

public class FleetOfCars {
    private ArrayList<Car> fleet = new ArrayList<>();

    public void addCar(Car car) {
        fleet.add(car);
    }

    public int getTotalRegistrationFeeForFleet() {
        int totalFee = 0;
        for (Car c: fleet) {
            totalFee += c.getRegistrationFee();
        }
        return totalFee;
    }

    @Override
    public String toString() {
        String allCars = "";
        for (Car c: fleet) {
            allCars = allCars.concat(c.toString())+"\n\n";
        }

        return allCars;
    }
}
