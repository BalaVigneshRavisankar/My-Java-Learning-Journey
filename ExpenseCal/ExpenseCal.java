import java.util.Scanner;

class ExpenseCal{
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
          System.out.println("Enter the Price of an item: ");
        double Price = scan.nextDouble();
      
 System.out.println("Enter the Quantity: ");

        double Quantity = scan.nextDouble();
        

   System.out.println("Enter the Discount: ");

        double DiscountValue = scan.nextDouble();
        
   

      double Total = Price * Quantity;
      double DiscountAmount = (Total * DiscountValue)/100;
      double FinalValue = Total - DiscountAmount;

      System.out.println("The Total amount is: "+Total);
      System.out.println("The DiscountAmount is: "+DiscountAmount);
      System.out.println("The Final Amount is: "+FinalValue);
      scan.close();

    }
}