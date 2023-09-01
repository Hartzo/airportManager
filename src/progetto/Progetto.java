package src.progetto;

import java.util.Scanner;
import src.progetto.model.Aircraft;

public class Progetto {

    public static void main(String[] args) {

        ArrayList<Aircraft> aircrafts_List = new ArrayList<Aircraft>();

        try (Scanner input = new Scanner(System.in)) {
            String line;
            do {
                String line = input.nextLine();
		                
		            	//Naming the array of strings "rows" to remember how many lines of input are going to be afterwards 
		                String[] rows = line.split(" ");
		                int numAircrafts = Integer.parseInt(rows[0]);
		                int numAirports = Integer.parseInt(rows[1]);
		                int numFlights = Integer.parseInt(rows[2]);
		                System.out.println("\n");
		                System.out.println(numAircrafts + " " + numAirports + " " + numFlights);
		                
		                //Storing Aircrafts Data reading n lines as many as numAircrafts
                          for(int i = 0; i < numAircrafts; i++) {
            		                	line = input.nextLine();
            		                	String[] rowParts = line.split(" ");
            			                String code = rowParts[0];
            			                int passengers = Integer.parseInt(rowParts[1]);
            			                int fuelTank = Integer.parseInt(rowParts[2]);
            			                int trips = Integer.parseInt(rowParts[3]);
            		
            			                Aircraft[] aircrafts = new Aircraft[numAircrafts];
            			                aircrafts[i] = new Aircraft(code, passengers, fuelTank, trips); 
            			                System.out.println(aircrafts[i].getAircraft_code() + " " + aircrafts[i].getMaxPassengers() + 
            			                		" " + aircrafts[i].getTankCapacity() + " " + aircrafts[i].getTripsLastYear());
            		                }    
                
                    //Storing Airports Data reading n lines as many as numAirports
		                for(int i = 0; i < numAirports; i++) {
		                	line = input.nextLine();
		                	String[] rowParts = line.split(",");
		                	String code = rowParts[0];
			                String country= rowParts[1];
			                int max = Integer.parseInt(rowParts[2]);
			                
			                Airport[] airports = new Airport[numAirports];
			                airports[i]= new Airport(code, country, max);
			                System.out.println(airports[i].getAirport_code() + "," + airports[i].getCountry() + "," + airports[i].getMaxAircrafts());
		                }
                
		                //Storing Flight data reading n lines as many numFlights
		                for(int i = 0; i < numFlights; i++) {
		                	line = input.nextLine();
		                	String[] rowParts = line.split(" ");
		                	String aircraft = rowParts[0];
			                int numPassengers = Integer.parseInt(rowParts[1]);
			                String departure= rowParts[2];
			                String arrival= rowParts[3];
			                int numDay = Integer.parseInt(rowParts[4]);
			                
			                
			                Flight[] flights = new Flight[numFlights];
			                flights[i] = new Flight(aircraft, numPassengers, departure, arrival, numDay);
			                System.out.println(flights[i].getAircraft() + " " + flights[i].getPassengers() + " " + flights[i].getDepartureAirport()
			                		+ " " + flights[i].getArrivalAirport() + " " + flights[i].getDay());	
		                }
                
                 //Reading last line to identify the which task the program has to run 
		                String[] tasks = input.nextLine().split(" ");
		              //Calling each method of the tasks , task 3 has further data to collect
		                if (tasks[0].equals("TASK1"))
		                    Task1.task();  
		                else if (tasks[0].equals("TASK2"))
		                    Task2.task();
		                else if (tasks[0].equals("TASK3")) {
		                    int new_Flights = Integer.parseInt(tasks[1]);
		                    Task3.task();
		                }
              
            } while (input.hasNextLine());

        }

    }
}
