public class TrainTravelCost implements TravelCost
/**
* The TravelCost program does operations on the number of Miles, hotel Cost, and the destination)
* simply displays Nothing
*
* @authors Omar Yassin, Harshit Kumar, Yameen Khan, and Shaikha Alsuwaidi  
* @version 1.0
*/

{
   double duration;
   double trainFare;
   String destination;   
   
   public TrainTravelCost(String destination,double duration,double trainFare)
   {
      this.duration = duration;
      this.trainFare = trainFare;
      this.destination= destination;
       
   }
   
   public double getDuration()
   {
      return duration;
   }
   
   public String getDestination()
   {
      return destination;
   }
   
   public double getLodgingCost()
   {
      return 0.0;
   }
   
   public double getTotalCost()  
   {
       
       return trainFare + AGENT_FEE;
   } 
   
   public String toString()
   {  
      
      return String.format("Train travel to %s will take %.2f hours will cost %.2f$",this.destination,this.duration,this.getTotalCost());
       
   } 
   
}      
 