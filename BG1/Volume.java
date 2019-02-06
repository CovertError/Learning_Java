import java.util.Scanner;

public class Volume
{
   public static void main(String[] args)
   {
   Scanner in = new Scanner(System.in);
   
   System.out.print("please enter the price for a six-pacak: ");
   double packPrice= in.nextDouble();
   
   System.out.print("please enter the volume for each(in ounces):");
   double CanVolume = in.nextDouble();
   
   final double CANS_PER_PACK = 6;
   double packVolume = CanVolume * CANS_PER_PACK;
   
   double pricePerOunce = packPrice / packVolume;
   
   System.out.printf("price per ounce is: %8.2f", pricePerOunce);
   System.out.println();
   }
}