import java.util.Scanner;
public class NetProfit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Gross Salary: ");
        float gross = sc.nextFloat();
        float tax,net;
        if(gross < 10000)
            tax = 0;
        else if(gross < 20000)
            tax = gross * 0.10f;
        else if(gross < 40000)
            tax = gross * 0.15f;
        else
            tax = gross * 0.20f;
        net = gross - tax;
        System.out.println("Net Salary :"+ net);
    }
}
