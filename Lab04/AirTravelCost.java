/**
* The AirTravelCost program does operations on the to get travel fare, and cost.
*
* @authors Omar Yassin, Harshit Kumar, Yameen Khan, and Shaikha Alsuwaidi  
* @version 1.0
*/

import java.util.Calendar;
import java.util.GregorianCalendar;

public class AirTravelCost implements TravelCost
{
   String departureDate;
   String arrivalDate;
   String departureTime;
   String arrivalTime;
   String destination;
   double hotelCost;
   double airFare;
   double duration;
   GregorianCalendar Dep;
   GregorianCalendar Arr;
   
   public AirTravelCost(double airFare,String departureDate,String departureTime,String arrivalDate,String arrivalTime)
   {
   
   /**
   *Constructor of the AirTravelCost class.
   *Initialises attributes 
   */
      this.airFare = airFare;
      this.departureDate = departureDate;
      this.departureTime = departureTime;
      this.arrivalDate = arrivalDate;
      this.arrivalTime = arrivalTime;
      
      String Year = departureDate.substring(0,4);
      int depyear = Integer.parseInt(Year);
      String Month = departureDate.substring(4,6);
      int depmonth = Integer.parseInt(Month);
      String DayOfMonth = departureDate.substring(6,8);
      int depdayOfMonth = Integer.parseInt(DayOfMonth);
      String HourOfDay = departureTime.substring(0,2);
      int dephourOfDay = Integer.parseInt(HourOfDay);
      String Minute = departureTime.substring(2,4);   // Convert String Date and Time given to Int by slicing 
      int depminute = Integer.parseInt(Minute);
      String aYear = arrivalDate.substring(0,4);
      int arryear = Integer.parseInt(aYear);
      String aMonth = arrivalDate.substring(4,6);
      int arrmonth = Integer.parseInt(aMonth);
      String aDayOfMonth = arrivalDate.substring(6,8);
      int arrdayOfMonth = Integer.parseInt(aDayOfMonth);
      String aHourOfDay = arrivalTime.substring(0,2);
      int arrhourOfDay = Integer.parseInt(aHourOfDay);
      String aMinute = arrivalTime.substring(2,4);
      int arrminute = Integer.parseInt(aMinute);
      
      Dep = new GregorianCalendar(depyear,depmonth,depdayOfMonth,dephourOfDay,depminute);
      Arr = new GregorianCalendar(arryear,arrmonth,arrdayOfMonth,arrhourOfDay,arrminute);
      
      
   }
   
   
  /**
  *Method that computes the total duration in hours.
  */    
  
   public double getDuration()
      {
         double TimeInMillis = Arr.getTimeInMillis() - Dep.getTimeInMillis();
         double minutes = TimeInMillis/60000.0;
         double duration = minutes/60;
         return duration;
       }
       
  /**
  *Method that computes lodging cost.
  */    
       
   public double getLodgingCost()
   { 
      return (getDuration()/24) * hotelCost;           
   }
   
  /**
  *Method that computes total cost.
  */
       public double getTotalCost()
   { 
      return this.airFare + this.getLodgingCost() + AGENT_FEE;      
   }
   
   /**
   *Accessor for destination
   */
   public String getDestination()
   {   
      return destination;   
   }  
   
   public String toString()
   {   
      return String.format("Air travel to %s will take %.2f hours will cost %.2f$",this.destination,this.getDuration(),this.getTotalCost()); 
   } 
   
}