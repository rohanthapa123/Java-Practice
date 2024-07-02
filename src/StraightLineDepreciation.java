import java.util.Scanner;
public class StraightLineDepreciation {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the purchase price of the product: ");
        double purchase = sc.nextDouble();
        System.out.print("\nEnter the annual depreciation of the product: ");
        double depreciation = sc.nextDouble();
        System.out.print("\nEnter the year of service of the product: ");
        double year = sc.nextDouble();
        System.out.println("Salvage: "+ (purchase-(depreciation*year)) + " after " + year + "year");
    }
}
