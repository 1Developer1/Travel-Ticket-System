package prolab2.proje;


public class Trip {
    private Vehicle vehicle;
    private Route route;
    private String date;
    private int price;
    private Reservation reservation; 

    public Trip(Vehicle vehicle, Route route, String date, int price) {
        this.vehicle = vehicle;
        this.route = route;
        this.date = date;
        this.price = price;
        this.reservation = new Reservation(this);
    }

    public boolean reserveSeat(int seatNumber, Passenger passenger) {
        return reservation.reserveSeat(seatNumber, passenger);
    }
    
    public Vehicle getVehicle() {
        return vehicle;
    }

    public Route getRoute() {
        return route;
    }

    public String getDate() {
        return date;
    }

    public int getPrice() {
        return price;
    }
}
