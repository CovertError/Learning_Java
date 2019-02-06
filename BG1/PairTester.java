public class PairTester
{  
   public static void main(String []args)
   {
   
      int [] arry;
      arry = new int[500];
      System.out.println(arry.length);
      arry[0]= 500;
      for (int i= 499 ; i>1; i--)
      {
         arry[i]=i;
         System.out.println(arry[i]);
      }
   }
}

  