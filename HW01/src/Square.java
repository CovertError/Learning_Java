import java.util.*;  

public class Square{
   
   public int n=0;
   public ArrayList<Integer> numbers = new ArrayList<Integer>();  
   Scanner scanner = new Scanner(System.in);
   
   public void add(int i){
      
      
      numbers.add(scanner.nextInt());
   }
   
   public boolean isSquare(){
   
      double sqrt = Math.sqrt(numbers.size());
      int x = (int) sqrt;
      
      if(Math.pow(sqrt,2) == Math.pow(x,2)){
        return true;
      }
      return false;
   }
   
   public boolean isUnique(){
   
   	for (int m : numbers) {
      
         if (numbers.contains(m)) {
            return true;
         }
			
      }
      return false;
   }
   
   public boolean isMagic(){
   	int c=numbers.size(), rowSum=0, colSum=0, dia1Sum=0, dia2Sum=0;
   	int[][] myArray = new int[c][c];
   
   	for (int i=0; i<c; i++) {
   		for (int j=0; j<c; j++) {
   			rowSum += myArray[i][j];
   			colSum += myArray[j][i];
   		}
   		
   		if (rowSum != colSum) return false;
   	}
   
   	for (int i=c, j=0; i>=0; i--, j++) dia1Sum += myArray[i][j];
   	for (int i=0; i<=3; i++) dia2Sum += myArray[i][i];
   
      if (dia1Sum != dia2Sum) return false;
      return true;
   }
}

