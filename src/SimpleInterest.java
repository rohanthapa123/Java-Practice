import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principle Amount and Time in years.");
        float pa = sc.nextFloat();
        byte t = sc.nextByte();
        float interest;
        if(pa >= 100000)
            interest = pa * t * 7 / 100;
        else if(pa >= 50000)
            interest = pa * t * 5 / 100;
        else
            interest = pa * t * 3 / 100;
        System.out.println("The Interest is "+ interest);
    }
}
