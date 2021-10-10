//Project Three - IT-145 - Elijah Hickey Oct. 2019
public class Passenger {

    // Class variables
    private String passengerName;
    private String passengerCruise;
    private String passengerRoomType;
    private String passengerShip;
    //COST IS ROOM COST + ADD ROOM FEE
    private double passengerCost;


    // Constructor - default
    Passenger() {
    }

    // Constructor - full
    Passenger(String pName, String pCruise, String pRoomType, String pShip, double pCost) {
        passengerName = pName;
        passengerCruise = pCruise;
        passengerShip = pShip;
        passengerRoomType = pRoomType; // should be BAL, OV, STE, or INT
        passengerCost = pCost;
        
    }

    // Accessors
    public String getPassengerName() {
        return passengerName;
    }

    public String getPassengerCruise() {
        return passengerCruise;
    }

    public String getPassengerRoomType() {
        return passengerRoomType;
    }
    public String getPassengerShip() {
    	return passengerShip;
    }
    public double getPassengerCost() {
    	return passengerCost;
    }

    // Mutators
    public void setPassengerName(String tVar) {
        passengerName = tVar;
    }

    public void setPassengerCruise(String tVar) {
        passengerCruise = tVar;
    }

    public void setPassengerRoomType(String tVar) {
        passengerRoomType = tVar;
    }
    public void setPassengerShip(String tVar) {
    	passengerShip = tVar;
    }
    public void setPassengerCost(double tVar) {
    	passengerCost = tVar;
    }

    
    
    
    // print method
    public void printPassenger() {
        int spaceCount;
        String spaces1 = "";
        String spaces2 = "";
        String spaces3 = "";
        String spaces4 = "";
        spaceCount = 20 - passengerName.length();
        for (int i = 1; i <= spaceCount; i++) {
            spaces1 = spaces1 + " ";
        }

        spaceCount = 23 - passengerCruise.length();
        for (int i = 1; i <= spaceCount; i++) {
        	spaces2 = spaces2 + " ";
        }
        spaceCount = 19 - passengerShip.length();
        for (int i = 1; i <= spaceCount; i++) {
            spaces3 = spaces3 + " ";
        }
        spaceCount = 14 - passengerRoomType.length();
        for (int i = 1; i <= spaceCount; i++) {
        	spaces4 = spaces4 + " ";
        }
        System.out.println(passengerName + spaces1 + passengerCruise + spaces2 +
                passengerShip + spaces3 + passengerRoomType + spaces4 + "$"+ passengerCost);
        }
   

    

    // method added to print passenger's name vice memory address
    @Override
    public String toString() {
        return passengerName;
    }

}
