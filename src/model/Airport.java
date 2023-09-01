package src.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Airport {

    private String airport_code;
    private String country;
    private int maxAircrafts;

    public Airport(String code, String country, int max){
        this.airport_code = code;
        this.country = country;
        this.maxAircrafts = max;
    }

}
