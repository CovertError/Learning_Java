/**
* The TestTravelCost program to test and find cheapest and shortest duration to travel.  
* Check arguments
* @authors Omar Yassin, Harshit Kumar, Yameen Khan, and Shaikha Alsuwaidi  
* @version 1.0
*/

import java.util.ArrayList;
public class TestAirTravelCost
{
   public static void main(String[] args)
   {
      
       if(args.length != 10)
      {
         System.out.println("ERROR wrong input");      // if statment to catch input error
         System.exit(0);
      }

      CarTravelCost test1 = new CarTravelCost(400, 200, "home");
      TrainTravelCost test2 = new TrainTravelCost(7, 70.0);
      AirTravelCost test3 = new AirTravelCost(400,"20140503","1540","20140504","0028");
      
      ArrayList<Object> TravelCost = new ArrayList<Object>(); // Creates an ArrayList of objects
      
      TravelCost.add(test1);
      TravelCost.add(test2); // adds object to array
      TravelCost.add(test3);
      
      System.out.println(test1);   
      
      System.out.println(test2); 
      
      System.out.println(test3);
 
   }
}
         

   
      
      
    