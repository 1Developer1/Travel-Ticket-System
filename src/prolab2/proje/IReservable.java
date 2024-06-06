package prolab2.proje;

public interface IReservable {
    
    
    void checkSeatAvailability(Trip trip);

    void reserveSeat(Trip trip, int seatNumber);
}
