//Project Three - IT-145 - Elijah Hickey Oct. 2019
public class Cruise {

    // Class Variables
    private String cruiseName;
    private String cruiseShipName;
    private String departurePort;
    private String destination;
    private String returnPort;

    // Constructor - default
    Cruise() {
    }

    // Constructor - full
    Cruise(String tCruiseName, String tShipName, String tDeparture, String tDestination, String tReturn) {
        cruiseName = tCruiseName;
        cruiseShipName = tShipName;
        departurePort = tDeparture;
        destination = tDestination;
        returnPort = tReturn;
    }

    // Accessors
    public String getCruiseName() {
        return cruiseName;
    }

    public String getCruiseShipName() {
        return cruiseShipName;
    }

    public String getDeparturePort() {
        return departurePort;
    }

    public String getDestination() {
        return destination;
    }

    public String getReturnPort() {
        return returnPort;
    }

    // Mutators
    public void setCruiseName(String tVar) {
        cruiseName = tVar;
    }

    public void setCruiseShipName(String tVar) {
        cruiseShipName = tVar;
    }

    public void setDeparturePort(String tVar) {
        departurePort = tVar;
    }

    public void setDestination(String tVar) {
        destination = tVar;
    }

    public void setReturnPort(String tVar) {
        returnPort = tVar;
    }

    // print cruise details
    //Was tested and informs the user if no cruises are in inventory
    public void printCruiseDetails() {
    	
    	/* Since print cruise deals with all strings, lengths of the strings can very 
    	 *greatly so 'spaces' was made for each respective variable
    	 */
    	
    	int spaceCount;
    	int spaceCount2;
    	int spaceCount3;
    	int spaceCount4;
    	
    	String spaces = "";
    	String spaces2 = "";
    	String spaces3 = "";
    	String spaces4 = "";
    	
    	spaceCount = 20 - cruiseName.length();
    	spaceCount2 = 20 - cruiseShipName.length();
    	spaceCount3 = 20 - departurePort.length();
    	spaceCount4 = 20 - destination.length();
    	
    	
    	for (int i = 1; i <= spaceCount; i++) {
    		spaces = spaces + " ";
    	}
    	for (int i = 1; i <= spaceCount2; i++) {
    		spaces2 = spaces2 + " ";
    	}
    	for (int i = 1; i <= spaceCount3; i++) {
    		spaces3 = spaces3 + " ";
    	}
    	for (int i = 1; i <= spaceCount4; i++) {
    		spaces4 = spaces4 + " ";
    	}
    	
    	System.out.println(cruiseName + spaces + 
    			cruiseShipName + spaces2 + departurePort + 
    			spaces3 + destination + spaces4 + returnPort);
    

        // -completed by E.H.

    }
    

    // method added to print ship's name vice memory address
    @Override
    public String toString() {
        return cruiseName;
    }
}
