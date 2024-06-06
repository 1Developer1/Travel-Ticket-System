package prolab2.proje;

import java.util.Map;

public class Route {
    private Map<String, Map<String, Integer>> distances; 
    private String departurePoint;
    private String arrivalPoint;
    public Route(Map<String, Map<String, Integer>> distances) {
        this.distances = distances;
    }

    public int calculateDistance(String departureCity, String arrivalCity) {
        return distances.get(departureCity).get(arrivalCity);
    }
    public String getDeparturePoint() {
        return departurePoint;
    }

    public void setDeparturePoint(String departurePoint) {
        this.departurePoint = departurePoint;
    }

    public String getArrivalPoint() {
        return arrivalPoint;
    }

    public void setArrivalPoint(String arrivalPoint) {
        this.arrivalPoint = arrivalPoint;
    }
}



