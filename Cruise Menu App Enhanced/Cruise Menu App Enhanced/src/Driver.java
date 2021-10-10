// CS-499 Enhancement Two 
// ePortfolio Ship Project
// Elijah Hickey
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;


//using java se 1.8
//TODO FIND METHODS THAT CAN BE SHARED
//NEATEN ORGANIZE AND COMMENT CODE PROPERLY
//FINISH EDIT METHODS, CREATE DELETE METHODS
import static java.lang.Integer.parseInt;

public class Driver {

    // class variables (add more as needed)
    private static ArrayList<Ship> shipList = new ArrayList();
    private static ArrayList<Cruise> cruiseList = new ArrayList();
    private static ArrayList<Passenger> passengerList = new ArrayList();


    public static void main(String[] args) {
    	
   	
        initializeShipList();       // initial ships
        initializeCruiseList();     // initial cruises
        initializePassengerList();  // initial passengers

        for(int i = 0; i < cruiseList.size(); i ++) {
        	cruiseCostProfitSetter( cruiseList.get(i).getCruiseName() );
        }
                 
        menuFraming();
        
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
    	
    	//ship with a cruise
    	Ship newShip1 = new Ship("Candy Cane", 6, 10, 10, 14, true, "Southern Swirl", 4000, 48, 3300, 2000, 1550, 925);
    	shipList.add(newShip1);
    	
    	//in service ship without cruise
    	Ship newShip2 = new Ship("Peppermint Stick", 10, 20, 5, 40, true, "None", 10000, 300, 1900, 1100, 800, 500);
    	shipList.add(newShip2);
    	
    	//secondary ship with cruise
    	Ship newShip3 = new Ship("Dominos Voyager", 2, 2, 2, 2, true, "Pepperoni Blast", 9000, 70, 8400, 7200, 6100, 5000);
    	shipList.add(newShip3);
    	
    	//price not set for room costs etc since ships are not in service
    	
    	Ship newShip4 = new Ship("Bon Bon", 12, 18, 2, 24, false, "None", 0, 0, 0, 0, 0 ,0);
    	shipList.add(newShip4);
    	
    	Ship newShip5 = new Ship("Candy Corn", 12, 18, 2, 24, false, "None", 0, 0, 0, 0, 0, 0);
    	shipList.add(newShip5);
    	
    	
    }





    // hardcoded cruise data for testing
    // Initialize cruise list
    public static void initializeCruiseList() {
    	//various cost/price not set, and will be set with cruiseCostProfitSetter method
        Cruise newCruise1 = new Cruise("Southern Swirl", "Candy Cane", "Miami", "Cuba", "Miami", 0, 0, 0, 0, 200, 2650, 156, 0, 0, 0, 0, 0, 0, 0, 0);
        cruiseList.add(newCruise1);
        
        Cruise newCruise2 = new Cruise("Pepperoni Blast", "Dominos Voyager", "NYC", "Domino's Pizza", "NYC", 0, 0, 0, 0, 120, 3200, 300, 0, 0, 0, 0, 0, 0, 0, 0);
        cruiseList.add(newCruise2);

    }
    

    // hardcoded cruise data for testing
    // Initialize passenger list
    
    //room price calculated after
    public static void initializePassengerList() {
        Passenger newPassenger1 = new Passenger("Neo Anderson", "Southern Swirl", "BAL", "Candy Cane",  0);
        passengerList.add(newPassenger1);

        Passenger newPassenger2 = new Passenger("Trinity", "Southern Swirl", "BAL", "Candy Cane", 0 );
        passengerList.add(newPassenger2);

        Passenger newPassenger3 = new Passenger("Morpheus", "Southern Swirl", "OV", "Candy Cane", 0);
        passengerList.add(newPassenger3);
        
        Passenger newPassenger4 = new Passenger("Agent Anderson", "Southern Swirl", "OV", "Candy Cane", 0);
        passengerList.add(newPassenger4);
        
        Passenger newPassenger5 = new Passenger("M. A. Trixie", "Southern Swirl", "OV", "Candy Cane", 0);
        
        passengerList.add(newPassenger5);
        
        Passenger newPassenger6 = new Passenger("Oracle", "Southern Swirl", "STE", "Candy Cane", 0);
        passengerList.add(newPassenger6);
        
        Passenger newPassenger7 = new Passenger("Cypher", "Southern Swirl", "INT", "Candy Cane", 0);
        passengerList.add(newPassenger7);
        
        Passenger newPassenger8 = new Passenger("Dozer", "Southern Swirl", "INT", "Candy Cane", 0);
        passengerList.add(newPassenger8);
        
        Passenger newPassenger9 = new Passenger("Tank", "Southern Swirl", "INT", "Candy Cane", 0);
        passengerList.add(newPassenger9);
        
        Passenger newPassenger10 = new Passenger("Rhineheart", "Southern Swirl", "INT", "Candy Cane", 0);
        passengerList.add(newPassenger10); 
        
        Passenger newPassenger11 = new Passenger("Leonardo", "Pepperoni Blast", "BAL", "Dominos Voyager", 0);
        passengerList.add(newPassenger11);
        
        Passenger newPassenger12 = new Passenger("Michelangelo", "Pepperoni Blast", "OV", "Dominos Voyager", 0);
        passengerList.add(newPassenger12);
        
        Passenger newPassenger13 = new Passenger("Donatello", "Pepperoni Blast", "STE", "Dominos Voyager", 0);
        passengerList.add(newPassenger13);
        
        Passenger newPassenger14 = new Passenger("Raphael", "Pepperoni Blast", "INT", "Dominos Voyager", 0);
        passengerList.add(newPassenger14);
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
            
        } else if (listType == "activeNoCruise") {
            System.out.println("\n\nSHIP LIST - In Service , No Cruise");
            for (int i = 0; i < shipList.size(); i++) {
            	if(shipList.get(i).getInService() == true && shipList.get(i).getShipsCruise().equals("None")) {
            		System.out.println(shipList.get(i));
            	}
            }                                                
            // completed by E.H., informs user if no lists in the inventory.
            
        } else if (listType == "full") {
        	
   
        	System.out.println("What is the ship's name?");
        	Scanner scnr = new Scanner(System.in);
        	String entrySN = scnr.nextLine();
        	boolean matchedS = false;
        	
         	for(int i = 0; i < shipList.size(); i++) {
        		if(shipList.get(i).getShipName().equals(entrySN)) {
        			matchedS = true;
    			    System.out.println("\n\nSHIP LIST - Full");
    	            System.out.println("-------------------------------------------------------------------");
    	            System.out.println("                  Number of Rooms     ");
    	            System.out.print("SHIP NAME          Bal OV  Ste Int    In Service   Cruise Name");
    	            System.out.println("\n-------------------------------------------------------------------");
  
        	        shipList.get(i).printShipData();
        	        System.out.println("-------------------------------------------------------------------");
    	            System.out.println("                           |--------- Price of Rooms --------|     ");
    	            System.out.print("Departure Cost    CPM       Bal       OV        Ste       Int ");
    	            System.out.println("\n-------------------------------------------------------------------");
    	            shipList.get(i).printShipPricing();

        		}
        	}
         	if(matchedS == false) {
         		System.out.println("Ship not found. Returning to menu");
         		return;
         	}
         	


        } else
            System.out.println("\n\nError: List type not defined.");
    }

    //Creates a new list, and sorts it in either ascending or ascending by the profit
    public static void printCruiseByProfit() {
    	ArrayList<Cruise> sortingCruise = new ArrayList<>(cruiseList);
    	
        if (sortingCruise.size() < 1) {
            System.out.println("\nThere are no cruises to print.");
            return;
        }
        
        
        Scanner scnr = new Scanner(System.in);
        
    	int AscDesc= 0;
    	boolean cycled = false;
		Comparator<Cruise> compareByProfitPerc = (Cruise o1, Cruise o2) -> Double.compare(o1.getProfitPerc(), o2.getProfitPerc());


		System.out.println("Ascending [1] or Descending [2] order?");
		do {
			if((AscDesc < 1 || AscDesc > 2) && cycled == true ) {
				System.out.println("You did not enter 1 or 2");
			}
			while(!scnr.hasNextInt()) {
				System.out.println("Interegers only please!");
				scnr.next();
			}
			cycled = true;
			AscDesc = scnr.nextInt();
			
		}while (AscDesc < 1 || AscDesc > 2);
		
		if (AscDesc == 1) {
			Collections.sort(sortingCruise, compareByProfitPerc);  // ascending
	    	
	    	
		} else {
	    	 
			Collections.sort(sortingCruise, compareByProfitPerc.reversed());//decending
		}
        System.out.println("\n|-----------------------------------------SORTED PROFIT----------------------------------|");
        System.out.print(" Cruise Name      Total Cost      Total Income     Net Profit      Profit Percentage");
        System.out.println("\n------------------------------------------------------------------------------------------");
        for(Cruise eachCruise : sortingCruise) {
        	eachCruise.printCruiseSortedByProfit();
        }
    }
    
    //prints cruise list
    //can be passed list or details
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
            
        //details will only print one ship (lots of info, multiple would be cluttered)    
        } else if (listType == "details") {
        	System.out.println("What is the cruise's name?");
        	Scanner scnr = new Scanner(System.in);
        	String entryCN;
        	entryCN = scnr.nextLine();
        	boolean matchedC = false;
        

        	for(int k = 0; k < cruiseList.size(); k ++) {

        		if(entryCN.equals(cruiseList.get(k).getCruiseName())) {
        			matchedC = true;
                    System.out.println("\n\nCRUISE LIST - Details");
                    System.out.println("------------------------------------------------------------------------------------------");
                    System.out.println("                                      |----------------------PORTS-----------------------|");
                    System.out.print("CRUISE NAME         SHIP NAME           DEPARTURE           DESTINATION         RETURN");
                    System.out.println("\n------------------------------------------------------------------------------------------");
                    cruiseList.get(k).printCruiseDetails();
                    
                    System.out.println("\n|---------------------------------------BOOKED ROOMS-------------------------------------|");
                    System.out.print("Balcony         Ocean View           Suite           Interior         Total");
                    System.out.println("\n------------------------------------------------------------------------------------------");
                    
                    cruiseList.get(k).printCruiseDetailsBookedRooms();
                    System.out.println("\n|-------------------------------------------COSTS----------------------------------------|");
                    System.out.print("Distance     Departure Cost     Add. Cruise Cost     CPM Net      Cruise Total Cost");
                    System.out.println("\n------------------------------------------------------------------------------------------");

                    double shipCPM;
                    double departCost;
                    	
                    shipCPM = shipList.get(0).getCPM();
                    departCost = shipList.get(0).getDepartureCost();
                    cruiseList.get(k).printCruiseDetailsCosts(shipCPM,  departCost);

                    
                    System.out.println("\n|-------------------------------------------INCOME---------------------------------------|");
                    System.out.print("Balcony Rooms  Ocean View Rooms  Suite Rooms  Interior Rooms  Total Income");
                    System.out.println("\n------------------------------------------------------------------------------------------");
                    
                    cruiseList.get(k).printCruiseDetailsIncome();
                    
                    System.out.println("\n|--------------------------------------------PROFIT--------------------------------------|");
                    System.out.print("Total Cost         Total Income        Net Profit            Profit Percentage");
                    System.out.println("\n------------------------------------------------------------------------------------------");
                    cruiseList.get(k).printCruiseDetailsProfit();
        		}

        	}
        	if (matchedC == false) {
        		System.out.println("Cruise not found. Returning to menu. ");
        		return;
        	}
        	
        	
            
            
        } else
            System.out.println("\n\nError: List type not defined.");
    }

    public static void printPassengerListofCruise() {
    	
    	String cruise = "";
    	Scanner scnr = new Scanner(System.in);
    	System.out.println("Enter the name of the cruise");
    	cruise = scnr.nextLine();
    	int cruiseIndex = -1;
        if (passengerList.size() < 1) {
            System.out.println("\nThere are no passengers to print.");
            return;
        }
        for(int i = 0; i < cruiseList.size(); i ++) {
        	if(cruiseList.get(i).getCruiseName().equals(cruise)) {
        		cruiseIndex = i;
        	}
        }
        
        if(cruiseIndex == -1) {
        	System.out.println("Error: No matching cruise found.");
        } else {
            System.out.println("\n\nPASSENGER LIST");
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.print("PASSENGER NAME        CRUISE                  SHIP         ROOM TYPE     ROOM PRICE");
            System.out.println("\n--------------------------------------------------------------------------------------");
            for(int j = 0; j < passengerList.size(); j++){
            	if(passengerList.get(j).getPassengerCruise().equals(cruise)) {
            		passengerList.get(j).printPassenger();
            	}
            }
        }
        
    }
    public static void printPassengerList() {
        if (passengerList.size() < 1) {
            System.out.println("\nThere are no passengers to print.");
            return;
        }
        System.out.println("\n\nPASSENGER LIST");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.print("PASSENGER NAME        CRUISE                  SHIP         ROOM TYPE     ROOM PRICE");
        System.out.println("\n--------------------------------------------------------------------------------------");
        for (Passenger eachPassenger: passengerList)
            eachPassenger.printPassenger();
    }
    
    
    //controls user inputs for the main menu
    public static void menuFraming() {
    	
    	Scanner scnr = new Scanner(System.in);
    	String menuInput;
    	int runCount = 0;
    	
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
 	    		shipMenuFraming();
 	    		runCount = runCount + 1;
 	    	}
 	    	else if(menuInput.equals("2")) {
 	    		cruiseMenuFraming();
 	    		runCount = runCount + 1;
 	    	}
 	    	else if(menuInput.equals("3")) {
 	    		passengerMenuFraming();
 	    		runCount = runCount + 1;
 	    	}
 	    	else if(menuInput.equals("4")) {
 	    		calculatorMenuFraming();
 	    		runCount = runCount + 1;
 	    	}
 
 	    	else if(!(menuInput.equalsIgnoreCase("x"))){
 	    		System.out.println("You did not enter a valid input. Please try again. ");
 	    		runCount = runCount + 1;
 	    	}
     	
         }while(!(menuInput.equals("x")));
         
    }
    
    //controls user input for the ship menu
    public static void shipMenuFraming() {
    	Scanner scnr = new Scanner(System.in);
    	String menuInput;
    	int runCount = 0;
    	
    	 do {

         	/*Add this so the displayed message isn't instantly hidden by the menu 
         	 *when returning to the menu (does not run first instance of the menu) -E.H. 
         	 */
         	if(runCount != 0) {
 	        	System.out.println("\nPress enter to continue"); 
 	        	scnr.nextLine();
         	}
     		displayShipMenu();
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
	    		printShipList("name"); 
 	    		runCount = runCount + 1;
 	    	}
 	    	else if(menuInput.equals("4")) {
	    		printShipList("active"); 
 	    		runCount = runCount + 1;
 	    	}
 	    	else if(menuInput.equals("5")) {
 	    		printShipList("activeNoCruise"); 
	    		runCount = runCount + 1;
	    	}
 	    	else if(menuInput.equals("6")) {
	    		printShipList("full"); 
 	    		runCount = runCount + 1;
 	    	}
 	    	else if(!(menuInput.equalsIgnoreCase("x"))){
 	    		System.out.println("You did not enter a valid input. Please try again. ");
 	    		runCount = runCount + 1;
 	    	}
     	
         }while(!(menuInput.equals("x")));
    	 
    	 menuFraming();
    }
    
    //controls user input for the cruise menu
    public static void cruiseMenuFraming() {
    	Scanner scnr = new Scanner(System.in);
    	String menuInput;
    	int runCount = 0;
    	
    	 do {

         	/*Add this so the displayed message isn't instantly hidden by the menu 
         	 *when returning to the menu (does not run first instance of the menu) -E.H. 
         	 */
         	if(runCount != 0) {
 	        	System.out.println("\nPress enter to continue"); 
 	        	scnr.nextLine();
         	}
     		displayCruiseMenu();
     		
 	        menuInput = scnr.nextLine();
 	        
 	        if(menuInput.equals("1")) {
 	    		addCruise();
 	    		runCount = runCount + 1;
 	    	}
 	    	else if(menuInput.equals("2")) {
 	    		editCruise();
 	    		runCount = runCount + 1;
 	    	}
 	    	else if(menuInput.equals("3")) {
	    		printCruiseList("list"); 
 	    		runCount = runCount + 1;
 	    	}
 	    	else if(menuInput.equals("4")) {
	    		printCruiseList("details"); 
 	    		runCount = runCount + 1;
 	    	}
 	    	else if (menuInput.equals("5")) {
 	    		printPassengerListofCruise();
 	    		runCount = runCount + 1;
 	    	}
 	    	else if(menuInput.equals("6")) {
 	    		printCruiseByProfit();
 	    		runCount = runCount + 1;

 	    	}
 	    	else if(!(menuInput.equalsIgnoreCase("x"))){
 	    		System.out.println("You did not enter a valid input. Please try again. ");
 	    		runCount = runCount + 1;
 	    	}
     	
         }while(!(menuInput.equals("x")));
    	 
    	 menuFraming();
    }
    
    
    
    //controls user input for the passenger menu
    public static void passengerMenuFraming() {
    	Scanner scnr = new Scanner(System.in);
    	String menuInput;
    	int runCount = 0;
    	
    	 do {

         	/*Add this so the displayed message isn't instantly hidden by the menu 
         	 *when returning to the menu (does not run first instance of the menu) -E.H. 
         	 */
         	if(runCount != 0) {
 	        	System.out.println("\nPress enter to continue"); 
 	        	scnr.nextLine();
         	}
     		displayPassengerMenu();
 	        menuInput = scnr.nextLine();
 	        if(menuInput.equals("1")) {
 	    		addPassenger();
 	    		runCount = runCount + 1;
 	    	}
 	    	else if(menuInput.equals("2")) {
 	    		editPassenger();
 	    		runCount = runCount + 1;
 	    	}
 	    	else if(menuInput.equals("3")) {
	    		printPassengerList();
 	    		runCount = runCount + 1;
 	    	}
 	    	else if (menuInput.equals("4")) {
 	    		printPassengerListofCruise();
 	    		runCount = runCount + 1;
 	    	}
 	    	else if(!(menuInput.equalsIgnoreCase("x"))){
 	    		System.out.println("You did not enter a valid input. Please try again. ");
 	    		runCount = runCount + 1;
 	    	}
     	
         }while(!(menuInput.equals("x")));
    	 
    	 menuFraming();
    }

    //controls user input for the calculator menu framing
    public static void calculatorMenuFraming() {
    	Scanner scnr = new Scanner(System.in);
    	String menuInput;
    	int runCount = 0;
    	
    	 do {

         	/*Add this so the displayed message isn't instantly hidden by the menu 
         	 *when returning to the menu (does not run first instance of the menu) -E.H. 
         	 */
         	if(runCount != 0) {
 	        	System.out.println("\nPress enter to continue"); 
 	        	scnr.nextLine();
         	}
     		displayCalculatorMenu();
 	        menuInput = scnr.nextLine();
 	        if(menuInput.equals("1")) {
 	    		rmPricingFromCur("");
 	    		runCount = runCount + 1;
 	    	}
 	    	else if(menuInput.equals("2")) {
 	    		rmPricingFromCur("Expected");
 	    		runCount = runCount + 1;
 	    	}
 	    	else if(menuInput.equals("3")) {
 	    		rmPricingFromExpAdv("");
 	    		runCount = runCount + 1;
 	    	}
 	    	else if(!(menuInput.equalsIgnoreCase("x"))){
 	    		System.out.println("You did not enter a valid input. Please try again. ");
 	    		runCount = runCount + 1;
 	    	}
     	
         }while(!(menuInput.equals("x")));
    	 
    	 menuFraming();
    }

    // display text-based menu for various menus
    public static void displayMenu() {

        System.out.println("\n\n");
        System.out.println("\t\tLuxury Ocean Cruise Outings");
        System.out.println("\t\t\tSystem Menu\n");
        System.out.println("[1] Ship Menu");
        System.out.println("[2] Cruise Menu");
        System.out.println("[3] Passenger Menu");
        System.out.println("[4] Calculator Menu");
        System.out.println("[x] Exit System");
        System.out.println("\nEnter a menu selection: ");
    }
    
    public static void displayShipMenu() {
        System.out.println("\n\n");
        System.out.println("\t\tLuxury Ocean Cruise Outings");
        System.out.println("\t\t\t Ship Menu\n");
        System.out.println("[1] Add Ship");
        System.out.println("[2] Edit Ship");
        System.out.println("[3] Print Ship Names");
        System.out.println("[4] Print Ship in Service List");
        System.out.println("[5] Print Ship in Service without a Cruise");
        System.out.println("[6] Print Ship Detailed List");
        System.out.println("[x] Return to System Menu");
        System.out.println("\nEnter a menu selection: ");
    }
    public static void displayCruiseMenu() {
        System.out.println("\n\n");
        System.out.println("\t\tLuxury Ocean Cruise Outings");
        System.out.println("\t\t\tCruise Menu\n");
        System.out.println("[1] Add Cruise");
        System.out.println("[2] Edit Cruise");
        System.out.println("[3] Print Cruise List");
        System.out.println("[4] Print Cruise Detailed List");
        System.out.println("[5] Print Passenger List by Cruise");
        System.out.println("[6] Print Cruises By Profit");
        System.out.println("[x] Return to System Menu");
        System.out.println("\nEnter a menu selection: ");
    }
    public static void displayPassengerMenu() {
        System.out.println("\n\n");
        System.out.println("\t\tLuxury Ocean Cruise Outings");
        System.out.println("\t\t\tPassenger Menu\n");
        System.out.println("[1] Add Passenger");
        System.out.println("[2] Edit Passenger");
        System.out.println("[3] Print Passenger List");
        System.out.println("[4] Print Passenger List by Cruise");
        System.out.println("[x] Return to System Menu");
        System.out.println("\nEnter a menu selection: ");
    }

    public static void displayCalculatorMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\tLuxury Ocean Cruise Outings");
        System.out.println("\t\t\t\t\tCalculator Menu\n");
        System.out.println("[1] Room Pricing given Current Passengers");
        System.out.println("[2] Room Pricing given Expected Passengers");
        System.out.println("[3] Mock Customer Simulator");
        System.out.println("[x] Exit System");
        System.out.println("\nEnter a menu selection: ");
    }

    //gets the room price 
    //can be passed expected if user will pass the expected number of passengers
    public static void rmPricingFromCur(String tType) {
    	Scanner scnr = new Scanner(System.in);
    	System.out.println("Enter the new cruise's name: ");
    	String cruiseEntry = scnr.nextLine();
    	String cruise = "";

    	String type = tType;
    	boolean cycled = false;
    	
    	//Ship data
    	String shipName = "";
    	
    	double shipDepC = 0;
    	double shipCPM = 0;
    	double shipRmCPM = 0;
    	
    	double shipBalcP = 0;
    	double shipOVP = 0;
    	double shipSuiteP = 0;
    	double shipIntP = 0;
    	
    	

    	double totalMiles = 0;

    	int bookedBalc = 0;
    	int bookedOceanV = 0;
    	int bookedSuite = 0;
    	int bookedInt = 0;
    	
    	int shipAvBalc = 0;
    	int shipAvOV = 0;
    	int shipAvSuite = 0;
    	int shipAvInt = 0;
    	
    	double singleBalcIncome = 0;
    	double singleOVIncome = 0;
    	double singleSuiteIncome = 0;
    	double singleIntIncome = 0;
    	
    	double netBalcIncome = 0; //set
    	double netOVIncome = 0;
    	double netSuiteIncome = 0;
    	double netIntIncome = 0;
    	
    	double addRmFee = 0;
    	
    	double addCruiseCost = 0;
    	
    	double totalIncome = 0; //set
    	double totalCost = 0;
    	double totalProfit = 0;
    	double profitPerc = 0;
    	
    	
    	double desiredProfitPerc = 0;
    	double profitPercDif = 0;
    	double profitPercOld = 0;
    
    	double profitPercUse = 0;
    	double desiredProfitPercUse = 0;
    	String passengerRm = "";
    	double newShipBalcPrice = 0;
    	double newShipOceanVPrice = 0;
    	double newShipSuitePrice = 0;
    	double newShipIntPrice = 0;
    	
    	int expectedBookedBalc = 0;
    	int expectedBookedOV = 0;
    	int expectedBookedSuite = 0;
    	int expectedBookedInt = 0;
    	
    	boolean cruiseFound = false;
    	
    	
    	//uses the cruise name to find the cruise
    	for(int i = 0; i < cruiseList.size();i ++) {
    		if(cruiseList.get(i).getCruiseName().equals(cruiseEntry)) {
    			cruise = cruiseEntry;
    			cruiseFound = true;
    		}
    	}
    	if(cruiseFound == false) {
    		System.out.println("Cruise not found. Exiting");
    		return;
    	}
    	
    	
    	//gets ship data via the cruise name
    	//cruises HAVE to have a ship associated with them
    	//since a cruise was found at this point, so too will a ship be found
    	for(int i = 0; i < cruiseList.size(); i ++) {
    		if(cruiseList.get(i).getCruiseName().equals(cruiseEntry)) {
    			shipName = cruiseList.get(i).getCruiseShipName();
    			for(int j = 0; j < shipList.size(); j ++) {
    				if(shipName.equals(shipList.get(j).getShipName())) {
    					shipDepC = shipList.get(j).getDepartureCost();
    					shipCPM = shipList.get(j).getCPM();
    					shipBalcP = shipList.get(j).getPriceBalcony();
    					shipOVP = shipList.get(j).getPriceOceanV();
    					shipSuiteP = shipList.get(j).getPriceSuite();
    					shipIntP = shipList.get(j).getPriceInterior();
    					shipAvBalc = shipList.get(j).getRoomBalcony();
    					shipAvOV = shipList.get(j).getRoomOceanView();
    					shipAvSuite = shipList.get(j).getRoomSuite();
    					shipAvInt = shipList.get(j).getRoomInterior();
    				}
    			}
    		}
    	}
    	

    	


    	//gets number of booked rooms of each time, the income from each room, etc
    	for(int i = 0; i < cruiseList.size(); i ++) {
    		if(cruiseList.get(i).getCruiseName().equals(cruise)) {
    			//Gets prices
    			addRmFee = cruiseList.get(i).getAddRoomFee();
    			singleBalcIncome = shipBalcP + addRmFee;
    			singleOVIncome = shipOVP + addRmFee;
    			singleSuiteIncome = shipSuiteP + addRmFee;
    			singleIntIncome = shipIntP + addRmFee;
    			totalMiles = cruiseList.get(i).getTotalMiles();
    			addCruiseCost = cruiseList.get(i).getAddCruiseCost();
    			
       			for(int j = 0; j < passengerList.size(); j++) {
    				if(passengerList.get(j).getPassengerCruise().equals(cruise)) {
    					//go through each room type
    					passengerRm = passengerList.get(j).getPassengerRoomType();
    			   		if(passengerRm.equals("BAL")) {
    			   			bookedBalc = bookedBalc + 1;
    			   			
    		    			
    		    			netBalcIncome = netBalcIncome + singleBalcIncome;
    		    			
    		    		} 
    		    		else if(passengerRm.equals("OV")){
    		    			bookedOceanV = bookedOceanV + 1;
    		    			netOVIncome = netOVIncome + singleOVIncome;
    		    		} 
    		    		else if(passengerRm.equals("STE")) {
    		    			bookedSuite = bookedSuite + 1;
    		    			netSuiteIncome = netSuiteIncome + singleSuiteIncome;
    		    		}
    		    		else if(passengerRm.equals("INT")) {
    		    			bookedInt = bookedInt + 1;
    		    			passengerList.get(j).setPassengerCost(singleIntIncome);
    		    			netIntIncome = netIntIncome + singleIntIncome;
    		    		} 
    				}
    			}


       			//set final vars then pass all to cruise
    			totalIncome = netBalcIncome + netOVIncome + netSuiteIncome + netIntIncome;
    			totalCost = shipDepC + (shipCPM * totalMiles) + addCruiseCost;
    			totalProfit = totalIncome - totalCost;
    			profitPerc = (totalIncome / totalCost) * 100 - 100;
    			profitPercOld = profitPerc;
    	    	
    			
    			//used when using an expected number of passengers instead of current number of passengers
       	     	if(type.equals("Expected")) {
       	     		
       	     		System.out.println("Enter the expected number of Balcony rooms");
       	     		cycled = false;
       	    		do {
       	    			if((expectedBookedBalc < 0 || expectedBookedBalc > shipAvBalc) && cycled == true ) {
       	    				System.out.println("Either negative or greater than availible balcony rooms. Try again.");
       	    			}
       	    			while(!scnr.hasNextInt()) {
       	    				System.out.println("Interegers only please!");
       	    				scnr.next();
       	    			}
       	    			cycled = true;
       	    			expectedBookedBalc = scnr.nextInt();
       	    			
       	    		}while (expectedBookedBalc < 0 || expectedBookedBalc > shipAvBalc);
       	    		
       	     		System.out.println("Enter the expected number of Ocean View rooms");
       	     		cycled = false;
       	    		do {
       	    			if((expectedBookedOV < 0 || expectedBookedOV > shipAvOV) && cycled == true ) {
       	    				System.out.println("Either negative or greater than availible Ocean View rooms. Try again.");
       	    			}
       	    			while(!scnr.hasNextInt()) {
       	    				System.out.println("Interegers only please!");
       	    				scnr.next();
       	    			}
       	    			cycled = true;
       	    			expectedBookedOV = scnr.nextInt();
       	    			
       	    		}while (expectedBookedOV < 0 || expectedBookedOV > shipAvOV);
       	    		
       	     		System.out.println("Enter the expected number of Suite rooms");
       	     		cycled = false;
       	    		do {
       	    			if((expectedBookedSuite < 0 || expectedBookedSuite > shipAvSuite) && cycled == true ) {
       	    				System.out.println("Either negative or greater than availible Suite rooms. Try again.");
       	    			}
       	    			while(!scnr.hasNextInt()) {
       	    				System.out.println("Interegers only please!");
       	    				scnr.next();
       	    			}
       	    			cycled = true;
       	    			expectedBookedSuite = scnr.nextInt();
       	    			
       	    		}while (expectedBookedSuite < 0 || expectedBookedSuite > shipAvSuite);
       	    		
       	    		
       	     		System.out.println("Enter the expected number of Interior rooms");
       	     		cycled = false;
       	    		do {
       	    			if((expectedBookedInt < 0 || expectedBookedInt > shipAvInt) && cycled == true ) {
       	    				System.out.println("Either negative or greater than availible Interior rooms. Try again.");
       	    			}
       	    			while(!scnr.hasNextInt()) {
       	    				System.out.println("Interegers only please!");
       	    				scnr.next();
       	    			}
       	    			cycled = true;
       	    			expectedBookedInt = scnr.nextInt();

       	    			
       	    		}while (expectedBookedInt < 0 || expectedBookedInt > shipAvInt);
       	    		//recalculates these vals
       	    		netBalcIncome = expectedBookedBalc * singleBalcIncome;
       	    		netOVIncome = expectedBookedOV * singleOVIncome;
       	    		netSuiteIncome = expectedBookedSuite * singleSuiteIncome;
       	    		netIntIncome = expectedBookedInt * singleIntIncome;

       	    		
       	     	}

   	    		
    			//set final vars then pass all to cruise
    			totalIncome = netBalcIncome + netOVIncome + netSuiteIncome + netIntIncome;
    			totalCost = shipDepC + (shipCPM * totalMiles) + addCruiseCost;
    			totalProfit = totalIncome - totalCost;
    			profitPerc = (totalIncome / totalCost) * 100 - 100;

    			
    			

    		}
    	}
    	
    	
    	cycled = false;

     	System.out.println("Enter the new cruise's desired profit percent: ");

     	//gathers the users desirved profit amount
    	
     	do{
     		if (cycled == true && (desiredProfitPerc < -900000 || desiredProfitPerc > 900000)) {
     			System.out.println("Profit Percent out of expected range, try again.");
     		}
         	while(!scnr.hasNextDouble()) {
         		System.out.println("Profit Percent is double only, try again.");
         		scnr.next();
         	}
         	

         	cycled = true;
         	scnr.nextLine();
         	desiredProfitPerc = scnr.nextDouble();
         	

         	
     	} while(desiredProfitPerc < -900000 || desiredProfitPerc > 900000);


     	
     	
     	
     	desiredProfitPercUse = (desiredProfitPerc + 100) / 100;
    	profitPercUse = (profitPerc + 100) / 100;
    	//checks for devisor issue
    	if(desiredProfitPercUse != 0) {
        	profitPercDif = desiredProfitPercUse / profitPercUse;
    	} else {
    		System.out.println("Cannot devide by 0 error. ProfitPerc is: " + profitPerc );
    		return;
    	}
    	
    	
    	double expectedTotalIncome = 0;
		double expectedTotalProfit = 0;
		double expectedProfitPerc = 0;
		double cCost = 0;
		
		//calculates the expected total income
    	if(profitPercDif != 0) {
    		newShipBalcPrice = (singleBalcIncome * profitPercDif) - addRmFee;
    		newShipOceanVPrice = (singleOVIncome * profitPercDif) - addRmFee;
    		newShipSuitePrice = (singleSuiteIncome * profitPercDif) - addRmFee;
    		newShipIntPrice = (singleIntIncome * profitPercDif) - addRmFee;
    		
    		newShipBalcPrice = Math.round(newShipBalcPrice * 100.0) / 100.0;
    		newShipOceanVPrice = Math.round(newShipOceanVPrice * 100.0) / 100.0;
    		newShipSuitePrice = Math.round(newShipSuitePrice * 100.0) / 100.0;
    		newShipIntPrice = Math.round(newShipIntPrice * 100.0) / 100.0;
    		
    	    expectedTotalIncome = ((newShipBalcPrice + addRmFee) * expectedBookedBalc) + ((newShipOceanVPrice + addRmFee) * expectedBookedOV) + 
    				((newShipSuitePrice + addRmFee) * expectedBookedSuite) + ((newShipIntPrice + addRmFee) * expectedBookedInt);
    	    for(int i = 0; i < cruiseList.size(); i ++) {
    	    	if(cruiseList.get(i).getCruiseName().equals(cruise)) {
    	    		cCost = cruiseList.get(i).getCruiseTotalCost();
    	    	}
    	    }
    		expectedTotalProfit = expectedTotalIncome - cCost;
    		expectedProfitPerc = (expectedTotalIncome / cCost) * 100 - 100;

    		


    	} else {
    		System.out.println("No change in profit, exiting.");
    		return;
    	}
    	
    	//displaces new suggested pricing
    	System.out.println("New balcony price: $" + newShipBalcPrice);
    	System.out.println("New Ocean View price: $" + newShipOceanVPrice);
    	System.out.println("New Suite Price: $" + newShipSuitePrice);
    	System.out.println("New Interior Price: $" + newShipIntPrice);
    	String userChoice = "";
    	cycled = false;
    	
    	
    	//ASKS IF THE USER WISHES TO CHANGE THE PRICING TO MATCH THE NEW DISPLAYED ROOM PRICING BASED ON THE CALCULATIONS
    	 do {
    		 
 			if( ( !(userChoice.equals("Y")) || !(userChoice.equals("N")) ) && cycled == true ) {
				System.out.println("You did not enter Y or N.");
			}
 			
 	    	System.out.println("Do you accept these changes? Y/N");
 	    	
 	    	//GIVES A WARNING
 	    	//IF A USER CHANGES PRICING BASED ON EXPECTED CUSTOMER COUNT, 
 	    	//END EXCEPT THE NEW CHANGES, THEN WHEN THEY CHECK THE CRUISE INFO AGAIN,
 	    	//THE PROFIT WILL MOST LIKELY BE MUCH DIFFERENT THEN THE PROFIT BASED OFF THE SUGGESTED ROOM PRICING
 	    	if(type.equals("Expected")) {
 	    		System.out.println("CHANGING THESE COULD LEAD TO SEVERE PROFIT LOSS IF EXPECTED PASSENGERS ARE NOT MET\r\nARE YOU SURE?");
 	    	}

    		cycled = true;
    		userChoice = scnr.next().toUpperCase();
    		scnr.nextLine();




         } while(!( userChoice.equals("Y") || userChoice.equals("N")));
    	 
    	 
    	 
    	 if(userChoice.equalsIgnoreCase("Y")) {
    		 for(int i = 0; i < shipList.size(); i ++) {
    			 if(shipList.get(i).getShipName().equals(shipName)) {
    				 shipList.get(i).setPriceBalcony(newShipBalcPrice);
    				 shipList.get(i).setPriceOceanV(newShipOceanVPrice);
    				 shipList.get(i).setPriceSuite(newShipSuitePrice);
    				 shipList.get(i).setPriceInterior(newShipIntPrice);
    			 }
    		 }
    	 } else if(userChoice.equalsIgnoreCase("N") && !(type.equals("Expected"))){
    		 System.out.println("Exiting");
    		 return;
    	 }
    	 //UPDATES CRUISE
		 cruiseCostProfitSetter(cruise);

    	 double profitValid = 0;
    	 for(int i = 0; i < cruiseList.size(); i ++) {
    		 if(cruiseList.get(i).getCruiseName().equals(cruise)) {
    			 profitValid = cruiseList.get(i).getProfitPerc();
    		 }
    	 }
    	 
    	 
    	 int test = 0;
 	  	 String rounded = String.format("%.2f", profitPercOld);
 	  	 String rounded2 = String.format("%.2f", profitValid);
 	  	 String rounded3 = String.format("%.2f", expectedProfitPerc);
 	  	 
 	  	 
    	 if(type.equals("Expected")) {
    		 int totalB = bookedBalc + bookedOceanV + bookedSuite + bookedInt;
    		 int expB = expectedBookedBalc + expectedBookedOV + expectedBookedSuite + expectedBookedInt;
    		 int dif = expB - totalB;
    		 if(userChoice.equalsIgnoreCase("N")) {
    			 System.out.println("NEW EXPECTED PROFIT NOT APPLIED");
    		 }
    		 System.out.println(cruise + " currently has " + totalB +  " passengers. \r\nTo meet expected passenger count and desired profit, would need " + dif + " new passengers.");
        	 System.out.println("Previous profit: " + rounded + "%. New Expected profit percent: " + rounded3 + "%. Current Profit " + rounded2 + "%");
    	 } else {
        	 System.out.println("Previous profit: " + rounded + "%. New profit percent: " + rounded2 + "%");

    	 }



    
    	
    }
    
    //USED TO CALCULATE RANDOM NUMS
    public static double random_double(double min, double max) {
    	Random random = new Random();
        return random.nextDouble() * (max - min) + min;
    }
    
    
    //THIS IS A SIMULATOR
    //WILL SIMULATE CUSTOMER COUNT AND RANGES
    //THEN WILL MAKE A SUGGESTED PRICING BASED ON THE GIVEN CUSTOMER COUNT & RANGE
    public static void rmPricingFromExpAdv(String tType) {
    	ArrayList<Cruise> simulatorCruiseList = new ArrayList<>(cruiseList);
    	ArrayList<Ship> pricingShip = new ArrayList<>(shipList);
    	ArrayList<Passenger> simulatorPassengerList = new ArrayList<>(passengerList);

    	Random rand = new Random();
    	int upperBound = 101;
    	
    	Scanner scnr = new Scanner(System.in);
    	System.out.println("Enter the cruise's name: ");
    	String cruiseEntry = scnr.nextLine();

    	String type = tType;
    	boolean cycled = false;
    	
    	//Ship data
    	String shipName = "";
    	
    	double shipDepC = 0;
    	double shipCPM = 0;
    	double shipRmCPM = 0;
    	
    	double shipBalcP = 0;
    	double shipOVP = 0;
    	double shipSuiteP = 0;
    	double shipIntP = 0;
    	
    	

    	double totalMiles = 0;

    	int bookedBalc = 0;
    	int bookedOceanV = 0;
    	int bookedSuite = 0;
    	int bookedInt = 0;
    	
    	int shipAvBalc = 0;
    	int shipAvOV = 0;
    	int shipAvSuite = 0;
    	int shipAvInt = 0;
    	
    	double singleBalcIncome = 0;
    	double singleOVIncome = 0;
    	double singleSuiteIncome = 0;
    	double singleIntIncome = 0;
    	
    	double netBalcIncome = 0; //set
    	double netOVIncome = 0;
    	double netSuiteIncome = 0;
    	double netIntIncome = 0;
    	
    	double addRmFee = 0;
    	
    	double addCruiseCost = 0;
    	
    	double totalIncome = 0; //set
    	double totalCost = 0;
    	double totalProfit = 0;
    	double profitPerc = 0;
    	
    	
    	double desiredProfitPerc = 0;
    	double profitPercDif = 0;
    	double profitPercOld = 0;
    
    	double profitPercUse = 0;
    	double desiredProfitPercUse = 0;
    	String passengerRm = "";
    	double newShipBalcPrice = 0;
    	double newShipOceanVPrice = 0;
    	double newShipSuitePrice = 0;
    	double newShipIntPrice = 0;
    	
    	int expectedBookedBalc = 0;
    	int expectedBookedOV = 0;
    	int expectedBookedSuite = 0;
    	int expectedBookedInt = 0;
    	
    	
    	
    	
    	
    	int cruiseIndex = 0;
    	int shipIndex = 0;
    	//TESTS IF CRUISE LIST IS POPULATED
    	cruiseIndex = getCruiseIndex(cruiseEntry);
    	if(cruiseIndex == -1) {
    		System.out.println("Cruise not found. Exiting");
    		return;
    	}
    	//
    	shipIndex = getShipIndex(cruiseList.get(cruiseIndex).getCruiseShipName());
    	if(shipIndex == -1) {
    		System.out.println("Ship not found. Exiting");
    		return;
    	} else {
    		shipName = cruiseList.get(cruiseIndex).getCruiseShipName();
    	}
    	shipAvBalc = shipList.get(shipIndex).getRoomBalcony();
    	shipAvOV = shipList.get(shipIndex).getRoomOceanView();
    	shipAvSuite = shipList.get(shipIndex).getRoomSuite();
    	shipAvInt = shipList.get(shipIndex).getRoomInterior();
    	double shipAvTotal = shipAvBalc + shipAvOV + shipAvSuite + shipAvInt;
    	
    	int simulatedPassengers = 0;
    	int overBooked = 0;
    	int tooExpensive = 0;
    	int gBalcRat = 0;
    	int gOVRat = 0;
    	int gSuiteRat = 0;
    	int gIntRat = 0;
    	int remaining = 100;
    	double balcP = 0;
    	double OVp = 0;
    	double suiteP = 0;
    	double intP = 0;
    	double dBP = 0;
    	
    	
    	System.out.println("Enter the number of simulated passengers");
    	cycled = false;
   		do {
   			if((simulatedPassengers < 0 || simulatedPassengers > 1000) && cycled == true ) {
   				System.out.println("Either negative or greater than 1000. Try again.");
   			}
   			while(!scnr.hasNextInt()) {
   				System.out.println("Interegers only please!");
   				scnr.next();
   			}
   			cycled = true;
   			simulatedPassengers = scnr.nextInt();
   			
   		}while (simulatedPassengers < 0 || simulatedPassengers > 1000);
   		
   		singleBalcIncome = getRoomCostByCruise("BAL", cruiseEntry);
   		singleOVIncome = getRoomCostByCruise("OV", cruiseEntry);
   		singleSuiteIncome = getRoomCostByCruise("STE", cruiseEntry);
   		singleIntIncome = getRoomCostByCruise("INT", cruiseEntry);
    	
    	//max price
    	double balcMaxP = 0;
    	double ovMaxP = 0;
    	double suiteMaxP = 0;
    	double intMaxP = 0;
    	//variance
    	double balcUp = 0;
    	double balcD = 0;
    	double ovUp = 0;
    	double ovD = 0;
    	double suiteUp = 0;
    	double suiteD = 0;
    	double intUp = 0;
    	double intD = 0;
    	double variance = 0;

    	//RATIO CAN MAKE BE 100, EACH TIME A RATIO IS ADDED, THAT IS TAKEN FROM TOTAL (STARTING AT 100)
   
    	System.out.println("Enter the ratio (0% - " + remaining + "%) of simulated passengers that are interested in BALCONY rooms" );
    	cycled = false;
   		do {
   			if((gBalcRat < 0 || gBalcRat >  remaining) && cycled == true ) {
   				System.out.println("Either negative or greater than " + remaining + "%. Try again.");
   			}
   			while(!scnr.hasNextInt()) {
   				System.out.println("Doubles only please!");
   				scnr.next();
   			}
   			cycled = true;
   			gBalcRat = scnr.nextInt();
   			
   		}while (gBalcRat < 0 || gBalcRat > remaining);
    	
   		
   		remaining = remaining - gBalcRat;
   		
    	System.out.println("Enter the ratio (0% - " + remaining + "%) of simulated passengers that are interested in OCEAN VIEW rooms" );
    	cycled = false;
   		do {
   			if((gOVRat < 0 || gOVRat >  remaining) && cycled == true ) {
   				System.out.println("Either negative or greater than " + remaining + "%. Try again.");
   			}
   			while(!scnr.hasNextInt()) {
   				System.out.println("Doubles only please!");
   				scnr.next();
   			}
   			cycled = true;
   			gOVRat = scnr.nextInt();
   			
   		}while (gOVRat < 0 || gOVRat > remaining);
    	
   		remaining = remaining - gOVRat;
   		
    	System.out.println("Enter the ratio (0% - " + remaining + "%) of simulated passengers that are interested in SUITE rooms" );
    	cycled = false;
   		do {
   			if((gSuiteRat < 0 || gSuiteRat >  remaining) && cycled == true ) {
   				System.out.println("Either negative or greater than " + remaining + "%. Try again.");
   			}
   			while(!scnr.hasNextInt()) {
   				System.out.println("Doubles only please!");
   				scnr.next();
   			}
   			cycled = true;
   			gSuiteRat = scnr.nextInt();
   			
   		}while (gSuiteRat < 0 || gSuiteRat > remaining);
   		
   		
   		remaining = remaining - gSuiteRat;
   		gIntRat = remaining;

   		
   		//GETS THE MAX AMOUNT THE AVERAGE CUSTOMER OF EACH ROOM INTEREST IS WILLING TO PAY
    	System.out.println("Enter the maximum amount the average Balcony Customer is willing to spend.\r\nCurrent Balcony Price: $" + singleBalcIncome );
    	cycled = false;
   		do {
   			if((balcMaxP < 0 || balcMaxP >  2000000) && cycled == true ) {
   				System.out.println("Price out of range, try again.");
   			}
   			while(!scnr.hasNextDouble()) {
   				System.out.println("Doubles only please!");
   				scnr.next();
   			}
   			cycled = true;
   			balcMaxP = scnr.nextDouble();
   			
   		}while (balcMaxP < 0 || balcMaxP > 2000000);
    	
   		
   		System.out.println("Enter the maximum amount the average Ocean View Customer is willing to spend.\r\nCurrent Ocean View Price: $" + singleOVIncome );
    	cycled = false;
   		do {
   			if((ovMaxP < 0 || ovMaxP >  2000000) && cycled == true ) {
   				System.out.println("Price out of range, try again.");
   			}
   			while(!scnr.hasNextDouble()) {
   				System.out.println("Doubles only please!");
   				scnr.next();
   			}
   			cycled = true;
   			ovMaxP = scnr.nextDouble();
   			
   		}while (ovMaxP < 0 || ovMaxP > 2000000);
   		
   		System.out.println("Enter the maximum amount the average Suite Customer is willing to spend.\r\nCurrent Suite Price: $" + singleSuiteIncome );
    	cycled = false;
   		do {
   			if((suiteMaxP < 0 || suiteMaxP >  2000000) && cycled == true ) {
   				System.out.println("Price out of range, try again.");
   			}
   			while(!scnr.hasNextDouble()) {
   				System.out.println("Doubles only please!");
   				scnr.next();
   			}
   			cycled = true;
   			suiteMaxP = scnr.nextDouble();
   			
   		}while (suiteMaxP < 0 || suiteMaxP > 2000000);
   		
   		System.out.println("Enter the maximum amount the average Interior Customer is willing to spend.\r\nCurrent Int Price: $" + singleOVIncome );
    	cycled = false;
   		do {
   			if((intMaxP < 0 || intMaxP >  2000000) && cycled == true ) {
   				System.out.println("Price out of range, try again.");
   			}
   			while(!scnr.hasNextDouble()) {
   				System.out.println("Doubles only please!");
   				scnr.next();
   			}
   			cycled = true;
   			intMaxP = scnr.nextDouble();
   			
   		}while (intMaxP < 0 || intMaxP > 2000000);
   		
   		System.out.println("Enter the maximum amount of variance the customers max amount will be (0-100%)");
    	cycled = false;
   		do {
   			if((variance < 0 || variance >  100) && cycled == true ) {
   				System.out.println("Variance out of range, try again.");
   			}
   			while(!scnr.hasNextDouble()) {
   				System.out.println("Doubles only please!");
   				scnr.next();
   			}
   			cycled = true;
   			variance = scnr.nextDouble();
   			
   		}while (variance < 0 || variance > 100);
   		variance = variance / 100;
   		
   		balcUp = balcMaxP + (balcMaxP * variance);
   		balcD = balcMaxP - (balcMaxP * variance);
   		
   		ovUp = ovMaxP + (ovMaxP * variance);
   		ovD = ovMaxP - (ovMaxP * variance);
   		
   		suiteUp = suiteMaxP + (suiteMaxP * variance);
   		suiteD = suiteMaxP - (suiteMaxP * variance);
   		
   		intUp = intMaxP + (intMaxP * variance);
   		intD = intMaxP - (intMaxP * variance);
   		
   		String passN = "";
   		String passR = "";
   		int passCounter = 0;
   		int bookedC = 0;
   		double passCost = 0;
   		simulatorPassengerList.clear();
   		int random = 0;
   		double maxRandom = 0;
   		boolean hasRoom = true;
   		boolean canAfford = true;

   		simulatorCruiseList.get(cruiseIndex).setBookedBalcony(0);
   		simulatorCruiseList.get(cruiseIndex).setBookedOcean(0);
   		simulatorCruiseList.get(cruiseIndex).setBookedSuite(0);
   		simulatorCruiseList.get(cruiseIndex).setBookedInterior(0);
   		
   		
   		//GETS PRICE BY EACH ROOM TYPE, CALCULATED WITH THE SIMULATOR
   		for(int i = 0; i < simulatedPassengers; i++) {
   			random = rand.nextInt(upperBound);
	   		passCounter += 1;
   			passN = "Customer " + passCounter;
   			hasRoom = true;
   			canAfford = true;
   			if(random <= gBalcRat) {
   				passR = "BAL";
   				passCost = getRoomCostByCruise(passR,cruiseEntry );
   				maxRandom = random_double(balcUp, balcD);
   				if(shipAvBalc <=  simulatorCruiseList.get(cruiseIndex).getBookedBalcony()) {
   					overBooked += 1;
   					hasRoom = false;
   				} else if(singleBalcIncome > maxRandom ) {
   					tooExpensive += 1;
   					canAfford = false;
   				}
   				else {
   					simulatorCruiseList.get(cruiseIndex).setBookedBalcony( (simulatorCruiseList.get(cruiseIndex).getBookedBalcony() + 1));
   					bookedC += 1;
   				}
   		  
   			} else if(random <= (gBalcRat + gOVRat)) {
   				passR = "OV";
   				passCost = getRoomCostByCruise(passR,cruiseEntry );
   				maxRandom = random_double(ovUp, ovD);

   				if(shipAvOV <=  simulatorCruiseList.get(cruiseIndex).getBookedOcean()) {
   					overBooked += 1;
   					hasRoom = false;
   				} else if(singleOVIncome > maxRandom) {
   					tooExpensive += 1;
   					canAfford = false;
   				}
   				else {
   					simulatorCruiseList.get(cruiseIndex).setBookedOcean( (simulatorCruiseList.get(cruiseIndex).getBookedOcean() + 1));
   					bookedC += 1;

   				}

   			} else if(random <= (gBalcRat + gOVRat + gSuiteRat)) {
   				passR = "STE";
   				passCost = getRoomCostByCruise(passR,cruiseEntry );
   				maxRandom = random_double(suiteUp, suiteD);

   				if(shipAvSuite <=  simulatorCruiseList.get(cruiseIndex).getBookedSuite()) {
   					overBooked += 1;
   					hasRoom = false;
   				} else if(singleSuiteIncome > maxRandom) {
   					tooExpensive += 1;
   					canAfford = false;
   				} 
   				else {
   					simulatorCruiseList.get(cruiseIndex).setBookedSuite( (simulatorCruiseList.get(cruiseIndex).getBookedSuite() + 1));
   					bookedC += 1;

   				}


   			} else {
   				passR = "INT";
   				passCost = getRoomCostByCruise(passR,cruiseEntry );
   				maxRandom = random_double(intUp, intUp);
   				if(shipAvInt <=  simulatorCruiseList.get(cruiseIndex).getBookedInterior()) {
   					overBooked += 1;
   					hasRoom = false;
   				}else if(singleIntIncome > maxRandom) {
   					tooExpensive += 1;
   					canAfford = false;
   				}  
   				else {
   					simulatorCruiseList.get(cruiseIndex).setBookedInterior((simulatorCruiseList.get(cruiseIndex).getBookedInterior() + 1));
   					bookedC += 1;

   				}


   			}
   			//CUSTOM PRINT OPTIONS FOR POPULATING THE SIMULATOR
   			if(hasRoom == true && canAfford == true) {
   	   			Passenger newPassenger = new Passenger(passN, cruiseEntry, passR, shipName, passCost);
   	   			System.out.println("\r\nAdding: "+ passN);
   	   			System.out.println("Cruise Ship: " + cruiseEntry);
   	   			System.out.println("Room Type: " + passR);
   	   			System.out.println("Ship Name: " + shipName);
   	   			System.out.println("Cost of Room: " + passCost);
   	   			System.out.println("Max Spending Amount: " + maxRandom);
   	   			simulatorPassengerList.add(newPassenger);
   			} else if(hasRoom == false) {
   	   			System.out.println("\r\nCOULD NOT ADD: "+ passN);
   	   			System.out.println("Cruise Ship: " + cruiseEntry);
   	   			System.out.println("Room Type: " + passR);
   	   			System.out.println("Ship Name: " + shipName);
   	   			System.out.println("Cost of Room: " + passCost);
   	   			System.out.println("Max Spending Amount: " + maxRandom);
   	   			System.out.println("REASON: ROOM TYPE FULL");
   			} else if(canAfford == false) {
   	   			System.out.println("\r\nCOULD NOT ADD: "+ passN);
   	   			System.out.println("Cruise Ship: " + cruiseEntry);
   	   			System.out.println("Room Type: " + passR);
   	   			System.out.println("Ship Name: " + shipName);
   	   			System.out.println("Cost of Room: " + passCost);
   	   			System.out.println("Max Spending Amount: " + maxRandom);
   	   			System.out.println("REASON: COULD NOT AFFORD");
   			}

   		}
   		




   		//formators 
   		balcP = simulatorCruiseList.get(cruiseIndex).getBookedBalcony(); /// simulatedPassengers * 100;
   		int acBal = (int)balcP;
   		balcP = (balcP / simulatedPassengers ) * 100;
   		String str1 = String.format("%.02f", balcP); 
   		
   		OVp = simulatorCruiseList.get(cruiseIndex).getBookedOcean() ;
   		int acOV = (int)OVp;
   		OVp = (OVp / simulatedPassengers) * 100;
   		String str2 = String.format("%.02f", OVp); 
   		
   		suiteP = simulatorCruiseList.get(cruiseIndex).getBookedSuite();
   		int acSuite = (int)suiteP;

   		suiteP = (suiteP / simulatedPassengers) * 100;
   		String str3 = String.format("%.02f", suiteP); 
   		
   		intP = simulatorCruiseList.get(cruiseIndex).getBookedInterior();
   		int acInt = (int)intP;
   		intP = (intP / simulatedPassengers) * 100;
   		String str4 = String.format("%.02f", intP); 
   		
   		dBP = 100 - (balcP + OVp + suiteP + intP);
   		String str5 = String.format("%.02f", dBP);
   		int acTot = acBal + acOV + acSuite + acInt;
   		
   		//prints out desired and simulated results
   		System.out.println("\r\n --------------------DESIRED ROOMS---------------------");
   		System.out.println("BALC: " + gBalcRat + ".00%  OV: " + gOVRat + ".00%  SUITE: " + gSuiteRat + ".00%  INT: " + gIntRat + "%");
   		System.out.println("\r\n -------------------BOOKED ROOMS----------------------");
   		System.out.println("BALC: " + str1 + "%  OV : " + str2 + "%  SUITE: " + str3 + "%  INT: " + str4 + "%");
   		
   		System.out.println("\r\nOf the " + simulatedPassengers + " potential customers, \r\n" + str1 +"% were balcony passengers (" +acBal+"), \r\n" 
   		+ str2 +"% were Ocean View passengers (" +acOV + "),\r\n" 
   		+ str3 +"% were Suite Passengers ("+ acSuite + "),\r\n" 
   		+ str4 +"% were interior passengers (" + acInt +")");
   		System.out.println("The remaining " + str5 + "% of customers did not sign up for the cruise(" + acTot + ")\r\n");
   		System.out.println((simulatedPassengers - bookedC) + " were not able to get booked for the cruise\r\n" 
   		+ tooExpensive + " couldn't because they couldn't afford, \r\n" + overBooked + " couldn't because that room type was already fully booked.\r\n");
   		System.out.println("-----------------------------------------------------------------------");
   		System.out.println(" CUSTOMER              CRUISE           SHIP                 ROOM            COST");
   		
   		for(int i = 0; i < simulatorPassengerList.size(); i++) {
   			simulatorPassengerList.get(i).printPassenger();
   		}



    	

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
        
    	//TODO FIX THESE ADD METHODS

        //All Validations passed; adds new ship to shipList
        Ship newShip = new Ship(newShipName, newRoomBalcon, newRoomOceanView, 
        		newRoomSuite, newRoomInterior, newInService, "None",  0, 0, 0, 0, 0, 0);
        shipList.add(newShip);
        
        //Completed by E.H., properly adds ship to array if all validations are passed

    }

    // Edit an existing ship
    public static void editShip() {

        // This method does not need to be completed
        System.out.println("The \"Edit Ship\" feature is not yet implemented.");

    }

    public static void cruiseCostProfitSetter(String cruiseN) {
    	
    	//Ship data
    	String shipName = "";
    	
    	double shipDepC = 0;
    	double shipCPM = 0;
    	double shipRmCPM = 0;
    	
    	double shipBalcP = 0;
    	double shipOVP = 0;
    	double shipSuiteP = 0;
    	double shipIntP = 0;
    	
    	
    	//Cruise data
    	String cruiseName = cruiseN;

    	double totalMiles = 0;

    	int bookedBalc = 0;
    	int bookedOceanV = 0;
    	int bookedSuite = 0;
    	int bookedInt = 0;
    	
    	double singleBalcIncome = 0;
    	double singleOVIncome = 0;
    	double singleSuiteIncome = 0;
    	double singleIntIncome = 0;
    	
    	double netBalcIncome = 0; //set
    	double netOVIncome = 0;
    	double netSuiteIncome = 0;
    	double netIntIncome = 0;
    	
    	double addRmFee = 0;
    	
    	double addCruiseCost = 0;
    	
    	double totalIncome = 0; //set
    	double totalCost = 0;
    	double totalProfit = 0;
    	double profitPerc = 0;
    	
    
    	String passengerRm = "";
    	//gets ship data
    	for(int i = 0; i < cruiseList.size(); i ++) {
    		if(cruiseList.get(i).getCruiseName().equals(cruiseName)) {
    			shipName = cruiseList.get(i).getCruiseShipName();
    			for(int j = 0; j < shipList.size(); j ++) {
    				if(shipName.equals(shipList.get(j).getShipName())) {
    					shipDepC = shipList.get(j).getDepartureCost();
    					shipCPM = shipList.get(j).getCPM();
    					shipBalcP = shipList.get(j).getPriceBalcony();
    					shipOVP = shipList.get(j).getPriceOceanV();
    					shipSuiteP = shipList.get(j).getPriceSuite();
    					shipIntP = shipList.get(j).getPriceInterior();
    				}
    			}
    		}
    	}
    	

    	
    	//Gets cruise data
    	for(int i = 0; i < cruiseList.size(); i ++) {
    		if(cruiseList.get(i).getCruiseName().equals(cruiseName)) {
    			//Gets prices
    			addRmFee = cruiseList.get(i).getAddRoomFee();
    			singleBalcIncome = shipBalcP + addRmFee;
    			singleOVIncome = shipOVP + addRmFee;
    			singleSuiteIncome = shipSuiteP + addRmFee;
    			singleIntIncome = shipIntP + addRmFee;
    			totalMiles = cruiseList.get(i).getTotalMiles();
    			addCruiseCost = cruiseList.get(i).getAddCruiseCost();
    			
    			//use local variables to neaten up 
    			//TODO
    			
    			for(int j = 0; j < passengerList.size(); j++) {
    				if(passengerList.get(j).getPassengerCruise().equals(cruiseName)) {
    					//go through each room type
    					passengerRm = passengerList.get(j).getPassengerRoomType();
    			   		if(passengerRm.equals("BAL")) {
    			   			bookedBalc = bookedBalc + 1;
    			   			
    		    			passengerList.get(j).setPassengerCost(singleBalcIncome);
    		    			
    		    			netBalcIncome = netBalcIncome + singleBalcIncome;
    		    			
    		    		} 
    		    		else if(passengerRm.equals("OV")){
    		    			bookedOceanV = bookedOceanV + 1;
    		    			passengerList.get(j).setPassengerCost(singleOVIncome);
    		    			netOVIncome = netOVIncome + singleOVIncome;
    		    		} 
    		    		else if(passengerRm.equals("STE")) {
    		    			bookedSuite = bookedSuite + 1;
    		    			passengerList.get(j).setPassengerCost(singleSuiteIncome);
    		    			netSuiteIncome = netSuiteIncome + singleSuiteIncome;
    		    		}
    		    		else if(passengerRm.equals("INT")) {
    		    			bookedInt = bookedInt + 1;
    		    			passengerList.get(j).setPassengerCost(singleIntIncome);
    		    			netIntIncome = netIntIncome + singleIntIncome;
    		    		} 
    				}
    			}
    			
    			//set final vars then pass all to cruise
    			totalIncome = netBalcIncome + netOVIncome + netSuiteIncome + netIntIncome;
    			totalCost = shipDepC + (shipCPM * totalMiles) + addCruiseCost;
    			totalProfit = totalIncome - totalCost;
    			profitPerc = (totalIncome / totalCost) * 100 - 100;
    			
    			cruiseList.get(i).setBalconyIncome(netBalcIncome);
    			cruiseList.get(i).setOceanVIncome(netOVIncome);
    			cruiseList.get(i).setSuiteIncome(netSuiteIncome);
    			cruiseList.get(i).setInteriorIncome(netIntIncome);
    			
    			
    			cruiseList.get(i).setBookedBalcony(bookedBalc);
    			cruiseList.get(i).setBookedOcean(bookedOceanV);
    			cruiseList.get(i).setBookedSuite(bookedSuite);
    			cruiseList.get(i).setBookedInterior(bookedInt);
    			
    			cruiseList.get(i).setTotalIncome(totalIncome);
    			cruiseList.get(i).setCruiseTotalCost(totalCost);
    			cruiseList.get(i).setNetProfit(totalProfit);
    			cruiseList.get(i).setProfitPerc(profitPerc);
    			
    			
    		}
    	}
    }
    //gets the cruise index
    public static int getCruiseIndex(String tCruiseN) {
    	String cruise = tCruiseN;
    	int index = -1;
    	for(int i = 0; i < cruiseList.size(); i ++){
    		if(cruiseList.get(i).getCruiseName().equals(tCruiseN)) {
    			index = i;
    		}
    	}
    	return index;
    }
    
    //gets the ships index
    public static int getShipIndex(String tShipN) {
    	String shipName = tShipN;
    	int index = -1;
    	for(int i = 0; i < shipList.size(); i ++) {
    		if(shipList.get(i).getShipName().equals(shipName)) {
    			index = i;
    		}
    	}
    	return index;
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
    	
    	//Adds total miles
     	double newCruiseTotalMiles = 0;
     	boolean cycled = false;
     	do{
     		if (cycled == true) {
     			System.out.println("Total miles out of expected range, try again.");
     		}
         	System.out.println("Enter the new cruise's total miles traveled: ");
         	while(!newCruiseInput.hasNextDouble()) {
         		System.out.println("Total miles is double only, try again.");
         		newCruiseInput.next();
         		
         	}
         	cycled = true;
         	newCruiseTotalMiles = newCruiseInput.nextInt();
     	} while(newCruiseTotalMiles < 0 || newCruiseTotalMiles > 4000000);
     	
     	
     	//Adds add. cost
     	double newCruiseAddCost = 0;
     	cycled = false;
     	do{
     		if (cycled == true) {
     			System.out.println("Additional cost out of expected range, try again.");
     		}
         	System.out.println("Enter the new cruise's additional costs: ");
         	while(!newCruiseInput.hasNextDouble()) {
         		System.out.println("Additional miles is double only, try again.");
         		newCruiseInput.next();
         	}
         	cycled = true;
         	newCruiseAddCost = newCruiseInput.nextInt();
     	} while(newCruiseAddCost < 0 || newCruiseAddCost > 4000000);
     	
     	//Adds add. room fee
     	double newCruiseAddRmFee = 0;
     	cycled = false;
     	do{
     		if (cycled == true) {
     			System.out.println("Additional room fee out of expected range, try again.");
     		}
         	System.out.println("Enter the new cruise's additional room fee: ");
         	while(!newCruiseInput.hasNextDouble()) {
         		System.out.println("Additional room fee is double only, try again.");
         		newCruiseInput.next();
         	}
         	cycled = true;
         	newCruiseAddRmFee = newCruiseInput.nextInt();
     	} while(newCruiseAddRmFee < 0 || newCruiseAddRmFee > 4000000);
     	
   
    	
     	

    	//All Validations passed; adds new cruise to CruiseList
    	Cruise newCruise = new Cruise(newCruiseName, newCruiseShipName, 
    			newCruiseDeparturePort, newCruiseDestination, newCruiseReturnPort, 0, 0, 0, 0, newCruiseTotalMiles, newCruiseAddCost, newCruiseAddRmFee, 0, 0, 0, 0, 0, 0, 0, 0);
    	cruiseList.add(newCruise);
    	cruiseCostProfitSetter(newCruiseName);


    	
    	//Completed by E.H.
    	
    }
    public static double getRoomCostByCruise(String tRmType, String tCruise) {
    	String cruise = tCruise;
    	String roomType = tRmType;
    	String ship = "";
    	double roomFee = 0;
    	double roomCost = 0;
    	double roomTotal = 0;
    	
    	

        //When ship is found, iterates through shipsList to find the room price and calculates it with room fees

        	//FINDS THE SHIP BY ITERATING THROUGH THE CRUISES
		for(int i = 0; i < cruiseList.size(); i ++) {
    		if(cruiseList.get(i).getCruiseName().equals(cruise)) {
    			roomFee = cruiseList.get(i).getAddRoomFee();
    			ship = cruiseList.get(i).getCruiseShipName();
    			
    			// BALCONY ROOMS
        		if(roomType.equals("BAL")) {
        			//FINDS SHIP
        			for(int j = 0; j < shipList.size(); j ++ ) {
        				if(shipList.get(j).getShipName().equals(ship)) {
        					roomCost = shipList.get(j).getPriceBalcony();
        				}
        			}

        		} 
        		
        		// OCEAN VIEW ROOMS
        		else if(roomType.equals("OV")){
        			for(int j = 0; j < shipList.size(); j ++ ) {
        				if(shipList.get(j).getShipName().equals(ship)) {
        					roomCost = shipList.get(j).getPriceOceanV();

        				}
        			}
} 
        		
        		// SUITE ROOMS
        		else if(roomType.equals("STE")) {
        			//FINDS SHIP
        			for(int j = 0; j < shipList.size(); j ++ ) {
        				if(shipList.get(j).getShipName().equals(ship)) {
        					roomCost = shipList.get(j).getPriceSuite();
        				}
        			}        			
        		}
        		
        		//INTERIOR ROOMS
        		else if(roomType.equals("INT")) {
        			//FINDS SHIP
        			for(int j = 0; j < shipList.size(); j ++ ) {
        				if(shipList.get(j).getShipName().equals(ship)) {
        					roomCost = shipList.get(j).getPriceInterior();
        				}
        			}
        		} 
        		
    		}
    	}		
     
    	roomTotal = roomCost + roomFee;
        return roomTotal;
    }
    
    public static String getShipByCruise(String tCruise) {
    	String cruiseName = tCruise;
    	String ship = "";
    	for(int i = 0; i < cruiseList.size(); i ++) {
    		if(cruiseList.get(i).getCruiseName().equals(cruiseName)) {
    			ship = cruiseList.get(i).getCruiseShipName();
    		}
    	}
    	return ship;
    }
    
    public static boolean isRoomTypeAvailable(String tRmType, String tCruise) {
    	String cruise = tCruise;
    	String roomType = tRmType;
    	String ship;
    	boolean isAvail = true;
    	
    	int currentlyBooked = 0;
    	int maxRooms = 0;

        // validate room type
        //Checks input, then finds the ship's name by cycling through the cruises. 
        //When ship is found, iterates through shipsList to find the room price and calculates it with room fees
       
            // validation passed - add passenger
        	//FINDS THE SHIP BY ITERATING THROUGH THE CRUISES
    	ship = getShipByCruise(cruise);
    	
    	for(int i = 0; i < cruiseList.size(); i ++) {
    		if(cruiseList.get(i).getCruiseName().equals(cruise)) {
    			
    			
    			// BALCONY ROOMS
        		if(roomType.equals("BAL")) {
        			currentlyBooked = cruiseList.get(i).getBookedBalcony();
        			//FINDS SHIP
        			for(int j = 0; j < shipList.size(); j ++ ) {
        				if(shipList.get(j).getShipName().equals(ship)) {
        					maxRooms = shipList.get(j).getRoomBalcony();
        				}
        			}
        			//ROOM TYPE IS FULL
        			if(maxRooms <= currentlyBooked) {
        				isAvail = false;
        			} 
        			
        			

        		} 
        		
        		// OCEAN VIEW ROOMS
        		else if(roomType.equals("OV")){
        			currentlyBooked = cruiseList.get(i).getBookedOcean();

        			for(int j = 0; j < shipList.size(); j ++ ) {
        				if(shipList.get(j).getShipName().equals(ship)) {
        					maxRooms = shipList.get(j).getRoomOceanView();

        				}
        			}
        			if(maxRooms <= currentlyBooked) {
        				isAvail = false;    			} 


        		} 
        		
        		// SUITE ROOMS
        		else if(roomType.equals("STE")) {
        			currentlyBooked = cruiseList.get(i).getBookedSuite();
        			//FINDS SHIP
        			for(int j = 0; j < shipList.size(); j ++ ) {
        				if(shipList.get(j).getShipName().equals(ship)) {
        					maxRooms = shipList.get(j).getRoomSuite();

        				}
        			}
        			//ROOM TYPE IS FULL
        			if(maxRooms <= currentlyBooked) {
        				isAvail = false;
        			} 

        		}
        		
        		//INTERIOR ROOMS
        		else if(roomType.equals("INT")) {
        			currentlyBooked = cruiseList.get(i).getBookedInterior();
        			//FINDS SHIP
        			for(int j = 0; j < shipList.size(); j ++ ) {
        				if(shipList.get(j).getShipName().equals(ship)) {
        					maxRooms = shipList.get(j).getRoomInterior();
        				}
        			}
        			//ROOM TYPE IS FULL
        			if(maxRooms <= currentlyBooked) {
        				isAvail = false;
        			} 
        		} 	
    		}


    			
    		
    	}
    	
    	//CANT BOOK, ROOM TYPE WAS FULL
    	if(isAvail == false) {
    		System.out.println("Error: Selected room is full");
    	} 
      
    	return isAvail;
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
        String room = "";
        boolean cycled = false;

        do {
        	if(cycled == true) {
        		System.out.println("Invalid Entry. Try again");
        	} else {
                System.out.println("Enter Room Type (BAL, OV, STE, or INT) ");

        	}
        	cycled = true;
        	room = newPassengerInput.nextLine().toUpperCase();

        } while(!( room.equalsIgnoreCase("BAL") || room.equalsIgnoreCase("OV") ||
                room.equalsIgnoreCase("STE") || room.equalsIgnoreCase("INT") ) );
        
        double totalCost = 0;
        boolean isAvail = true;

        isAvail = isRoomTypeAvailable(room,newCruiseName);

        
        
        
        if(isAvail == true) {
        	totalCost = getRoomCostByCruise(room, newCruiseName);
        	String ship = getShipByCruise(newCruiseName);
        	
            Passenger newPassenger = new Passenger(newPassengerName, newCruiseName, room.toUpperCase(), ship, totalCost);
            passengerList.add(newPassenger);
            cruiseCostProfitSetter(newCruiseName);
            System.out.println("Passenger " + newPassengerName + " added successfully.");
        }
        else {
            System.out.println("Passenger Could not be added. Returning to menu.");
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
