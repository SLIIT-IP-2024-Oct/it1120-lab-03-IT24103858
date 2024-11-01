import java.util.Scanner;

public class IT24103858Lab3Q1B{
 public static void main(String[]args){
   Scanner mass=new Scanner(System.in);
   System.out.print("Enter the price of 1kg of rice: ");
   double pricePerKg=mass.nextDouble();
   System.out.print("Enter the number of kilograms you want to buy:");
   double kilograms=mass.nextDouble();
   double totalAmount=pricePerKg*kilograms;
   double discountAmount=totalAmount*0.1;
   System.out.println("Total amount with 10% discount is:" + discountAmount);
 }
}