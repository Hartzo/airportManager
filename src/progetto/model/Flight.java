package src.progetto.model;


import java.util.ArrayList;

//Creating a Flight Object with the informations provided within the exam files("Traccia A", "Esempi_A")
public class Flight {
	//Declaring private variables is better than declaring them public, in order to get them visible we need getter/setter methods
		private Aircraft aircraft;
		//private String aircraft;
		private int passengers;
		private String departureAirport; //Airport departureAirport;
		private String arrivalAirport;  //Airport arrivalAirport;
		private int day;
	    
		public Flight(Aircraft aircraft, int numPassengers, String departure, String arrival, int day){
	    	this.setAircraft(aircraft);
	    	this.passengers = numPassengers;
	    	this.setDepartureAirport(departure);
	    	this.setArrivalAirport(arrival);
	    	this.setDay(day);
	    }

	    //Creating a method to check if a Flight is overboard
	    public boolean isOverboard(int numPassengers, int MaxPassengers) {
	    	
	    	//A simple casting for the percentage
	    	int capacity = (int)(MaxPassengers*(90.0f/100.0f));
	    	
	    	if (numPassengers > capacity)
			return true;
	    	else return false;
	    	
	    }  
	    
	  //Creating a method to check if a Flight is underboard
	    public boolean isUnderboard(int numPassengers, int MaxPassengers) {
	    	
	    	//A simple casting for the percentage
	    	int capacity = (int)(MaxPassengers*(10.0f/100.0f));
	    	
	    	if (numPassengers < capacity)
			return true;
	    	else return false;
	    	
	    }

		public Aircraft getAircraft() {
			return aircraft;
		}

		public void setAircraft(Aircraft aircraft) {
			this.aircraft = aircraft;
		}
		
		public int getPassengers() {
			return passengers;
		}
		
		public void setPassengers(int passengers) {
			this.passengers = passengers;
		}

		public String getDepartureAirport() {
			return departureAirport;
		}

		public void setDepartureAirport(String departureAirport) {
			this.departureAirport = departureAirport;
		}

		public String getArrivalAirport() {
			return arrivalAirport;
		}

		public void setArrivalAirport(String arrivalAirport) {
			this.arrivalAirport = arrivalAirport;
		}

		public int getDay() {
			return day;
		}

		public void setDay(int day) {
			this.day = day;
		}

		//Using a method to read data from lines of input and at the same time creating an Object that will stored in an arraylist
		public static Flight ReadingData(ArrayList<Aircraft> aircrafts_List, String data) {
			
			String[] rowParts = data.split(" ");
			String aircraftCode= rowParts[0];
            int numPassengers = Integer.parseInt(rowParts[1]);
            String departure= rowParts[2];
            String arrival= rowParts[3];
            int numDay = Integer.parseInt(rowParts[4]);
            
            Aircraft aircraft = Aircraft.getAircraftByCode(aircrafts_List, aircraftCode);

            return new Flight(aircraft, numPassengers, departure, arrival, numDay);
			
		}
	    
}
