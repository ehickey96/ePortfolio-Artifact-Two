//Project Three - IT-145 - Elijah Hickey Oct. 2019
public class Cruise {

    // Class Variables
    private String cruiseName;
    //helps connect ship to cruise
    private String cruiseShipName;
    
    
    private String departurePort;
    private String destination;
    private String returnPort;

    //indicates the number of booked rooms of each type
    private int bookedBalcony;
	private int bookedOceanV;
    private int bookedSuite;
    private int bookedInterior;
    
    //total distance of the cruise
    private double totalMiles;
    
    //additional costs/fee based off the cruise 
    //cruise cost will cost cruise company, room fee will cost customer and make money for the company
    private double addCruiseCost;
    private double addRoomFee; 
    
    //base departure cost + (cost per mile * total miles) + additional cruise cost
    // NOTE: base departure cost, cpm come from the ship
    private double cruiseTotalCost;
    
    //additional rm fees + price of room 
    // NOTE: Price of room comes from cruise
    private double balconyIncome; 
    private double oceanVIncome;
    private double suiteIncome;
    private double interiorIncome;
    
    //sum of all room incomes
    private double totalIncome;
    
    // total Income - cruise totalCost
    private double netProfit;
    private double profitPerc;

    // Constructor - default
    Cruise() {
    }

    // Constructor - full
    Cruise(String tCruiseName, String tShipName, String tDeparture, 
    		String tDestination, String tReturn, int tBookedBalcony, 
    		int tBookedOceanV, int tBookedSuite, int tBookedInterior,
    		double tTotalMiles, double tAddCruiseCost, double tAddRoomFee, 
    		double tCruiseTotalCost, double tBalconyIncome, 
    		double tOceanVIncome, double tSuiteIncome, double tInteriorIncome,
    		double tTotalIncome, double tNetProfit, double tProfitPerc) {
        cruiseName = tCruiseName;
        cruiseShipName = tShipName;
        departurePort = tDeparture;
        destination = tDestination;
        returnPort = tReturn;
        bookedBalcony = tBookedBalcony;
        bookedOceanV = tBookedOceanV;
        bookedSuite = tBookedSuite;
        bookedInterior = tBookedInterior;
        totalMiles = tTotalMiles;
        addCruiseCost = tAddCruiseCost;
        addRoomFee = tAddRoomFee;
        cruiseTotalCost = tCruiseTotalCost;
        balconyIncome = tBalconyIncome;
        oceanVIncome = tOceanVIncome;
        suiteIncome = tSuiteIncome;
        interiorIncome = tInteriorIncome;
        totalIncome = tTotalIncome;
        netProfit = tNetProfit;
        profitPerc = tProfitPerc;
        
        
        
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
    
    public int getBookedBalcony() {
		return bookedBalcony;
	}
	public int getBookedOcean() {
		return bookedOceanV;
	}
	public int getBookedSuite() {
		return bookedSuite;
	}
	public int getBookedInterior() {
		return bookedInterior;
	}
	public double getTotalMiles() {
		return totalMiles;
	}
	public double getAddCruiseCost() {
		return addCruiseCost;
	}
	public double getAddRoomFee() {
		return addRoomFee;
	}
	public double getCruiseTotalCost() {
		return cruiseTotalCost;
	}
	public double getBalconyIncome() {
		return balconyIncome;
	}
	public double getOceanVIncome() {
		return oceanVIncome;
	}
	public double getSuiteIncome() {
		return suiteIncome;
	}

	public double getInteriorIncome() {
		return interiorIncome;
	}
	public double getTotalIncome() {
		return totalIncome;
	}
	public double getNetProfit() {
		return netProfit;
	}
	public double getProfitPerc() {
		return profitPerc;
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

	public void setBookedBalcony(int tVar) {
		bookedBalcony = tVar;
	}
	public void setBookedOcean(int tVar) {
		bookedOceanV = tVar;
	}
	public void setBookedSuite(int tVar) {
		bookedSuite = tVar;
	}
	public void setBookedInterior(int tVar) {
		bookedInterior = tVar;
	}
	public void setTotalMiles(double tVar) {
		totalMiles = tVar;
	}

	public void setAddCruiseCost(double tVar) {
		addCruiseCost = tVar;
	}
	public void setAddRoomFee(double tVar) {
		addRoomFee = tVar;
	}
	public void setCruiseTotalCost(double tVar) {
		cruiseTotalCost = tVar;
	}
	public void setBalconyIncome(double tVar) {
		balconyIncome = tVar;
	}
	public void setOceanVIncome(double tVar) {
		oceanVIncome = tVar;
	}
	public void setSuiteIncome(double tVar) {
		suiteIncome = tVar;
	}
	public void setInteriorIncome(double tVar) {
		interiorIncome = tVar;
	}
	public void setTotalIncome(double tVar) {
		totalIncome = tVar;
	}
	public void setNetProfit(double tVar) {
		netProfit = tVar;
	}
	public void setProfitPerc(double tVar) {
		profitPerc = tVar;
	}

    // print cruise details
    //Was tested and informs the user if no cruises are in inventory
    public void printCruiseDetails() {
    	
    	/* Since print cruise deals with all strings, lengths of the strings can very 
    	 *greatly so 'spaces' was made for each respective variable
    	 */
    	
    	int spaceCount1;
    	int spaceCount2;
    	int spaceCount3;
    	int spaceCount4;
    	
    	String spaces1 = "";
    	String spaces2 = "";
    	String spaces3 = "";
    	String spaces4 = "";
    	
    	spaceCount1 = 20 - cruiseName.length();
    	spaceCount2 = 21 - cruiseShipName.length();
    	spaceCount3 = 22 - departurePort.length();
    	spaceCount4 = 17 - destination.length();
    	
    	
    	for (int i = 1; i <= spaceCount1; i++) {
    		spaces1 = spaces1 + " ";
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
    	
    	System.out.println(cruiseName + spaces1 + 
    			cruiseShipName + spaces2 + departurePort + 
    			spaces3 + destination + spaces4 + returnPort);

        // -completed by E.H.

    }
    public void printCruiseDetailsBookedRooms() {

    	
      	String spaces1 = "";
      	String spaces2 = "";
      	String spaces3 = "";
      	String spaces4 = "";
    	int spaceCount1 = 18 - String.valueOf(bookedBalcony).length();
    	int spaceCount2 = 17 - String.valueOf(bookedOceanV).length();
    	int spaceCount3 = 17 - String.valueOf(bookedSuite).length();
    	int spaceCount4 = 16 - String.valueOf(bookedInterior).length();
    	
    	for (int i = 1; i <= spaceCount1; i++) {
    		spaces1 = spaces1 + " ";
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
    	
    	int totalBook = bookedBalcony + bookedOceanV + bookedSuite + bookedInterior;
    	

    	
    	
   
    	
    	System.out.println("   " + bookedBalcony + spaces1 + 
    			bookedOceanV + spaces2 + bookedSuite + 
    			spaces3 + bookedInterior + spaces4 + totalBook );



    }
  public void printCruiseDetailsCosts(double tCPM,  double tdepartC) {
    	


    	double shipCPMnet = tCPM * totalMiles;
    	double departCost = tdepartC;

      	String spaces1 = "";
      	String spaces2 = "";
      	String spaces3 = "";
      	String spaces4 = "";
    	int spaceCount1 = 15 - String.valueOf(totalMiles).length();
    	int spaceCount2 = 15 - String.valueOf(departCost).length();
    	int spaceCount3 = 15 - String.valueOf(addCruiseCost).length();
    	int spaceCount4 = 18 - String.valueOf(shipCPMnet).length();
    	
    	for (int i = 1; i <= spaceCount1; i++) {
    		spaces1 = spaces1 + " ";
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
    	
	
    	System.out.println(totalMiles + " miles "+spaces1  
    			+ "$" + departCost + spaces2 + "$" + addCruiseCost + 
    			spaces3 + "$" + shipCPMnet + spaces4  + "$" + cruiseTotalCost);

    }
  
  public void printCruiseDetailsIncome() {
  	
  	String spaces1 = "";
  	String spaces2 = "";
  	String spaces3 = "";
  	String spaces4 = "";
	int spaceCount1 = 18 - String.valueOf(balconyIncome).length();
	int spaceCount2 = 15 - String.valueOf(oceanVIncome).length();
	int spaceCount3 = 12 - String.valueOf(suiteIncome).length();
	int spaceCount4 = 17 - String.valueOf(totalIncome).length();
	
	for (int i = 1; i <= spaceCount1; i++) {
		spaces1 = spaces1 + " ";
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
	
  	System.out.println("$" + balconyIncome + spaces1 + 
  			"$" + oceanVIncome + spaces2 + "$" + suiteIncome  + 
  			spaces3 + "$" + interiorIncome  + spaces4 + "$" + totalIncome );

  }
  
  
  
  public void printCruiseDetailsProfit() {
	  	

	  	String spaces1 = "";
	  	String spaces2 = "";
	  	String spaces3 = "";
		int spaceCount1 = 18 - String.valueOf(cruiseTotalCost).length();
		int spaceCount2 = 19 - String.valueOf(totalIncome).length();
		int spaceCount3 = 22 - String.valueOf(netProfit).length();
		
		for (int i = 1; i <= spaceCount1; i++) {
			spaces1 = spaces1 + " ";
		}
		
		for (int i = 1; i <= spaceCount2; i++) {
			spaces2 = spaces2 + " ";
		}
		
		for (int i = 1; i <= spaceCount3; i++) {
			spaces3 = spaces3 + " ";
		}
		
	  	
	  	String rounded = String.format("%.2f", profitPerc);

		
	  	System.out.println(" $" + cruiseTotalCost + spaces1 + 
	  			"$" + totalIncome + spaces2 + "$" + netProfit  + 
	  			spaces3  +  rounded + "%");

	  }
    

  public void printCruiseSortedByProfit() {
	  	String spaces1 = "";
	  	String spaces2 = "";
	  	String spaces3 = "";
	  	String spaces4 = "";          
	  	String rounded = String.format("%.2f", profitPerc);
    	
	  	
    	int spaceCount1 = 18 - cruiseName.length();
    	int spaceCount2 = 15 - String.valueOf(cruiseTotalCost).length();
    	int spaceCount3 = 16 - String.valueOf(totalIncome).length();
    	int spaceCount4 = 18 - String.valueOf(netProfit).length();

    	
    	for (int i = 1; i <= spaceCount1; i++) {
    		spaces1 = spaces1 + " ";
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
    	
	  	System.out.println(cruiseName + spaces1 + " $" + cruiseTotalCost + spaces2 + 
	  			"$" + totalIncome + spaces3 + "$" + netProfit  + 
	  			spaces4  +  rounded + "%");

  }
    // method added to print ship's name vice memory address
    @Override
    public String toString() {
        return cruiseName;
    }
}
