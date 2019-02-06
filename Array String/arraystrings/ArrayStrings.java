package arraystrings;
import java.util.*;
import java.io.*;
/**
 *
 * @author Admin-Lap
 */
public class ArrayStrings {
   public static void WriteToFile(String text){
   
      try
      {
        String filename= "output.txt";
        FileWriter fw = new FileWriter(filename,true); 
        fw.write(text);
        fw.close();
      }
      catch(IOException ioe)
      {
        System.err.println("IOException: " + ioe.getMessage());
      }
   
   }
   
   public static void Add_Course(String s, String[] c, Scanner input){
      String output="COMMAND: ADD_COURSE\n";
      output+= "***Course Record For Exam Grading System***\n\n";
      for(int i=0; i<c.length; i++) {
        c[i] = input.next();
        output+= "- Course: " +c[i]+ " ";
      }
      output+="\n-------------------------------------------------------------------------------------------------------\n\n";
      WriteToFile(output);
   }
   public static void Add_ExamType(String s, String[] c, Scanner input){
      String output="COMMAND: ADD_EXAMTYPE\n";
      output+= "******Exam Type Record For Exam Grading System***\n\n";
      for(int i=0; i<c.length; i++) {
        c[i] = input.next();
        output+= "- Exam Type " +c[i]+ " ";
      }
      output+="\n-------------------------------------------------------------------------------------------------------\n\n";
      WriteToFile(output);
   }
   
   public static void ADD_STUDENT_FOR_COURSE(String s, String[] c, Scanner input){
      String output="COMMAND: ADD_STUDENT_FOR_COURSE\n";
      output+= "***Student Record For Exam Grading System***\n\n";
      for(int i=0; i<c.length; i++) {
        c[i] = input.next();
        output+= "- Exam Type " +c[i]+ " ";      // in progress
      }
      output+="\n-------------------------------------------------------------------------------------------------------\n\n";
      WriteToFile(output);
   }
    
    public static void main(String[] args) {
        String fileName= "input.txt"; 
        int course1=0,course2=0,course3=0,course4=0,numOfCourses=0;
        String[] courses;
        String[] examTypes;
        String locateADD = "Add_Courese";
        examTypes= new String[6];
        try {
            
            Scanner input = new Scanner(new File(fileName));
            numOfCourses= input.nextInt();
            courses= new String[numOfCourses];
            String[] coursesWithStudents = new String[numOfCourses];
            course1= input.nextInt();
            course2= input.nextInt();            
            course3= input.nextInt();
            course4= input.nextInt();
            while(input.hasNext()){
                String s = input.next();
                switch (s){
                    case "Add_Course":
                    Add_Course(s, courses, input);
                    break;
                    case "Add_ExamType":
                    Add_ExamType(s,examTypes,input);     
               }    
                        
            }
        }
        catch(FileNotFoundException ex) {
        System.out.println(
            "Unable to open file '" + 
            fileName + "'");                
        
        }
    
     }
}
