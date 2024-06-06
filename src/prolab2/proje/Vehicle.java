package prolab2.proje;

import java.util.HashMap;
import java.util.Map;

public abstract class Vehicle {
    protected String vehicleId;
    protected String fuelType;
    protected double fuelCostPerKm;
    protected int capacity;
    protected Map<Integer, Passenger> rezerveEdilmisKoltuklar; 
    private Personel driver1;
    private Personel driver2;
    private Personel servicePersonnel1;
    private Personel servicePersonnel2;

    public Vehicle(String vehicleId, String fuelType, double fuelCostPerKm, int capacity,
                   Personel driver1, Personel driver2, Personel servicePersonnel1, Personel servicePersonnel2) {
        this.vehicleId = vehicleId;
        this.fuelType = fuelType;
        this.fuelCostPerKm = fuelCostPerKm;
        this.capacity = capacity;
        this.rezerveEdilmisKoltuklar = new HashMap<>();
        initializeSeatMap(); 
        this.driver1 = driver1;
        this.driver2 = driver2;
        this.servicePersonnel1 = servicePersonnel1;
        this.servicePersonnel2 = servicePersonnel2;
    }

    public int calculateTotalPersonnelCost() {
        int totalCost = driver1.getDriverSalary() + driver2.getDriverSalary() +
                servicePersonnel1.getServicePersonnelSalary() + servicePersonnel2.getServicePersonnelSalary();
        return totalCost;
    }

    private void initializeSeatMap() {
        for (int i = 1; i <= capacity; i++) {
            rezerveEdilmisKoltuklar.put(i, null); 
        }
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public int getCapacity() {
        return capacity;
    }
    
      public Map<Integer, Passenger> getSeatMap() {
        return rezerveEdilmisKoltuklar;
    }

    public abstract double calculateFuelCost(int distance);

    public Map<Integer, Passenger> getRezerveEdilmisKoltuklar() {
        return rezerveEdilmisKoltuklar;
    }
    
    public int passengerOfNumber() {
        int count = 0;

        for (Passenger passenger : rezerveEdilmisKoltuklar.values()) {
            if (passenger != null) {
                count++;
            }
        }

        return count;
    }   
    
    public int getFuelCostPerKm() {
    return (int) fuelCostPerKm;
}
    
  

    public void reserveSeat(int seatNumber, Passenger passenger) {
        if (rezerveEdilmisKoltuklar.containsKey(seatNumber)) {
            if (rezerveEdilmisKoltuklar.get(seatNumber) != null) {
                System.out.println("Bu koltuk zaten rezerve edilmiş.");
            } else {
                rezerveEdilmisKoltuklar.put(seatNumber, passenger);
                System.out.println("Koltuk başarıyla rezerve edildi.");
            }
        } else {
            throw new IllegalArgumentException("Invalid seat number.");
        }
    }

    
}
