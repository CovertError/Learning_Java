import java.util.*;
/**
*Prints toString info of all boats, calculates total cost, and finds most expensive boat
*@authors Mostafa Elkattan - Javeria Malik - Omar Yassin
*@version 1.3
*/
public class Inventory
{
    /**
    *Public void run
    *Prints out toString info of all boats
    *Computes total price of all boats
    *Finds the most expensive boat
    */ 
     public static void main(String[] args)  
      {
         System.out.println("Printing all Boats:\n ");
         Boat[] boat = new Boat[7];  //creates an array
         boat[0] = new PowerBoat("blue",22,60);
         boat[1] = new SailBoat("white",20,1);
         boat[2] = new SailBoat("red",42,3);
         boat[3] = new PowerBoat("yellow", 35,80);
         boat[4] = new PowerBoat("red", 50,120);
         boat[5] = new SailBoat("blue", 33,2);
         boat[6] = new PowerBoat("white",20,10);     
         
         List<Double> cost = new ArrayList<Double>();  //creates an arrayList
         int sum = 0;
         double max = 0;
         String maxString="";
         for(int i=0;i<boat.length;i++)
         {
            System.out.println(boat[i].toString());
            
            if (boat[i] instanceof SailBoat)  //using downcasting to find max cost
            {
               SailBoat inst1 = (SailBoat) boat[i];
               double cost1 = inst1.calcPrice();
               
               if (cost1>max)
               {
                  max=cost1;
                  maxString=inst1.toString();
               }
              
               sum+=cost1;  
               cost.add(cost1);
               
            }
            else if (boat[i] instanceof PowerBoat)  //using downcasting to find max cost
            {
               PowerBoat inst2 = (PowerBoat) boat[i];
               double cost2 = inst2.calcPrice();
               
               if (cost2>max)
               {
                  max=cost2;
                  maxString=inst2.toString();
               }
               sum+=cost2;
               cost.add(cost2);

            } 
         }
         System.out.println("Total price of all boats is: $" + sum);
         System.out.println("Most Expensive Boat: " + maxString);
      }

}