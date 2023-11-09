public class ElectricCar extends ACar{
    private final int batteryCapacity;
    private final int maxRange;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }

    // returns the battery capacity in kilowatt-hours
    public int getBatteryCapacityKWh(){
        return batteryCapacity;
    }

    // returns the maximum range in kilometres.
    public int getMaxRangeKm(){
        return maxRange;
    }

    // returns the power consumption in watt-hours per driven kilometre.
    private int getWhPrKm() {
        return (batteryCapacity*1000)/maxRange;
    }

    private double getKmL() {
        return 100/(getWhPrKm()/91.25);
    }

    @Override
    public int getRegistrationFee() {
        int registrationFee = 0;

        //Decided to remove the range of 20 < kmL < 50
        //In case a car drives above 50 km/L, they should still pay a registration fee..
        if (getKmL() >= 20) {
            registrationFee = 330;
        } else if (getKmL() >= 15) {
            registrationFee = 1050;
        } else if (getKmL() >= 10) {
            registrationFee = 2340;
        } else if (getKmL() >= 5) {
            registrationFee = 5500;
        } else if (getKmL() < 5) {
            registrationFee = 10470;
        }

        return registrationFee;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nBattery Capacity (kWh): " + getBatteryCapacityKWh() +
                "\nMax Range (km): " + getMaxRangeKm() +
                "\nPower Consumption (Wh/km): " + getWhPrKm() +
                "\nRegistration Fee: " + getRegistrationFee();
    }
}
