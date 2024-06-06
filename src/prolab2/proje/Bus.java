package prolab2.proje;

import java.util.Arrays;
import java.util.List;

public class Bus extends Vehicle {
    private static final List<Integer> CAPACITY_OPTIONS = Arrays.asList(20, 15);

    public Bus(String vehicleId, double fuelCostPerKm, int capacity,
               Personel driver1, Personel driver2, Personel servicePersonnel1, Personel servicePersonnel2) {
        super(vehicleId, "Benzin", fuelCostPerKm, capacity, driver1, driver2, servicePersonnel1, servicePersonnel2);
        if (!CAPACITY_OPTIONS.contains(capacity)) {
            throw new IllegalArgumentException("Invalid bus capacity.");
        }
    }

    @Override
    public double calculateFuelCost(int distance) {
        return fuelCostPerKm * distance;
    }
}