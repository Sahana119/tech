import java.util.Scanner;
public class CompoundInterest {
   public static void main (String args[]){
      double principle, rate, time, compound_interest;
      System.out.println("Required packages have been imported");
      Scanner my_scanner = new Scanner(System.in);
      System.out.println("A Scanner object has been defined ");
      System.out.print("Enter a Principle number : ");
      principle = my_scanner.nextInt();
      System.out.print("Enter Interest rate : ");
      rate = my_scanner.nextInt();
      System.out.print("Enter a Time period in years : ");
      time = my_scanner.nextInt();
      compound_interest = principle * (Math.pow((1 + rate / 100), time)) - principle;
      System.out.println("The Compound Interest is : " + compound_interest);
   }
}
output:
Required packages have been imported
A Scanner object has been defined
Enter a Principle number : 100000
Enter Interest rate : 5
Enter a Time period in years : 3
The Compound Interest is : 15762.500000000015
