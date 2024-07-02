import java.util.Scanner;
public class Commission {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sales of the month : ");
        float sales = sc.nextFloat();
        float comm;
        if(sales < 10000)
            comm = sales * 0.05f;
        else
            comm = sales * 0.10f;
        System.out.println("The commission for the month is "+comm);
    }
}
