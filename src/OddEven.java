import java.util.Scanner;
public class OddEven {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number :");
        int num = sc.nextInt();
        if(num % 2 == 0)
            System.out.print("The given number is Even");
        else
            System.out.print("The given number is Odd");
    }
}
