import java.util.Scanner;
public class SumOfDigits{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any digits you want the sum of ");
        int num = sc.nextInt();
        int sum = 0;
        while(num != 0){
            int rem = num %10;
            sum+= rem;
            num/=10;
        }
        System.out.println("The sum of the digit is "+sum);
    }
}