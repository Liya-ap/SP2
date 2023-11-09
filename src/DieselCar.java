public class DieselCar extends AFuelCar{
    private final boolean particleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean particleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.particleFilter = particleFilter;
    }

    @Override
    public String getFuelType() {
        return "Diesel";
    }

    public boolean hasParticleFilter() {
        return particleFilter;
    }

    @Override
    public int getRegistrationFee() {
        int registrationFee = 0;

        //Decided to remove the range of 20 < kmL < 50
        //In case a car drives above 50 km/L, they should still pay a registration fee..
        if (super.getKmPrLitre() >= 20) {
            registrationFee = 460;
        } else if (super.getKmPrLitre() >= 15) {
            registrationFee = 2440;
        } else if (super.getKmPrLitre() >= 10) {
            registrationFee = 4190;
        } else if (super.getKmPrLitre() >= 5) {
            registrationFee = 8270;
        } else if (super.getKmPrLitre() < 5) {
            registrationFee = 25730;
        }

        if (!hasParticleFilter()) {
            registrationFee += 1000;
        }

        return registrationFee;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nFuel Type: " + getFuelType() +
                "\nHave Particle Filter: " + hasParticleFilter() +
                "\nRegistration Fee: " + getRegistrationFee();
    }
}
