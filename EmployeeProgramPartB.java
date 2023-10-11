// Oluwadamilola Adeyemo
// ID: 2021-08-0281 - Period 5

import java.util.Scanner; // Needed for the Scanner class.
import java.io.*;         // Needed for the File class.

public class EmployeeProgramPartB 
{
   public static void main(String[] args) throws IOException // Executes methods.
   {
   
      Employee[] employees; // or list.
      employees = new Employee[20];
     int i = 0;
   
   
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
   
      // Get the filename.
      System.out.print("Enter the filename: ");
      String filename = keyboard.nextLine();
   
      // Open the file.
      File file = new File(filename);
      Scanner inputFile = new Scanner(file);
   
      // Read lines from the file until no more are left.
      while (inputFile.hasNext())
      {
         employees[i] = new Employee("", 0, "","", 0);
         employees[i].setName(inputFile.nextLine());   
         employees[i].setIdNumber(Integer.parseInt(inputFile.nextLine()));   
         employees[i].setDepartment(inputFile.nextLine());   
         employees[i].setPosition(inputFile.nextLine());   
          
         System.out.printf("%-19s", employees[i].getName());
         System.out.printf("%-19s", employees[i].getIdNumber());
         System.out.printf("%-19s", employees[i].getDepartment());
         System.out.printf("%-19s", employees[i].getPosition());
         System.out.printf("$%.2f", employees[i].getAnnualSalary());
         System.out.println();
         
         i++;
      } 
      
      // Close the file.
      inputFile.close();
      
      
      
      //EmployeeDataFile (Output).txt
               
   }

}