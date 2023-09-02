package src.progetto;
import java.util.*;

import src.progetto.model.*;
import src.progetto.task.*;

public class progetto {

	public static void main(String[] args) {
	
		ArrayList<Aircraft> aircrafts_List = new ArrayList<Aircraft>();
		ArrayList<Airport> airports_List = new ArrayList<Airport>();
		ArrayList<Flight> flights_List = new ArrayList<Flight>();
		
		//Opening a Scanner with a try command is more professional , remember to close the scanner is a good practice
		 try (Scanner input = new Scanner(System.in)) {
	            
	            do {
		            	String line = input.nextLine();
		                
		            	//Naming the array of strings "rows" to remember how many lines of input are going to be afterwards 
		                String[] rows = line.split(" ");
		                int numAircrafts = Integer.parseInt(rows[0]);
		                int numAirports = Integer.parseInt(rows[1]);
		                int numFlights = Integer.parseInt(rows[2]);
		               // System.out.println("\n");
		                //System.out.println(numAircrafts + " " + numAirports + " " + numFlights);
		                
		                //Storing Aircrafts Data reading n lines as many as numAircrafts
		                for(int i = 0; i < numAircrafts; i++) {
		                	
		                	line = input.nextLine();
		                	aircrafts_List.add(Aircraft.ReadingData(line));
		                	/*for(Aircraft a : aircrafts_List) {
		                		System.out.println(a.getAircraft_code() + " " + a.getMaxPassengers() + 
				                		" " + a.getTankCapacity() + " " + a.getTripsLastYear());
		                	}*/
		                	
		                }
		                //Storing Airports Data reading n lines as many as numAirports
		                for(int i = 0; i < numAirports; i++) {
		                	
		                	line = input.nextLine();
		                	airports_List.add(Airport.ReadingData(line));
		                	/*for(Airport a : airports_List) {
		                		System.out.println(a.getAirport_code() + " " + a.getCountry() + 
				                		" " + a.getMaxAircrafts());
		                	}*/
		                	
		                }
		                //Storing Flight data reading n lines as many numFlights
		                for(int i = 0; i < numFlights; i++) {
		                	
		                	line = input.nextLine();		                	
		                	flights_List.add(Flight.ReadingData(aircrafts_List, line));
		                	/*for(Flight a : flights_List) {
		                		System.out.println(a.getAircraft() + " " + a.getPassengers() + " " + a.getDepartureAirport()
				                		+ " " + a.getArrivalAirport() + " " + a.getDay());
		                	}*/
		                }
		                
		                //Reading last line to identify the which task the program has to run 
		                String[] tasks = input.nextLine().split(" ");
		              //Calling each method of the tasks , task 2 and 3 have further data to collect
		                if (tasks[0].equalsIgnoreCase("TASK1")) 
		                   Task1.task(aircrafts_List, airports_List, flights_List);  
		                
		                else if (tasks[0].equalsIgnoreCase("TASK2")) {
		                	int p = Integer.parseInt(tasks[1]);
		                	int q = Integer.parseInt(tasks[2]);
		                	Task2.task(aircrafts_List, airports_List, flights_List, p , q);
		                }
		                
		                else if (tasks[0].equalsIgnoreCase("TASK3")) {
		                    int new_Flights = Integer.parseInt(tasks[1]);
		                    Task3.task(aircrafts_List, airports_List, flights_List, new_Flights);
		                }
	                
	            } while (input.hasNextLine());
	            
	            
	      } catch (Exception e) {
	            System.err.println("Error!" + e.getMessage());
	        }
		 
	}

}
