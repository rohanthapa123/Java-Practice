import java.util.Scanner;
public class FirstnNatural {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter upto which you want a natural number");
        int num = sc.nextInt();
        int i,sum  = 0,prod=1;
        float average;
            for(i=1; i<= num; i++){
                System.out.print(i+" ");
                sum+=i;
                prod*=i;

            }
        average = sum/num;
        System.out.println("\nSum:"+sum + "\nProduct:"+prod + "\nAverage:"+average);
    }
}
