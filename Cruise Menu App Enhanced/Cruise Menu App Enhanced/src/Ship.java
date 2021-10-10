//Project Three - IT-145 - Elijah Hickey Oct. 2019
public class Ship {

    // Class Variables
    private String shipName;
  //Max number of rooms of each type
    private int roomBalcony; 
    private int roomOceanView;
    private int roomSuite;
    private int roomInterior;
    
    //if the ship is ready to be used for a cruise/ is in a cruise
    private boolean inService;
    
    private String shipsCruise; //set to "None" if no cruise;
    
    private double departureCost; //minimum cost to use the ship
    private double cpm; //cost per mile, cost to run the ship based on distance
    
    private double priceBalcony; //price of each balcony room
    private double priceOceanV; //price of each ocean view room
    private double priceSuite; //price of each suite room
    private double priceInterior; //price of each interior room
    
    

    // Constructor - default
    Ship() {
    }

    // Constructor - full
    Ship(String tName, int tBalcony, int tOceanView,
         int tSuite, int tInterior, boolean tInService, 
         String tShipsCruise,
         double tDepartureCost, double tCPM, 
         double tPriceBalcony, double tPriceOceanV, 
         double tPriceSuite, double tPriceInterior) {
        shipName = tName;
        roomBalcony = tBalcony;
        roomOceanView = tOceanView;
        roomSuite = tSuite;
        roomInterior = tInterior;
        inService = tInService;
        shipsCruise = tShipsCruise;
        departureCost = tDepartureCost;
        cpm = tCPM;
        priceBalcony = tPriceBalcony;
        priceOceanV = tPriceOceanV;
        priceSuite = tPriceSuite;
        priceInterior = tPriceInterior;
    }

    // Accessors
    public String getShipName() {
        return shipName;
    }

    public int getRoomBalcony() {
        return roomBalcony;
    }

    public int getRoomOceanView() {
        return roomOceanView;
    }

    public int getRoomSuite() {
        return roomSuite;
    }

    public int getRoomInterior() {
        return roomInterior;
    }

    public boolean getInService() {
        return inService;
    }
    
    public String getShipsCruise() {
    	return shipsCruise;
    }
    
    public double getDepartureCost() {
    	return departureCost;
    }
    public double getCPM() {
    	return cpm;
    }

    public double getPriceBalcony() {
    	return priceBalcony;
    }
    public double getPriceOceanV() {
    	return priceOceanV;
    }
    public double getPriceSuite() {
    	return priceSuite;
    }
    public double getPriceInterior() {
    	return priceInterior;
    }
    
    
    

    // Mutators
    public void setShipName(String tVar) {
        shipName = tVar;
    }

    public void setRoomBalcony(int tVar) {
        roomBalcony = tVar;
    }

    public void setRoomOceanView(int tVar) {
        roomOceanView = tVar;
    }

    public void setRoomSuite(int tVar) {
        roomSuite = tVar;
    }

    public void setRoomInterior(int tVar) {
        roomInterior = tVar;
    }

    public void setInService(boolean tVar) {
        inService = tVar;
    }
    
    public void setShipsCruise(String tVar) {
    	shipsCruise = tVar;
    }
    public void setDepartureCost(double tVar) {
    	departureCost = tVar;
    }
    public void setCPM(double tVar) {
    	cpm = tVar;
    }

    public void setPriceBalcony(double tVar) {
    	priceBalcony = tVar;
    }
    public void setPriceOceanV(double tVar) {
    	priceOceanV = tVar;
    }
    public void setPriceSuite(double tVar) {
    	priceSuite = tVar;
    }
    public void setPriceInterior(double tVar) {
    	priceInterior = tVar;
    }

    // print method
    public void printShipData() {

   
      	String spaces1 = "";
      	String spaces2 = "";
      	String spaces3 = "";
      	String spaces4 = "";
      	String spaces5 = "";
      	String spaces6 = "";
    	int spaceCount1 = 20 - shipName.length();
    	int spaceCount2 = 4 - String.valueOf(roomBalcony).length();
    	int spaceCount3 = 4 - String.valueOf(roomOceanView).length();
    	int spaceCount4 = 4 - String.valueOf(roomSuite).length();
    	int spaceCount5 = 9 - String.valueOf(roomInterior).length();
    	int spaceCount6 = 9 - String.valueOf(inService).length();
    	
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
    	for (int i = 1; i <= spaceCount5; i++) {
    		spaces5 = spaces5 + " ";
    	}
       	for (int i = 1; i <= spaceCount6; i++) {
    		spaces6 = spaces6 + " ";
    	}
        System.out.println(shipName + spaces1 + roomBalcony + spaces2 +
                roomOceanView + spaces3 + roomSuite + spaces4 +
                roomInterior + spaces5 + inService + spaces6 + shipsCruise);
    }
    
    public void printShipPricing() {
      	String spaces1 = "";
      	String spaces2 = "";
      	String spaces3 = "";
      	String spaces4 = "";
      	String spaces5 = "";
    	int spaceCount1 = 18 - String.valueOf(departureCost).length();
    	int spaceCount2 = 8 - String.valueOf(cpm).length();
    	int spaceCount3 = 9 - String.valueOf(priceBalcony).length();
    	int spaceCount4 = 10 - String.valueOf(priceOceanV).length();
    	int spaceCount5 = 9 - String.valueOf(priceSuite).length();
    	
    	
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
    	for (int i = 1; i <= spaceCount5; i++) {
    		spaces5 = spaces5 + " ";
    	}

        System.out.println( + departureCost + spaces1 + cpm + spaces2 +
               "$" + priceBalcony + spaces3 + "$" + priceOceanV + spaces4 +
               "$" + priceSuite + spaces5 + "$" +priceInterior);
    }

    // method added to print ship's name vice memory address
    @Override
    public String toString() {
        return shipName;
    }
}
