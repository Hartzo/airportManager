package src.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//Creating an Aircraft Object with the information provided within the exam files("Traccia A", "Esempi_A")
public class Aircraft {

    private String aircraft_code;
    private int maxPassengers;
    private int tankCapacity;
    private int tripsLastYear;

    public Aircraft(String code, int passengers, int fuelTank, int trips) {
        this.aircraft_code = code;
        this.maxPassengers = passengers;
        this.tankCapacity = fuelTank;
        this.tripsLastYear = trips;
    }

}
