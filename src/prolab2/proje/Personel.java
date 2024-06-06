package prolab2.proje;


class Personel extends Person {
    private int driverSalary;
    private int servicePersonnelSalary;

    public Personel(String firstName, String lastName, int driverSalary, int servicePersonnelSalary) {
        super(firstName, lastName);
        this.driverSalary = driverSalary;
        this.servicePersonnelSalary = servicePersonnelSalary;
    }

    public int getDriverSalary() {
        return driverSalary;
    }

    public int getServicePersonnelSalary() {
        return servicePersonnelSalary;
    }
}