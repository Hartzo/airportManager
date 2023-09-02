package src.progetto.model;

import java.util.ArrayList;

//Creating an Aircraft Object with the informations provided within the exam files("Traccia A", "Esempi_A")
public class Aircraft {
	//Declaring private variables is better than declaring them public, in order to get them visible we need getter/setter methods
		private String aircraft_code;
		private int maxPassengers;
		private int tankCapacity;
		private int tripsLastYear;
	    
	    public Aircraft(String code, int passengers, int fuelTank, int trips){
	    	
	    	this.setAircraft_code(code);
	    	this.setMaxPassengers(passengers);
	    	this.setTankCapacity(fuelTank);
	    	this.setTripsLastYear(trips);
	    	
	    }

		public String getAircraft_code() {
			return aircraft_code;
		}

		public void setAircraft_code(String aircraft_code) {
			this.aircraft_code = aircraft_code;
		}


		public int getMaxPassengers() {
			return maxPassengers;
		}

		public void setMaxPassengers(int maxPassengers) {
			this.maxPassengers = maxPassengers;
		}

		public int getTankCapacity() {
			return tankCapacity;
		}

		public void setTankCapacity(int tankCapacity) {
			this.tankCapacity = tankCapacity;
		}

		public int getTripsLastYear() {
			return tripsLastYear;
		}

		public void setTripsLastYear(int tripsLastYear) {
			this.tripsLastYear = tripsLastYear;
		}
		
		//Using a method to read data from lines of input and at the same time creating an Object that will stored in an arraylist
		public static Aircraft ReadingData(String data) {
			
			String[] rowParts = data.split(" ");
            String code = rowParts[0];
            int passengers = Integer.parseInt(rowParts[1]);
            int fuelTank = Integer.parseInt(rowParts[2]);
            int trips = Integer.parseInt(rowParts[3]);
  
			return new Aircraft(code, passengers, fuelTank, trips);
		}

		public static Aircraft getAircraftByCode(ArrayList<Aircraft> aircrafts_List, String aircraftCode) {
			for (Aircraft aircraft : aircrafts_List) {
	            if (aircraft.getAircraft_code().equals(aircraftCode)) {
	                return aircraft; 
	            }
	        }
	        return null; //Returning null if Aircraft not found
		}
	

}
