package src.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//Creating a Flight Object with the information provided within the exam files("Traccia A", "Esempi_A")
public class Flight {

    //Aircraft aircraft;
    private String aircraft;
    private int passengers;
    private String departureAirport; //Airport departureAirport;
    private String arrivalAirport;  //Airport arrivalAirport;
    private int day;

    Flight(String aircraft, int numPassengers, String departure, String arrival, int day) {
        this.aircraft = aircraft;
        this.passengers = numPassengers;
        this.departureAirport = departure;
        this.arrivalAirport = arrival;
        this.day = day;
    }

    //Creating a method to check if a Flight is overboard
    public boolean isOverboard(int numPassengers, int MaxPassengers) {

        //A simple casting for the percentage
        int capacity = (int) (MaxPassengers * (90.0f / 100.0f));

        if (numPassengers > capacity)
            return true;
        else return false;

    }

    //Creating a method to check if a Flight is underboard
    public boolean isUnderboard(int numPassengers, int MaxPassengers) {

        //A simple casting for the percentage
        int capacity = (int) (MaxPassengers * (10.0f / 100.0f));

        if (numPassengers < capacity)
            return true;
        else return false;
    }
}
