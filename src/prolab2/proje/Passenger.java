package prolab2.proje;

class Passenger extends Person {
    private String tcNumber;
    private String birthDate;

    public Passenger(String firstName, String lastName, String tcNumber, String birthDate) {
        super(firstName, lastName);
        this.tcNumber = tcNumber;
        this.birthDate = birthDate;
    }

    public String getTcNumber() {
        return tcNumber;
    }
}
