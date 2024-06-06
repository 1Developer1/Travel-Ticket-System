package prolab2.proje;

import java.util.HashMap;
import java.util.Map;

public class Train extends Vehicle {
    public Train(String vehicleId, double fuelCostPerKm, int capacity,
                 Personel driver1, Personel driver2, Personel servicePersonnel1, Personel servicePersonnel2) {
        super(vehicleId, "Elektrik", fuelCostPerKm, capacity, driver1, driver2, servicePersonnel1, servicePersonnel2);
    }

    @Override
    public double calculateFuelCost(int distance) {
        return fuelCostPerKm * distance;
    }
}
