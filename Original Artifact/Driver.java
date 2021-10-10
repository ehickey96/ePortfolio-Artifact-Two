//Project Three - IT-145 - Elijah Hickey Oct. 2019
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Driver {

    // class variables (add more as needed)
    private static ArrayList<Ship> shipList = new ArrayList();
    private static ArrayList<Cruise> cruiseList = new ArrayList();
    private static ArrayList<Passenger> passengerList = new ArrayList();


    public static void main(String[] args) {
    	
    	
    	Scanner scnr = new Scanner(System.in);
    	String menuInput;
    	int runCount = 0;
    	    	
        initializeShipList();       // initial ships
        initializeCruiseList();     // initial cruises
        initializePassengerList();  // initial passengers
        do {
        	/*Add this so the displayed message isn't instantly hidden by the menu 
        	 *when returning to the menu (does not run first instance of the menu) -E.H. 
        	 */
        	if(runCount != 0) {
	        	System.out.println("\nPress enter to continue"); 
	        	scnr.nextLine();
        	}
        	
	        displayMenu();
	        menuInput = scnr.nextLine();
	        if(menuInput.equals("1")) {
	    		addShip();
	    		runCount = runCount + 1;
	    	}
	    	else if(menuInput.equals("2")) {
	    		editShip();
	    		runCount = runCount + 1;
	    	}
	    	else if(menuInput.equals("3")) {
	    		addCruise();
	    		runCount = runCount + 1;
	    	}
	    	else if(menuInput.equals("4")) {
	    		editCruise();
	    		runCount = runCount + 1;
	    	}
	    	else if(menuInput.equals("5")) {
	    		addPassenger();
	    		runCount = runCount + 1;
	    	}
	    	else if(menuInput.equals("6")) {
	    		editPassenger();
	    		runCount = runCount + 1;
	    	}
	    	else if(menuInput.equals("A")) {
	    		printShipList("name");
	    		runCount = runCount + 1;
	    	}
	    	else if(menuInput.equals("B")) {
	    		printShipList("active");
	    		runCount = runCount + 1;
	    	}
	    	else if(menuInput.equals("C")) {
	    		printShipList("full");
	    		runCount = runCount + 1;
	    	}
	    	else if(menuInput.equals("D")) {
	    		printCruiseList("list");
	    		runCount = runCount + 1;
	    	}
	    	else if(menuInput.equals("E")) {
	    		printCruiseList("details");
	    		runCount = runCount + 1;
	    	}
	    	else if(menuInput.equals("F")) {
	    		printPassengerList();
	    		runCount = runCount + 1;
	    	}
	    	else if(!(menuInput.equals("x"))){
	    		System.out.println("You did not enter a valid input. Please try again. ");
	    		runCount = runCount + 1;
	    	}
    	
        }while(!(menuInput.equals("x")));
        
        System.out.println("The program will now close.");
        
        return;
        
        
        
        
        
        
        
        // add loop and code here that accepts and validates user input
        // and takes the appropriate action. include appropriate
        // user feedback and redisplay the menu as needed
        // -Completed by E.H.


    }

    // hardcoded ship data for testing
    // Initialize ship list
    public static void initializeShipList() {
        add("Candy Cane", 20, 40, 10, 60, true);
        add("Peppermint Stick", 10, 20, 5, 40, true);
        add("Bon Bon", 12, 18, 2, 24, false);
        add("Candy Corn", 12, 18, 2, 24, false);
    }

    // hardcoded cruise data for testing
    // Initialize cruise list
    public static void initializeCruiseList() {
        Cruise newCruise = new Cruise("Southern Swirl", "Candy Cane", "Miami", "Cuba", "Miami");
        cruiseList.add(newCruise);
        
    }
    

    // hardcoded cruise data for testing
    // Initialize passenger list
    public static void initializePassengerList() {
        Passenger newPassenger1 = new Passenger("Neo Anderson", "Southern Swirl", "STE");
        passengerList.add(newPassenger1);

        Passenger newPassenger2 = new Passenger("Trinity", "Southern Swirl", "STE");
        passengerList.add(newPassenger2);

        Passenger newPassenger3 = new Passenger("Morpheus", "Southern Swirl", "BAL");
        passengerList.add(newPassenger3);
    }
    
    

    // custom method to add ships to the shipList ArrayList
    public static void add(String tName, int tBalcony, int tOceanView,
                           int tSuite, int tInterior, boolean tInService) {
        Ship newShip = new Ship(tName, tBalcony, tOceanView, tSuite, tInterior, tInService);
        shipList.add(newShip);
    }


    public static void printShipList(String listType) {
        // printShipList() method prints list of ships from the
        // shipList ArrayList. There are three different outputs
        // based on the listType String parameter:
        // name - prints a list of ship names only
        // active - prints a list of ship names that are "in service"
        // full - prints tabbed data on all ships

        if (shipList.size() < 1) {
            System.out.println("\nThere are no ships to print.");
            return;
        }
        if (listType == "name") {
            System.out.println("\n\nSHIP LIST - Name");
            for (int i = 0; i < shipList.size(); i++) {
                System.out.println(shipList.get(i));
            }
        } else if (listType == "active") {
            System.out.println("\n\nSHIP LIST - Active");
            for (int i = 0; i < shipList.size(); i++) {
            	if(shipList.get(i).getInService() == true) {
            		System.out.println(shipList.get(i));
            	}
            }                                                
            // completed by E.H., informs user if no lists in the inventory.
            
        } else if (listType == "full") {
            System.out.println("\n\nSHIP LIST - Full");
            System.out.println("-----------------------------------------------");
            System.out.println("                    Number of Rooms     In");
            System.out.print("SHIP NAME           Bal OV  Ste Int     Service");
            System.out.println("\n-----------------------------------------------");
            for (Ship eachShip: shipList)
                eachShip.printShipData();

        } else
            System.out.println("\n\nError: List type not defined.");
    }

    public static void printCruiseList(String listType) {
        if (cruiseList.size() < 1) {
            System.out.println("\nThere are no cruises to print.");
            return;
        }
        if (listType == "list") {
            System.out.println("\n\nCRUISE LIST");
            for (int i=0; i < cruiseList.size(); i++) {
                System.out.println(cruiseList.get(i));
            }
        } else if (listType == "details") {
            System.out.println("\n\nCRUISE LIST - Details");
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.println("                                      |----------------------PORTS-----------------------|");
            System.out.print("CRUISE NAME         SHIP NAME           DEPARTURE           DESTINATION         RETURN");
            System.out.println("\n-----------------------------------------------------------------------------------------");
            for (Cruise eachCruise: cruiseList)
                eachCruise.printCruiseDetails();
        } else
            System.out.println("\n\nError: List type not defined.");
    }

    public static void printPassengerList() {
        if (passengerList.size() < 1) {
            System.out.println("\nThere are no passengers to print.");
            return;
        }
        System.out.println("\n\nPASSENGER LIST");
        System.out.println("-----------------------------------------------------");
        System.out.print("PASSENGER NAME      CRUISE              ROOM TYPE");
        System.out.println("\n-----------------------------------------------------");
        for (Passenger eachPassenger: passengerList)
            eachPassenger.printPassenger();
    }

    // display text-based menu
    public static void displayMenu() {

        System.out.println("\n\n");
        System.out.println("\t\t\tLuxury Ocean Cruise Outings");
        System.out.println("\t\t\t\t\tSystem Menu\n");
        System.out.println("[1] Add Ship            [A] Print Ship Names");
        System.out.println("[2] Edit Ship           [B] Print Ship In Service List");
        System.out.println("[3] Add Cruise          [C] Print Ship Full List");
        System.out.println("[4] Edit Cruise         [D] Print Cruise List");
        System.out.println("[5] Add Passenger       [E] Print Cruise Details");
        System.out.println("[6] Edit Passenger      [F] Print Passenger List");
        System.out.println("[x] Exit System");
        System.out.println("\nEnter a menu selection: ");
    }

    // Add a New Ship
    public static void addShip() {
    	
    	/*This method starts with strings for all inputs then converts them to the respective variables,
    	 *that way the program will still run if the user enters the wrong variable type. 
    	 *All inputs validate that there is input -E.H.*/
    
    	
        Scanner newShipInput = new Scanner(System.in);
        System.out.println("Enter the new ship's name: ");
        String newShipName = newShipInput.nextLine();
        if(newShipName.equals("")){ //tests if there was input
    		System.out.println("No input. Exiting to menu...");
    		return; // quits addShip() method processing
    	}
        
        // ensure new ship name does not already exist
        for (Ship eachShip: shipList) {
        	if(eachShip.getShipName().equalsIgnoreCase(newShipName)) {
        		System.out.println("That ship is already in the system. Exiting to menu...");
        		return; // quits addShip() method processing
        	}       	
        }
        
        // get number of balcony rooms for ship
        System.out.println("Enter number of Balcony Rooms: ");    
        String tempNewRoomBalcon = newShipInput.nextLine();
        int newRoomBalcon;
        if(isANumber(tempNewRoomBalcon) == false) { //tests if input was an int
        	System.out.println("That was not an int. Exiting to menu...");
        	return; // quits addShip() method processing
        }
        else if(tempNewRoomBalcon.equals("")){ //tests if there was input
    		System.out.println("No input. Exiting to menu...");
    		return; // quits addShip() method processing
    	}
        else {
        	newRoomBalcon = Integer.parseInt(tempNewRoomBalcon); //converts user input to int
        }
        
        
        // get number of Ocean View rooms for ship
        System.out.println("Enter number of Ocean View Rooms: ");    
        String tempNewRoomOceanView = newShipInput.nextLine();
        int newRoomOceanView;
        if(isANumber(tempNewRoomOceanView) == false) { //tests if input was an int
        	System.out.println("That was not an int. Exiting to menu...");
        	return; // quits addShip() method processing
        }
        else if(tempNewRoomOceanView.equals("")){ //tests if there was input
    		System.out.println("No input. Exiting to menu...");
    		return; // quits addShip() method processing
    	}
        else {
        	newRoomOceanView = Integer.parseInt(tempNewRoomOceanView); //converts user input to int
        }
        
        // get number of Suite rooms for ship
        System.out.println("Enter number of Suite Rooms: ");    
        String tempNewRoomSuite = newShipInput.nextLine();
        int newRoomSuite;
        if(isANumber(tempNewRoomSuite) == false) { //tests if input was an int
        	System.out.println("That was not an int. Exiting to menu...");
        	return; // quits addShip() method processing
        }
        else if(tempNewRoomSuite.equals("")){ //tests if there was input
    		System.out.println("No input. Exiting to menu...");
    		return; // quits addShip() method processing
    	}
        else {
        	newRoomSuite = Integer.parseInt(tempNewRoomSuite); //converts user input to int
        }
        
        // get number of Interior rooms for ship
        System.out.println("Enter number of Interior Rooms: ");    
        String tempNewRoomInterior = newShipInput.nextLine();
        int newRoomInterior;
        
        
        if(isANumber(tempNewRoomInterior) == false) { //tests if input was an int
        	System.out.println("That was not an int. Exiting to menu...");
        	return; // quits addShip() method processing
        }
        else if(tempNewRoomInterior.equals("")){  //tests if there was input
    		System.out.println("No input. Exiting to menu...");
    		return; // quits addShip() method processing
    	}
        else {
        	newRoomInterior = Integer.parseInt(tempNewRoomInterior); //converts user input to int
        }
        
        // get if ship is in service
        System.out.println("Enter if ship is in service (true or false): ");    
        String tempNewInService = newShipInput.nextLine();
        Boolean newInService;
        
      //valids that user input is a boolean, then converts input to boolean if validation is passed
        if(!(tempNewInService.equals("true")) && !(tempNewInService.equals("false"))) { 
        	System.out.println("That was not a boolean. Exiting to menu...");
        	return; // quits addShip() method processing
        }
        else {
        	newInService = Boolean.parseBoolean(tempNewInService); //converts user input to boolean
        }
        
        //All Validations passed; adds new ship to shipList
        Ship newShip = new Ship(newShipName, newRoomBalcon, newRoomOceanView, 
        		newRoomSuite, newRoomInterior, newInService);
        shipList.add(newShip);
        
        //Completed by E.H., properly adds ship to array if all validations are passed

    }

    // Edit an existing ship
    public static void editShip() {

        // This method does not need to be completed
        System.out.println("The \"Edit Ship\" feature is not yet implemented.");

    }

    // Add a New Cruise
    public static void addCruise() {
    	
    	Scanner newCruiseInput = new Scanner(System.in);
    	System.out.println("Enter the new cruise's name: ");
    	String newCruiseName = newCruiseInput.nextLine();
    	
    	if(newCruiseName.equals("") ) { // tests if there was input
    		System.out.println("No input. Exiting to menu...");
    		return; // quits addCruise() method processing
    	}
    	
    	System.out.println("Enter the new cruise's ship's name: ");
    	String newCruiseShipName = newCruiseInput.nextLine();
    	int numMatches = 0;
    	    	
    	for (Ship eachShip: shipList) { //checks if it is a valid ship name and the ship is in service
    		if((eachShip.getShipName().equalsIgnoreCase(newCruiseShipName)) && (eachShip.getInService() == true)) {
    			numMatches = 1;
    		} 
    	}
    	if (!(numMatches == 1)) { //Ship was not valid or in-service
    		System.out.println("Ship was not found or is not in service. Exiting to menu...");
    		return; // quits addCruise() method processing
    	}
    	
    	for (Cruise eachCruise: cruiseList) { //Tests if the ship already has a cruise
    		if(eachCruise.getCruiseShipName().equalsIgnoreCase(newCruiseShipName)) {
    			System.out.println("Ship already has a cruise. Exiting to menu...");
    			return; // quits addCruise() method processing
    		}
    	}
    	
    	System.out.println("Enter the new cruise's departure port name: ");
    	String newCruiseDeparturePort = newCruiseInput.nextLine();
    	if(newCruiseDeparturePort.equals("") ) { // tests if there was input
    		System.out.println("No input. Exiting to menu...");
    		return; // quits addCruise() method processing
    	}
    	
    	
    	System.out.println("Enter the new cruise's destination name: ");
    	String newCruiseDestination = newCruiseInput.nextLine();
    	if(newCruiseDestination.equals("") ) { // tests if there was input
    		System.out.println("No input. Exiting to menu...");
    		return; // quits addCruise() method processing
    	}
    	
    	System.out.println("Enter the new cruise's return port name: ");
    	String newCruiseReturnPort = newCruiseInput.nextLine();
    	if(newCruiseReturnPort.equals("") ) { // tests if there was input
    		System.out.println("No input. Exiting to menu...");
    		return; // quits addCruise() method processing
    	}
    	
    	//All Validations passed; adds new cruise to CruiseList
    	Cruise newCruise = new Cruise(newCruiseName, newCruiseShipName, 
    			newCruiseDeparturePort, newCruiseDestination, newCruiseReturnPort);
    	cruiseList.add(newCruise);
    	
    	//Completed by E.H.
    	
    }

    // Edit an existing cruise
    public static void editCruise() {

        // This method does not need to be completed
        System.out.println("The \"Edit Cruise\" feature is not yet implemented.");

    }

    // Add a New Passenger
    public static void addPassenger() {

        Scanner newPassengerInput = new Scanner(System.in);
        System.out.println("Enter the new passenger's name: ");
        String newPassengerName = newPassengerInput.nextLine();

        // ensure new passenger name does not already exist
        for (Passenger eachPassenger: passengerList) {
            if (eachPassenger.getPassengerName().equalsIgnoreCase(newPassengerName)) {
                System.out.println("That passenger is already in the system. Exiting to menu...");
                return; // quits addPassenger() method processing
            }
        }

        // get cruise name for passenger
        System.out.println("Enter cruise name: ");
        String newCruiseName = newPassengerInput.nextLine();
        

        // ensure cruise exists
        int numMatches = 0;
        for (Cruise eachCruise: cruiseList) {
            if (eachCruise.getCruiseName().equalsIgnoreCase(newCruiseName)) {
            	numMatches = 1;
                /* cruise does exist FIXED BY E.H., 
                 * did not work if more than one cruise was in the array before it was fixed
                 * the loop would run through every ship, 
                 * and only one could match so any that didnt match would cause it to fail validation
            	 */
            }
        }
        if(!(numMatches == 1)) { 
            System.out.println("That cruise does not exist in the system. Exiting to menu...");
            return; // quits addPassenger() method processing
        }

        // get room type
        System.out.println("Enter Room Type (BAL, OV, STE, or INT: ");
        String room = newPassengerInput.nextLine();
        // validate room type
        if ((room.equalsIgnoreCase("BAL")) || (room.equalsIgnoreCase("OV")) ||
                (room.equalsIgnoreCase("STE")) || (room.equalsIgnoreCase("INT"))) {
            // validation passed - add passenger
            Passenger newPassenger = new Passenger(newPassengerName, newCruiseName, room.toUpperCase());
            passengerList.add(newPassenger);
        } 
        else {
            System.out.println("Invalid input. Exiting to menu...");
            return; // quits addPassenger() method processing
        }
    }

    // Edit an existing passenger
    public static void editPassenger() {

        // This method does not need to be completed
        System.out.println("The \"Edit Passenger\" feature is not yet implemented.");

    }

    // Method to check if input is a number
    public static boolean isANumber(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)) == false)
                return false;
        }
        return true;
    }

}
