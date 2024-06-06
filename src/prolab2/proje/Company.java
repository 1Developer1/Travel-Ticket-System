package prolab2.proje;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Company extends User implements IProfitable {
    private Map<String, Integer> dailyEarnings; 
    private Map<String, Integer> dailyExpenses; 
    private List<Vehicle> vehicles; 
    private List<Trip> trips;
    private Route route;
    private String username;
    private String password;

    public Company(String username, String password) {
        super(username, password);
        this.dailyEarnings = new HashMap<>();
        this.dailyExpenses = new HashMap<>();
        this.vehicles = new ArrayList<>();
        this.trips = new ArrayList<>();
        this.route = route;
                              
                
    }

    @Override
    public int calculateDailyProfit(String date) {
        return dailyEarnings.getOrDefault(date, 0) - dailyExpenses.getOrDefault(date, 0);
    }

    @Override
    public int calculateTotalProfit() {
        int totalEarnings = dailyEarnings.values().stream().mapToInt(Integer::intValue).sum();
        int totalExpenses = dailyExpenses.values().stream().mapToInt(Integer::intValue).sum();
        return totalEarnings - totalExpenses;
    }

    public void addDailyEarnings(String date, int amount) {
            dailyEarnings.put(date, amount);      
    }

    public void addDailyExpenses(String date, int amount) {
            dailyExpenses.put(date, amount);
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }
    
    public void addTrip(Trip trip) {
        trips.add(trip);
    }
    
    public void removeTrip(Trip trip) {
        trips.remove(trip);
    }

    public List<Vehicle> getVehicles() {
        return Collections.unmodifiableList(vehicles);
    }
    
     public List<Trip> getTrips() {
        return trips;
    }
    public String getUsername(){return username;};
    public String getPassword(){return password;};
  
}