package src.progetto.task;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;
import src.progetto.model.Aircraft;
import src.progetto.model.Airport;
import src.progetto.model.Flight;

public class Task1 implements ITask {
    private Map<String, Aircraft> aircraftMap;
    private Map<String, Airport> airportMap;
    private List<Flight> flightList;

    @Override
    public void run() {
        try (Scanner input = new Scanner(System.in)) {
            String firstLine = input.nextLine();
            String[] objectQuantities = firstLine.split(" ");

            int numAircrafts = Integer.parseInt(objectQuantities[0]);
            int numAirports = Integer.parseInt(objectQuantities[1]);
            int numFlights = Integer.parseInt(objectQuantities[2]);

            for (int i = 0; i < numAircrafts; i++) {
                String aircraftLine = input.nextLine();
                String[] aircraftData = aircraftLine.split(" ");
                Aircraft aircraft = new Aircraft(aircraftData);
                aircraftMap.put(aircraft.getCode(), aircraft);
            }

            for (int i = 0; i < numAirports; i++) {
                String airportLine = input.nextLine();
                String[] airportData = airportLine.split(" ");
                Airport airport = new Airport(airportData);
                airportMap.put(airport.getCode(), airport);
            }

            for (int i = 0; i < numFlights; i++) {
                String flightLine = input.nextLine();
                String[] flightData = flightLine.split(" ");
                Flight flight = new Flight(flightData);
                flightList.add(flight);
            }

            IntStream.range(0, numFlights)
                    .mapToObj(i -> input.nextLine())
                    .map(flightLine -> flightLine.split(" "))
                    .map(Flight::new)
                    .forEach(flightList::add);
        }
    }
}
