package src.progetto.model;

//Creating an Airport Object with the informations provided within the exam files("Traccia A", "Esempi_A")
public class Airport {
	//Declaring private variables is better than declaring them public, in order to get them visible we need getter/setter methods
		private String airport_code;
		private String country;
		private int maxAircrafts;
		 
		 
		 public Airport(String code, String country, int max){
			 this.setAirport_code(code);
			 this.setCountry(country);
			 this.setMaxAircrafts(max);
		 }


		public String getAirport_code() {
			return airport_code;
		}


		public void setAirport_code(String airport_code) {
			this.airport_code = airport_code;
		}


		public String getCountry() {
			return country;
		}


		public void setCountry(String country) {
			this.country = country;
		}


		public int getMaxAircrafts() {
			return maxAircrafts;
		}


		public void setMaxAircrafts(int maxAircrafts) {
			this.maxAircrafts = maxAircrafts;
		}
		
		//Using a method to read data from lines of input and at the same time creating an Object that will stored in an arraylist
		public static Airport ReadingData(String data) {
			
        	String[] rowParts = data.split(",");
        	String code = rowParts[0];
            String country= rowParts[1];
            int max = Integer.parseInt(rowParts[2]);
  
			return new Airport(code, country, max);
		}

}


//due aeroporti si dicono collegati se appaiono in almeno un viaggio ad esempio:" ci sono 3 aereoporti LAX, SUF e BER " se due di questi 
//sono andata e ritorno, o viceversa, in almeno un viaggio si dicono collegati quindi +1 al contatore , il task 1 richiede quelli senza collegamento
