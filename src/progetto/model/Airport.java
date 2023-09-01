package src.progetto.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Airport {

    private String code;
    private String country;
    private int maxAircrafts;

    public Airport(String code, String country, int max){
        this.code = code;
        this.country = country;
        this.maxAircrafts = max;
    }

    public Airport(String[] airportData) {
        this.code = airportData[0];
        this.country = airportData[1];
        this.maxAircrafts = Integer.parseInt(airportData[2]);
    }

}
