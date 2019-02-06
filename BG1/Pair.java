public class Pair
{

   private double first;
   private double second;
   private double Sum;
   private double Product;
   private double Average;
   private double Distance;
   private double Maximum;
   private double Minimum;
   
   public Pair(double aFirst, double aSecond)
   {
      fist=aFirst;
      second= aSecond;
      Sum=0;
      Product= 0;
      Average= 0;
      Distance=0;
      Maximum=0;
      Minimum=0;
      
   }
   public double getSum() 
   {
      Sum= fist+second;
      return Sum;
      
   }
   public double getProduct()
   {
      Product= first*second;
      return Product;
      
   }
   public double getAverage()
   {
   
      Average= (first+second)/2;
      return Average;
   
   }
   public double getDistance()
   {
      Distance= Math.abs(first-second);
      return Distance;
      
   }
   public double getMaximum()
   {
      Maximum= Math.max(first,second);
      return Maximum;
   }
   public double getMinimum()
   {
   
      Minimum= Math.min(first,second);
      return Minimum;
   }
}