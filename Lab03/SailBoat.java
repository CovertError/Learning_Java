/**
*Subclass that extends from superclass Boat
*@authors Mostafa Elkattan - Javeria Malik - Omar Yassin
*@version 1.3
*/
public class SailBoat extends Boat
{
   private int numSails;  //defining the attribute
   
   /**
   *Default Constructor
   *Initializes the attribute
   */
   public SailBoat()
   {
      numSails=1;
   }
   
   /**
   *Parameterized Constructor
   *Initializes the attribute color and length using Boat class
   *Initializes the attribute numSails using setNumSails mutator
   */
   public SailBoat(String _color,int _length,int _numSails)
   {
      super.setColor(_color); //passing to Boat class
      super.setLength(_length); //passing to Boat class
      this.setNumSails(_numSails); //passing to mutator within this subclass
   }
   
   /**
   *Mutator
   *Tests the input parameter to see if number of Sails is within the range 1-4
   @return True if within range
   @return False if outside range
   */
   public boolean setNumSails(int _numSails)
   {
      if (_numSails>=1 && _numSails<=4) //if statement to check if parameter is within range
      {
         numSails=_numSails; //setting numSails
         return true;
      }
      else
      {
         System.out.println("Error: Number of sails can only be between 1 and 4, inclusively");
         return false;
      }
   }
   
   /**
   *Accessor
   @return numSails
   */
   public int getNumSails()
   {
      return numSails;
   }
   
   /**
   *Method
   @return price of the sail boat
   */
   public double calcPrice()
   {
      return ((length*1000.00)+(numSails*2000));
   }
   /**
   *Method
   @return a string in string format
   */
   public String toString()
   {
      String priceStr=String.format("$ %,.2f",calcPrice());
      return String.format("%1$s   Number of Sails = %2$d   Cost = %3$s",super.toString(),numSails,priceStr);
   }
}