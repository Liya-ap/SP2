public class Main {
    public static void main(String[] args) {
        FleetOfCars fleetOfCars = new FleetOfCars();

        Car dieselCar = new DieselCar("DX31245", "BMW", "X5", 5, 16, false);
        Car electricCar = new ElectricCar("MK45910", "Tesla", "Model 3", 5, 75, 485);
        Car gasolineCar = new GasolineCar("GB37981", "Honda", "Civic", 5, 14);

        fleetOfCars.addCar(dieselCar);
        fleetOfCars.addCar(electricCar);
        fleetOfCars.addCar(gasolineCar);

        System.out.println(fleetOfCars + "Total Registration Fee: " + fleetOfCars.getTotalRegistrationFeeForFleet());
    }
}
