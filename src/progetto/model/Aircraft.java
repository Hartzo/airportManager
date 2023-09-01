package src.progetto.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//Creating an Aircraft Object with the information provided within the exam files("Traccia A", "Esempi_A")
public class Aircraft {

    private String code;
    private int maxPassengers;
    private int tankCapacity;
    private int tripsLastYear;

    public Aircraft(String code, int passengers, int fuelTank, int trips) {
        this.code = code;
        this.maxPassengers = passengers;
        this.tankCapacity = fuelTank;
        this.tripsLastYear = trips;
    }

    public Aircraft(String[] aircraftData) {
        this.code = aircraftData[0];
        this.maxPassengers = Integer.parseInt(aircraftData[1]);
        this.tankCapacity = Integer.parseInt(aircraftData[2]);
        this.tripsLastYear = Integer.parseInt(aircraftData[3]);
    }

}
