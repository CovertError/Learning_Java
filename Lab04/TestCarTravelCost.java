import java.util.*;
public class TestCarTravelCost
/**
* The TravelCost program does operations on the number of Miles, hotel Cost, and the destination)
* simply displays "Hello World!" to the standard output.
*
* @authors Omar Yassin, Harshit Kumar, Yameen Khan, and Shaikha Alsuwaidi  
* @version 1.0
*/
{

   public static void main(String [] args)
   {

      if(args.length != 3)
      {
         System.out.println("ERROR wrong input");      // if statment to catch input error
         System.exit(0);
      }
      
      CarTravelCost test1 = new CarTravelCost(200, 500, "home");
      System.out.println(test1);   
       
   }

}