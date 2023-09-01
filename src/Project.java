package src;

import java.util.Scanner;
import src.model.Aircraft;

public class Project {

    public static void main(String[] args) {
        StringBuilder stringlines = new StringBuilder();
        int numAircrafts;
        int numAirports;
        int numFlights;
        String code;
        int passeggeri;
        int serbatoio;
        int voli;

        try (Scanner input = new Scanner(System.in)) {
            String line;
            do {
                line = input.nextLine();
                if (line.equalsIgnoreCase("TASK1")) return;


                String[] righe = line.split(" ");
                numAircrafts = Integer.parseInt(righe[0]);
                numAirports = Integer.parseInt(righe[1]);
                numFlights = Integer.parseInt(righe[2]);
                System.out.println("\n");
                // System.out.println(numAircrafts + " " + numAirports + " " + numFlights);

                for (int i = 0; i < numAircrafts; i++) {
                    line = input.nextLine();
                    String[] rigaParts = line.split(" ");
                    code = rigaParts[0];
                    passeggeri = Integer.parseInt(rigaParts[1]);
                    serbatoio = Integer.parseInt(rigaParts[2]);
                    voli = Integer.parseInt(rigaParts[3]);

                    Aircraft aircraft1 = new Aircraft(code, passeggeri, serbatoio, voli);
                    System.out.printf("%s %d %d %d",
                            aircraft1.getAircraft_code(),
                            aircraft1.getMaxPassengers(),
                            aircraft1.getTankCapacity(),
                            aircraft1.getTripsLastYear()
                    );
//                    System.out.println(aircraft1.aircraft_code + " " + aircraft1.maxPassengers + " " + aircraft1.tankCapacity + " " + aircraft1.tripsLastYear);
                }

                for (int i = 0; i < numAirports; i++) {

                }

                for (int i = 0; i < numFlights; i++) {

                }

            } while (input.hasNextLine());

        }

    }
}
