public class GasolineCar extends AFuelCar{
    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
    }

    @Override
    public String getFuelType() {
        return "Gasoline";
    }

    @Override
    public int getRegistrationFee() {
        int registrationFee = 0;

        //Decided to remove the range of 20 < kmL < 50
        //In case a car drives above 50 km/L, they should still pay a registration fee..
        if (super.getKmPrLitre() >= 20) {
            registrationFee = 330;
        } else if (super.getKmPrLitre() >= 15) {
            registrationFee = 1050;
        } else if (super.getKmPrLitre() >= 10) {
            registrationFee = 2340;
        } else if (super.getKmPrLitre() >= 5) {
            registrationFee = 5500;
        } else if (super.getKmPrLitre() < 5) {
            registrationFee = 10470;
        }

        return registrationFee;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nFuel Type: " + getFuelType() +
                "\nRegistration Fee: " + getRegistrationFee();
    }
}
