public abstract class ACar implements Car{
    private String registrationNumber;
    private final String make;
    private String model;
    private final int numberOfDoors;

    public ACar(String registrationNumber, String make, String model, int numberOfDoors) {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public String toString() {
        return "ABOUT THE CAR\n" +
                "Reg.Nr: " + getRegistrationNumber() +
                "\nMake: " + getMake() +
                "\nModel: " + getModel() +
                "\nDoors: " + getNumberOfDoors();
    }
}
