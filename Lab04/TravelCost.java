import java.util.*;
public interface TravelCost
/**
* The TravelCost program does operations on the number of Miles, hotel Cost, and the destination)
* simply displays "Hello World!" to the standard output.
*
* @authors Omar Yassin, Harshit Kumar, Yameen Khan, and Shaikha Alsuwaidi  
* @version 1.0
*/
{

   public final double AGENT_FEE = 10.00;
   public abstract double getDuration();
   public abstract double getTotalCost();    // Creating abstracts for the interface
   public abstract double getLodgingCost();
   public abstract String getDestination();
   public abstract String toString();
   

}