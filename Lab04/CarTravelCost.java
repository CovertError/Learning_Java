import java.util.*;
import java.lang.*;
public class CarTravelCost implements TravelCost
/**
* The TravelCost program does operations on the number of Miles, hotel Cost, and the destination)
* simply displays "Hello World!" to the standard output.
*
* @authors Omar Yassin, Harshit Kumar, Yameen Khan, and Shaikha Alsuwaidi  
* @version 1.0
*/
{

   int numMiles= 0;
   double hotelCost = 0;
   String destination="";
   double numHours=0;           // setting default values
   double numDays=0;
   double totalCost=0;
  
   public CarTravelCost(int numMiles, double hotelCost,String destination)
   {
   
      this.numMiles= numMiles;
      this.hotelCost= hotelCost;
      this.destination= destination;   //Constructor
      this.setDuration();
      this.getTotalCost();
      
      
   }
   
   public String getDestination()
   {
   
      return destination;
   
   }  

   public void setDuration()
   {
   
      this.numHours=(double)numMiles/65;
      this.numDays= Math.floor(numHours/8.0);        //finding the value of the Duration and returing the number of hours 
   
   }
   public double getDuration()
   {

      return numHours;
      
   }
   
   public double getLodgingCost()
   {
    
       return numDays*hotelCost;        // finding the value of the lodgingcost and returning the value o
    
   }
   
   public double getTotalCost()
   {
   
      return (numMiles * 0.45) + this.getLodgingCost() + AGENT_FEE;          //finding the value of totalcost and returning it  

   }
   
   public String toString()
   {  
   
      // return destination+" "+numHours+" "+ totalCost;
      
         return String.format("Car travels to %s will take take %.2f will cost %.2f$", this.destination, this.numHours, this.getTotalCost());
       
   } 
}  

