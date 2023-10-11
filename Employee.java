// Oluwadamilola Adeyemo
// ID: 2021-08-0281 - Period 5

public class Employee
{

   // Fields.
   
   protected String name;
   protected int idNumber;
   protected String department;
   protected String position;
   protected double annualSalary;


   // Constructors.

   public Employee(String name, int id, String department, String position, double annualSalary)
   {
      this.name = name;
      this.idNumber = id;
      this.department = department;
      this.position = position;
      this.annualSalary = annualSalary;
   }


  // Accessors.

   public String getName()
   {
      return name;
   }

   public int getIdNumber() 
   {
      return idNumber;
   }

   public String getDepartment()
   {
      return department;
   }

   public String getPosition()
   {
      return position;
   }

   public double getAnnualSalary()
   {
      return annualSalary;
   }


   // Mutators.
   
   public void setName(String name)
   {
      this.name = name;
   }

   public void setIdNumber(int idNumber)
   {
      this.idNumber = idNumber;
   }

   public void setDepartment(String department)
   {
      this.department = department;
   }

   public void setPosition(String position)
   {
      this.position = position;
   }

   public void setAnnualSalary(double annualSalary)
   {
      this.annualSalary = annualSalary;
   }  
  

}