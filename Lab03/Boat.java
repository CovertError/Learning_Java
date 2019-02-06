/**
*Superclass with attributes and methods common to all boats
*@authors Mostafa Elkattan - Javeria Malik - Omar Yassin
*@version 1.3
*/
public class Boat
{
   protected String color; //defining the attribute color
   protected int length;   //defining the attribute length
   
   /**
   *Default Constructor
   *Initializes the attributes
   */
   public Boat()
   {
      color="white"; //initializing color to white
      length=20;     //initializing length to 20
   }
   
   /**
   *Parameterized Constructor
   *Initializes the attributes using mutators
   */
   public Boat(String color, int length)
   {
      setColor(color);  //calling the setColor mutator with color attribute
      setLength(length); //calling the setLength mutator with length attribute
   }
   
   /**
   *Mutator
   *Tests the input parameter for white, red, blue, or yellow
   @return True if color is white, red, blue, or yellow
   @return False if some other color
   */
   public boolean setColor(String color)
   {
      switch(color) //uses switch case to test parameter
      { 
         case "white": this.color=color;  //if white, invokes constructor within this class, same for the rest
                       return true;
                       
         case "red": this.color=color;
                     return true;
                      
         case "blue": this.color=color;
                      return true;
                      
         case "yellow": this.color=color;
                        return true;
                        
         default: System.out.println("Boats can only be white, red, blue, and yellow");  //if none of the above colors, prints error
                  return false; 
      }      

   }
   /**
   *Mutator
   *Tests the input parameter to be within range of 20 to 50
   @return True if parameter is wihtin range
   @return False if outside range
   */
   public boolean setLength(int length)
   {
      if(length>=20 && length<=50)  //if statement to check if length is within 20-50 range
      {
         this.length=length;  //invokes constructor within this class
         return true;
      }
      else
      {
         System.out.println("Error: Boats can only be between 20 and 50 feet, inclusively");
         return false;
      }
   }
   /**
   *Accessor
   @return the color
   */
   public String getColor()
   {
      return this.color;
   }
   /**
   *Accessor
   @return the length
   */
   public int getLength()
   {
      return this.length;
   }
   /**
   *Method
   @return a string in string format
   */
   public String toString()
   {
      return String.format("Color = %1$s   Length = %2$d",this.color,this.length);
   }
}