/**
*Subclass that extends from superclass Boat
*@authors Mostafa Elkattan - Javeria Malik - Omar Yassin
*@version 1.3
*/
public class PowerBoat extends Boat
{
   private int engineSize;  //defining the attribute
   
   /**
   *Default Constructor
   *Initializes the attribute
   */
   public PowerBoat()
   {
      super(); //calls default constructor of Boat superclass
      engineSize=5; //setting engineSize to 5
   }
   
   /**
   *Parameterized Constructor
   *Initializes the attribute color and length using Boat class
   *Initializes the attribute engineSize using setEngineSize mutator
   */
   public PowerBoat(String _color,int _length,int _engineSize)
   {
      super(_color,_length); //passing to Boat class
      setEngineSize(_engineSize); //passing to mutator within this subclass
   }
   
   /**
   *Mutator
   *Tests the input parameter to see if engineSize is within the range 5-350
   @return True if within range
   @return False if outside range
   */
   public boolean setEngineSize(int _engineSize)
   {
      if(_engineSize>=5 && _engineSize<=350) //if statement to check if parameter is within range
      {
         engineSize=_engineSize; //setting engineSize
         return true;
      }
      else
      {
         System.out.println("Error: That engine is too powerful. The engine size must be between 5 and 350, inclusively");
         return false;
      }
   }
   
   /**
   *Accessor
   @return engineSize
   */
   public int getEngineSize()
   {
      return engineSize;
   }
   
   /**
   *Method
   @return price of the power boat
   */
   public double calcPrice()
   {
      return (5000+(length*300.0)+(engineSize*20.0));
   }
    /**
   *Method
   @return a string in string format
   */
   public String toString()
   {
      String priceStr=String.format("$ %,.2f",calcPrice());
      return String.format("%1$s   Engine Size = %2$d   Cost = %3$s",super.toString(),engineSize,priceStr);
   }
}