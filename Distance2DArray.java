import java.util.Scanner;

/**
 * @author Josh Gibb
 * Distance2DArray.java
 * A project cusing a 2D array to show the distances between Cities 
 */
public class Distance2DArray {
    // Instantiating and Declaring all variables for the project
    private static final String[] CITY_NAME = 
        {"Atlanta", "Boston", "Chicago", "Houston",
        "Los Angeles", "New York", "San Francisco",
        "Washington"};
    
    private static final int[][] DISTANCES = 
        {   {0, 1110, 710, 790, 2190, 850, 2480, 620},
            {1110, 0, 1000, 1830, 3020, 210, 3130, 450},
            {710, 1000, 0, 1090, 2050, 810, 2170, 710},
            {790, 1830, 1090, 0, 1540, 1610, 1910, 1370},
            {2190, 3020, 2050, 1540, 0, 2790, 390, 2650},
            {850, 210, 810, 1610, 2790, 0, 2930, 240},
            {2480, 3130, 2170, 1910, 390, 2930, 0, 2840},
            {620, 450, 710, 1370, 2650, 240, 2840, 0}};
    
    public static void main(String[] args){
        System.out.println(
                "This Program finds the distances between cities.\n"
                + "Supported Cities: Atlanta, Boston, Chicago, Houston,\n"
                + "Los Angeles, New York, San Francisco, Washington.\n");
        int start = getCityCode("Enter starting City: ");
        int destination = getCityCode("Enter ending city: ");
        // Returns the distance between two cities
        System.out.println(
                "\nThe distance from " + CITY_NAME[start] + " to " +
                        CITY_NAME[destination] + " is "+ 
                        DISTANCES[start][destination] + " miles");
    }
    
    // Recieves a City Code from the User and returns the ID for it by searching the CITY_NAME array
    public static int getCityCode(String prompt){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println(prompt);
            String cityName = scan.nextLine().trim();
            
            for(int i = 0; i < CITY_NAME.length; i++){
                if(CITY_NAME[i].equalsIgnoreCase(cityName))
                    return i;
            }
            System.out.println("City name was not recognized.");
        }
    }
}
