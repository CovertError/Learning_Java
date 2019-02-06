/*
 * Name: Manar Abdulhakeem Baabbad 
ID: 1705314
Email:mba0007@stu.kau.edu.sa
Course number: CPCS203
Section number:BD
Assignment number:Assignment1 
Date: Sunday 25/2/2018  */ 
 

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


    public static void main(String[] args) throws FileNotFoundException {
        //Create  file that contains the input file
        File file1 = new File("input.txt");
        File file2 = new File("output.txt");

        if (!(file1.exists())) {

            System.out.println("The file dose not exist");
            System.exit(0);
        }
        try ( //Declare scanner object to read from  file
                Scanner inp = new Scanner(file1)) {
            PrintWriter write = new PrintWriter(file2); //Declare  printwriter object to write in  file
            
            
            String[] readCourse = new String[inp.nextInt()];
            //Create 1 D Array for the Exam Types as per given size 6
            String[] examType = new String[6];
            String[][] student = new String[readCourse.length][];
            
            for (int i = 0; i < student.length; i++) {
                student[i] = new String[inp.nextInt()];
            }
            
            
            int[][][] marksStudent = new int[readCourse.length][][];
            for (int i = 0; i < student.length; i++) {
                marksStudent[i] = new int[student[i].length][examType.length];
            }
            
            String input = inp.next();
            
            do {
                if (input.equalsIgnoreCase("Add_course")) {
                    
                    write.println("COMMAND: ADD_COURSE");
                    write.println("***Course Record For Exam Grading System***\n");
                    
                    course(readCourse, write, inp);
                    
                } else if (input.equalsIgnoreCase("Add_ExamType")) {
                    write.println("\nCOMMAND: ADD_EXAMTYPE");
                    write.println("***Exam Type Record For Exam Grading System***\n");
                    examType(examType, write, inp);
                } else if (input.equals("Add_Student_For_Course")) {
                    
                    inputStudent(readCourse, student, inp, write);
                    
                } else if (input.equals("Add_Marks")) {
                    
                    Add_Marks(examType, marksStudent, readCourse, student, write, inp);
                    
                } else if (input.equals("Print_Result")) {
                    
                    print_Result(examType, marksStudent, readCourse, student, write, inp);
                    
                }else if (input.equals("Print_Result")) {
                    
                    print_Result(examType, marksStudent, readCourse, student, write, inp);
                    
                }
                input = inp.next();
            } while (!(input.equals("Quit")));
            
            write.flush();
            write.close();
        } //Declare  printwriter object to write in  file

    }
      

    public static void inputStudent(String[] course,
            String[][] student, Scanner inp, PrintWriter write) {

        int index = inp.nextInt();

        write.println("COMMAND: ADD_STUDENT_FOR_COURSE");
        write.println("***Student Record For Exam Grading System***\n");

        for (int j = 0; j < student[index].length; j++) {

            student[index][j] = inp.next();
            write.print("  - Name:  " + student[index][j] + "  ");

        }
        write.println(" ");
        write.println("----------------------------------------------------"
                + "--------------------------------------------------- ");
        write.println(" ");

    }

    // course (course ,write ,in);
    public static void course(String[] course, PrintWriter write, Scanner in) {

        for (int i = 0; i < course.length; i++) {
            course[i] = in.next();
            write.print("  - Course:  " + course[i]);
        }
        write.println("\n-------------------------------------------------------------------------------------------------------");

    }

    //examType (examType , write ,in);
    public static void examType(String[] examType, PrintWriter write, Scanner in) {

        for (int j = 0; j < examType.length; j++) {
            examType[j] = in.next();
            write.print("  - Exam Type: " + examType[j] + "  ");
        }
        write.println("\n-------------------------------------------------------------------------------------------------------");

    }

    // marksStudent ( examType, marksStudent, course, student,write, in);
    public static void Add_Marks(String[] examType, int[][][] marksStudent, String[] course,
            String[][] student, PrintWriter write, Scanner in) {

        for (int i = 0; i < course.length; i++) {
            for (int j = 0; j < student[i].length; j++) {
                for (int k = 0; k < examType.length; k++) {
                    marksStudent[i][j][k] = in.nextInt();
                }
            }
        }
    }

    public static void print_Result(String[] examType, int[][][] marksStudent, String[] course,
            String[][] student, PrintWriter write, Scanner in) {
int index1 =1;
int index2 = 0 ;
        String input = in.next();

        for (int i = 0; i < 4; i++) {

            if (input.equals(course[i])) {
                write.println("COMMAND: PRINT_RESULT");
                write.println("***Students Winner Record For Exam Grading System***");
                write.println();
                write.println("-- (Students Total Marks)  Result For Course " + course[i] + "  --");

                int[] sum = new int[student[i].length];

                for (int j = 0; j < student[i].length; j++) {
                    for (int k = 0; k < examType.length; k++) {
                        sum[j] += marksStudent[i][j][k];
                        
                    }
                }
            }
        }
    }
}

  