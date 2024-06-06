package prolab2.proje;

public class Airplane extends Vehicle {
    public Airplane(String vehicleId, double fuelCostPerKm, int capacity,
                    Personel driver1, Personel driver2, Personel servicePersonnel1, Personel servicePersonnel2) {
        super(vehicleId, "Gaz", fuelCostPerKm, capacity, driver1, driver2, servicePersonnel1, servicePersonnel2);
    }

    @Override
    public double calculateFuelCost(int distance) {
        return fuelCostPerKm * distance;
    }
}