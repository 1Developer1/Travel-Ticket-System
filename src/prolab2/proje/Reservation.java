package prolab2.proje;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Reservation {
    private Trip trip;
    private Map<Integer, Passenger> reservedSeats; 

    public Reservation(Trip trip) {
        this.trip = trip;
        this.reservedSeats = new HashMap<>();
    }

    // Reservation-specific methods
    public boolean reserveSeat(int seatNumber, Passenger passenger) {
        if (!reservedSeats.containsKey(seatNumber)) {
            reservedSeats.put(seatNumber, passenger);
            return true; 
        } else {
            System.out.println("Bu koltuk zaten rezerve edilmiş.");
            return false; 
        }
    }
}
