package prolab2.proje;

import java.util.ArrayList;
import java.util.List;

public class Transport implements IReservable {
    private List<Company> companies;
    private List<Trip> trips;

    public Transport() {
        this.companies = new ArrayList<>();
        this.trips = new ArrayList<>();                                                                                            
    }

    @Override
    public void checkSeatAvailability(Trip trip) {
    }

    @Override
    public void reserveSeat(Trip trip, int seatNumber) {
    }

    public void addCompany(Company company) {
        companies.add(company);
    }
    
    public void removeTrip(Trip trip) {
        trips.remove(trip);
    }
       
    public void addTrip(Trip trip) {
        trips.add(trip);
    }
    
    public List<Trip> getTrips() {
        return trips;
    }
    
     public void printTripList() {
        List<Trip> trips = getTrips();

        if (trips.isEmpty()) {
            System.out.println("There are no trips available.");
        } else {
            System.out.println("Trip List:");
            for (Trip trip : trips) {
                System.out.println("Departure Point: " + trip.getRoute().getDeparturePoint());
                System.out.println("Arrival Point: " + trip.getRoute().getArrivalPoint());
                System.out.println("Vehicle Capacity: " + trip.getVehicle().getCapacity());
                System.out.println("Date: " + trip.getDate());
                System.out.println("----------------------");
            }
        }
    }
}
