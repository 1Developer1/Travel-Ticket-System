package prolab2.proje;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Admin extends User {

    private Map<String, Company> firms;
    private int hizmetBedeli;
    public Admin(String username, String password) {
        super(username, password);
        this.firms = new HashMap<>();
    }


    public void addFirma(String firmaAdi, String kullaniciAdi, String sifre) {
        Company newFirma = new Company(kullaniciAdi, sifre);
        firms.put(firmaAdi, newFirma);
    }

    public void removeFirma(String firmaAdi) {
        firms.remove(firmaAdi);
    }

    public String getFirms() {
        StringBuilder firmalarString = new StringBuilder();
        for (String firmaAdi : firms.keySet()) {
            firmalarString.append(firmaAdi).append("\n");
        }
        return firmalarString.toString();
    }
     public Map<String, Company> getFirmalar() {
        return firms;
    }

       public Company checkCredentials(String kullaniciAdi, String sifre) {
        for (Company firma : firms.values()) {
            if (firma.login(kullaniciAdi, sifre)) {
                return firma;
            }
        }
        return null; 
    }
       
       public int getHizmetBedeli(){return hizmetBedeli;}
       public void setHizmetBedeli(int hizmetBedeli){this.hizmetBedeli=hizmetBedeli;}

}
