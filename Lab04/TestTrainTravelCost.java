import java.util.*;
public class TestTrainTravelCost
/**
* The TravelCost program does operations on the number of Miles, hotel Cost, and the destination)
* simply displays the Train and Car Travel Cost if the Input was correct else it displays an error message.
*
* @authors Omar Yassin, Harshit Kumar, Yameen Khan, and Shaikha Alsuwaidi  
* @version 1.0
*/

{

   public static void main(String [] args)
   {

      if(args.length != 2)
      {
         System.out.println("ERROR wrong input");      
         System.exit(0);
      }

      CarTravelCost test1 = new CarTravelCost(400, 200, "home");
      System.out.println(test1);   
      TrainTravelCost test2 = new TrainTravelCost("home",7, 70.0);
      System.out.println(test2);
   }

}