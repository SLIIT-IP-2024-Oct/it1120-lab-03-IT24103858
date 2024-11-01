import java.util.Scanner;

public class IT24103858Lab3Q2{
 public static void main(String[]args){
   Scanner salary=new Scanner(System.in);
   System.out.print("Enter the monthly_salary: ");
   double monthly_salary=salary.nextDouble();
   System.out.print("Enter the number of OT_hours:");
   double OT_hours=salary.nextDouble();
   System.out.print("Enter the OT_hourly_rate:");
   double OT_hourly_rate=salary.nextDouble();
   double OT_Amount=OT_hours*OT_hourly_rate;
   double Total_Salary=monthly_salary+OT_Amount;
   System.out.println("The total salary including OT is:"+ Total_Salary);
 }
}